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

@WebServlet("/del_todo")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int id  = Integer.parseInt(req.getParameter("txtid"));
		
		PliDAO pdao = new PliDAO(DBConnect.getConnect());
		
		
		
		PliDtls pd = new PliDtls();
		pd.setId(id);
		
		boolean f = pdao.deletePli(pd);
		HttpSession session =  req.getSession();
		
		
		if(f)
		{
			session.setAttribute("sucMsg", "Pli data Deleted successfully");
			resp.sendRedirect("homepage.jsp");
		}
			
		else
		{
			session.setAttribute("failMsg", "Pli Deleted failed .....");
			resp.sendRedirect("homepage.jsp");
		}
			
	}
	
	

}
