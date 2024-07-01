package Pamula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get_Librarians_ReturnBooks")
public class Get_Librarians_ReturnBooks extends HttpServlet {
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
		
		
		
		out.println("<h1>View My Students Return Books</h1>"+"<h6>Student return books will be shown hear, Admin has to give verification ...<a href=\"admin_return_book.html\" >hear</a></h6>");//admin_return_book.html         
		out.println("<div class='container'>");
		
		
		List<ReturnFrom_Librarian_Issue_Member> list=ReturnFrom_Librarian_Issue_Dao.view();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Book Number</th><th>Student Id</th><th>Student Name</th><th>Student Mobile</th><th>Issue Data</th><th>Return Data</th></tr>");
		for(ReturnFrom_Librarian_Issue_Member member:list){
			out.println("<center><tr><td>"
		+member.getBook_Number_3()
		+"</td><td>"
		+member.getId_3()
		+"</td><td>"
		+member.getName_3()
		+"</td><td>"
		+member.getMobile_3()
		+"</td><td>"
		+member.getIssue_Date_3()
		+"</td><td>"
		+member.getReturn_Date_3()
		//+"</td><td>"
		//+ "<a href='DeleteReturnBook?Book_Number_3="+member.getBook_Number_3()
		//+"'>Delete</a></td>"
		+"</tr></center>");
		}
		out.println("</table>");
		
		out.println("</div>");	
		//request.getRequestDispatcher("#footer.html").include(request, response);
		out.close();
	}
}