package com.cts.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.model.Medicine;

public interface MedicineDao {
	void connect() throws SQLException;
	boolean loginMedi(String userName, String password) throws SQLException;
	List<Medicine> medicineList = new ArrayList<>();
	boolean insertMedicine(Medicine medicine) throws SQLException;
}
