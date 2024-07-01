package Pamula;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateLibrarian")
public class UpdateLibrarian extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Id=request.getParameter("Id");// Add_Member.java 
		String Status=request.getParameter("Status");
		String Name=request.getParameter("Name");
		String Password=request.getParameter("Password");
		String Email=request.getParameter("Email");
		String Mobile=request.getParameter("Mobile");
		
		Add_Member member=new Add_Member(Id, Status, Name, Password, Email, Mobile);
		Add_Dao.update(member);
		response.sendRedirect("Get_Librarians");//Get_Librarians	//AddLibrarian 
	}

}