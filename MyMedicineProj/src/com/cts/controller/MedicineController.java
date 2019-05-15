package com.cts.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.service.MedicineServiceImpl;



@WebServlet("/")
public class MedicineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MedicineController() {
        super();
        
    }
    MedicineServiceImpl medicineServiceImpl;
  	public void init() throws ServletException {
  		String jdbcDriver = getServletContext().getInitParameter("jdbcDriver");
  		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
  		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
  		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
  		medicineServiceImpl = new MedicineServiceImpl(jdbcDriver, jdbcURL, jdbcUsername, jdbcPassword);
  	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String action = request.getServletPath();
			switch(action){
			
			case "/login":
				medicineServiceImpl.getshowLogin(request, response);
				break;
				
			case "/new":
				medicineServiceImpl.showAddForm(request, response);
				break;
				
			case "/add":
				medicineServiceImpl.addMedicine(request, response);
				break;
				
			case "/insert":
				medicineServiceImpl.insertMedicine(request, response);
				break;
				
			case "/list":
				medicineServiceImpl.getAllMedicines(request, response);
				break;
				
			case "/edit":
				//System.out.println(action);
				medicineServiceImpl.showEditForm(request, response);
				break;
				
			case "/update":
				medicineServiceImpl.modifyBook(request, response);
				break;
				
			default:
				medicineServiceImpl.showLoginForm(request, response);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}

			
			
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
