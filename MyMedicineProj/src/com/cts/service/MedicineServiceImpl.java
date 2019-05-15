package com.cts.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;







import com.cts.dao.MedicineDaoImpl;
import com.cts.model.Medicine;



public class MedicineServiceImpl  implements MedicineService{
	
	MedicineDaoImpl medicineDaoImpl;
	public MedicineServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public MedicineServiceImpl(String jdbcDriver, String jdbcURL, String jdbcUsername, String jdbcPassword){
		medicineDaoImpl = new MedicineDaoImpl(jdbcDriver, jdbcURL, jdbcUsername, jdbcPassword);
		/*System.out.println("BookServiceImpl values");
		System.out.println(jdbcDriver);
		System.out.println(jdbcURL);
		System.out.println(jdbcUsername);
		System.out.println(jdbcPassword);
		System.out.println("----------------------------------------");*/
	}
	

	@Override
	public void getshowLogin(HttpServletRequest request,
			HttpServletResponse response) throws SQLException,
			ServletException, IOException {
		
		String userName = request.getParameter("username");
		String password= request.getParameter("password");
		boolean validUser = medicineDaoImpl.loginMedi(userName, password);
		
		if(validUser){
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("list");
			dispatcher.forward(request, response);
		}else{
			System.out.println("in ifelse");
			response.sendRedirect("login.jsp");
		}
		
	}


	

	@Override
	public void showEditForm(HttpServletRequest request,
			HttpServletResponse response) throws SQLException,
			ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyBook(HttpServletRequest request,
			HttpServletResponse response) throws SQLException,
			ServletException, IOException {
		
	}

	@Override
	public void showAddForm(HttpServletRequest request,
			HttpServletResponse response) throws SQLException,
			ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("add-medicine.jsp");
		dispatcher.forward(request, response);
		
	}

	@Override
	public void addMedicine(HttpServletRequest request,
			HttpServletResponse response) throws SQLException,
			ServletException, IOException {
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String unitValue = request.getParameter("unitValue");
		double price = Double.parseDouble(request.getParameter("price"));
		/*String expiryDate = request.getParameter("expiryDate");*/
		String inStock = request.getParameter("inStock");
		
		Medicine medicine = new Medicine(name, type, unitValue,price,inStock);
		medicineDaoImpl.addMedicine(medicine);
		response.sendRedirect("list");
		
	}

	@Override
	public void getAllMedicines(HttpServletRequest request,
			HttpServletResponse response) throws SQLException,
			ServletException, IOException {
		List<Medicine> medicineList = medicineDaoImpl.listAllMedicines();
		request.setAttribute("listmedicine", medicineList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("search.jsp");
		dispatcher.forward(request, response);
		
	}

	public void insertMedicine(HttpServletRequest request,
			HttpServletResponse response) {
        try {
            
            
            String name=request.getParameter("name");
            String type=request.getParameter("type");
            String unitValue=request.getParameter("unitValue");
            String unit=request.getParameter("unit");
            double price = Double.parseDouble(request.getParameter("price"));
            String inStock=request.getParameter("inStock");
            System.out.println(request.getParameter("name"));
            System.out.println(request.getParameter("type"));
            System.out.println(request.getParameter("unitValue"));
            System.out.println(request.getParameter("unit"));
            System.out.println(request.getParameter("price"));
            System.out.println(request.getParameter("inStock"));
            
            Medicine medicine = new Medicine(name,type,unitValue,unit,price,inStock);
            
      
            
           /* boolean check=medicineDaoImpl.insertMedicine(medicine);
            if(check){
                  response.sendRedirect("list");
            }*/
            
            
            
      } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
      }

		
	}

	@Override
	public void showLoginForm(HttpServletRequest request,
			HttpServletResponse response) throws SQLException,
			ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}
}
