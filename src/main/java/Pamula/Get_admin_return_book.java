package Pamula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get_admin_return_book")
public class Get_admin_return_book extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>View Book</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("#").include(request, response);
		
		out.println("<div class='container'>");
		
		List<ReturnFrom_Admin_Issue_Member> list=ReturnFrom_Admin_Issue_Dao.view();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Book Number</th><th>Student Id</th><th>Student Name</th><th>Student Mobile</th><th>Issue Data</th><th>Return Data</th><th>Delete</th></tr>");//<th>Update</th>
		for(ReturnFrom_Admin_Issue_Member member:list){
			out.println("<center><tr><td>"
		+member.getBook_number()
		+"</td><td>"
		+member.getId()
		+"</td><td>"
		+member.getName()
		+"</td><td>"
		+member.getMobile()
		+"</td><td>"
		+member.getDate()
		+"</td><td>"
		+member.getReturn_date()
		+"</td><td>"
		+ "<a href='DeleteAdminBook?Book_number="
		+member.getBook_number()
		+"'>Delete</a></td>"
		//+"</td><td>"
		//+"<a href='UpdateAdminBook.jsp?Book_number="
		//+member.getBook_number()
		//+"'>Update</a></td>"
		+"</tr></center>");
		}
		out.println("</table>");
		
		out.println("</div>");
		
		
		//request.getRequestDispatcher("#footer.html").include(request, response);
		out.close();
	}
}