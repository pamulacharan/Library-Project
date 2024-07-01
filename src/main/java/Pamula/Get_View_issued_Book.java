package Pamula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get_View_issued_Book")
public class Get_View_issued_Book extends HttpServlet {
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
		
		List<Issue_Book_Member> list=Issue_BookDao.view();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Book Number</th><th>Student Id</th><th>Student Name</th><th>Student Mobile</th><th>Issue Data</th></tr>");//<th>Delete</th> <th>Update</th>
		for(Issue_Book_Member member:list){
			out.println("<center><tr><td>"
		+member.getBook_Number_2()
		+"</td><td>"
		+member.getId_2()
		+"</td><td>"
		+member.getName_2()
		+"</td><td>"
		+member.getMobile_2()
		+"</td><td>"
		+member.getIssue_Date_2()
		//+"</td><td>"
		//+ "<a href='Delete_View_issued_Book?Book_Number_2="
		//+member.getBook_Number_2()
		//+"'>Delete</a></td>"
		//+"</td><td>"
		//+"<a href='Update_Issue_Book.jsp?Book_Number_2="
		//+member.getBook_Number_2()
		//+"'>Update</a></td>"
		+"</tr></center>");
		}
		out.println("</table>");
		
		out.println("</div>");
		
		
		//request.getRequestDispatcher("#footer.html").include(request, response);
		out.close();
	}
}