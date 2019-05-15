package com.cts.service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MedicineService {
	void getAllMedicines(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException ;
	void getshowLogin(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException ;
	void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException ;
	void showLoginForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException ;
	void modifyBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException ;
	void showAddForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException ;
	void addMedicine(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException ;
	void insertMedicine(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException ;
}
