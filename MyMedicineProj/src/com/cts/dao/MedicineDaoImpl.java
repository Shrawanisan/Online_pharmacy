package com.cts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.model.LoginModel;
import com.cts.model.Medicine;

public class MedicineDaoImpl implements MedicineDao {
	String jdbcDriver;
	String jdbcURL;
	String jdbcUsername;
	String jdbcPassword;

	Connection jdbcConnection;
	LoginModel loginModel;

	public MedicineDaoImpl() {
		super();
	}

	public MedicineDaoImpl(String jdbcDriver, String jdbcURL,
			String jdbcUsername, String jdbcPassword) {
		this.jdbcDriver = jdbcDriver;
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	@Override
	public boolean loginMedi(String userName, String password)
			throws SQLException {
		connect();
		boolean loginSuccess = false;
		String loginQuery = "select * from login where username=? and password=?;";
		PreparedStatement statement = jdbcConnection
				.prepareStatement(loginQuery);
		statement.setString(1, userName);
		statement.setString(2, password);
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			loginSuccess = true;

			loginModel = new LoginModel();
			loginModel.setUsername(resultSet.getString("username"));
			loginModel.setPassword(resultSet.getString("password"));
		}
		return loginSuccess;
	}

	@Override
	public void connect(){
		try {
			if(jdbcConnection==null || jdbcConnection.isClosed()){
				Class.forName(jdbcDriver);
				jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				//System.out.println(jdbcConnection);
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

	public  List<Medicine> listAllMedicines() {
		List<Medicine> medicineList = new ArrayList<>();
		try {
			Medicine medicine;

			
			String selectQuery = "select * from medicine";
			PreparedStatement statement = jdbcConnection
					.prepareStatement(selectQuery);
			ResultSet resultSet = statement.executeQuery(selectQuery);
			while (resultSet.next()) {
			
				medicine = new Medicine();
				medicine.setId(resultSet.getString("id"));
				medicine.setName(resultSet.getString("name"));
				medicine.setType(resultSet.getString("type"));
				medicine.setUnitValue(resultSet.getString("unitValue"));
				medicine.setUnit(resultSet.getString("unit"));
				medicine.setPrice(resultSet.getDouble("price"));
				medicine.setInStock(resultSet.getString("inStock"));
				medicineList.add(medicine);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("My List"+ medicineList);
			// TODO: handle exception
		}
		
		return medicineList;
	}

	public void addMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertMedicine(Medicine medicine) throws SQLException {
		connect();
        System.out.println(medicine.getName());
        System.out.println(medicine.getType());
        System.out.println(medicine.getUnitValue());
        System.out.println(medicine.getUnit());
        System.out.println(medicine.getPrice());
        System.out.println(medicine.getInStock());
        String insert = "insert into medicine(name,type,unitValue,unit,price,inStock) values(?,?,?,?,?,?)";
        PreparedStatement statement = jdbcConnection.prepareStatement(insert);
        statement.setString(1, medicine.getName());
        statement.setString(2, medicine.getType());
        statement.setString(3, medicine.getUnitValue());
        statement.setString(4, medicine.getUnit());
        statement.setDouble(5, medicine.getPrice());
        statement.setString(6, medicine.getInStock());

        boolean rows = statement.executeUpdate() > 0;
        return rows;

	}



}
