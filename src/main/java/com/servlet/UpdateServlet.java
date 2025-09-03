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
import com.entity.PliDtls;

@WebServlet("/update_course")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int id  = Integer.parseInt(req.getParameter("txtid"));
		String fullname = req.getParameter("name");
		String course = req.getParameter("course");
		String status = req.getParameter("status");
		
		PliDAO pdao = new PliDAO(DBConnect.getConnect());
		PliDtls pd = new PliDtls();
		pd.setId(id);
		pd.setFname(fullname);
		pd.setCourse(course);
		pd.setStatus(status);
		
		
		boolean f = pdao.updatePli(pd);
		HttpSession session =  req.getSession();
		
		
		if(f)
		{
			session.setAttribute("sucMsg", "Pli data Updated successfully");
			resp.sendRedirect("homepage.jsp");
		}
			
		else
		{
			session.setAttribute("failMsg", "Pli update failed .....");
			resp.sendRedirect("homepage.jsp");
		}
			
	}
	
	

}
