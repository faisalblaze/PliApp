package com.servlet;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.PliDAO;
import com.db.DBConnect;

@WebServlet("/add_todo")
public class AddServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String fullname = req.getParameter("name");
		String course = req.getParameter("course");
		String status = req.getParameter("status");
		
		PliDAO pdao = new PliDAO(DBConnect.getConnect());
		
		boolean f = pdao.addPli(fullname, course, status);
		
		HttpSession session = req.getSession();
		
		
		if(f)
		{
			session.setAttribute("sucMsg", "Pli data added successfully");
//			System.out.println("Data Insert Successfully");
			resp.sendRedirect("homepage.jsp");
		}
			
		else
		{
			session.setAttribute("failMsg", "Pli data failed .....");
			resp.sendRedirect("homepage.jsp");
		}
			
	}
	
	

}
