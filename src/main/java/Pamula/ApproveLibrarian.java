//package Pamula;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//@WebServlet("/ApproveLibrarian")
//public class ApproveLibrarian extends HttpServlet {
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String Id=request.getParameter("Id");// Add_Member_Approve.java 
//		String Approved = request.getParameter("Approved");
//		Add_Member_Approve member=new Add_Member_Approve(Id, Approved);
//		Add_Dao.Approve(member);
//		response.sendRedirect("Get_Librarians");//Get_Librarians	//AddLibrarian 
//	}
//
//}