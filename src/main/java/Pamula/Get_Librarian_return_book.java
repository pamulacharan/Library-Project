package Pamula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get_Librarian_return_book")
public class Get_Librarian_return_book extends HttpServlet {
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
		
		
		
		out.println("<h1>View My Taken Books</h1>");
		out.println("<div class='container'>");
		
		List<Issue_Book_Member> list=Issue_BookDao.view();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Book Number</th><th>Student Id</th><th>Student Name</th><th>Student Mobile</th><th>Issue Data</th></tr>");
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
		+"</tr></center>");
		}
		out.println("</table>");
		
		out.println("</div>");
		
		
		
		out.println("<div class='container'>");
		List<ReturnFrom_Admin_Issue_Member> list1=ReturnFrom_Admin_Issue_Dao.view();
		
		out.println("<h1>View My Return Books</h1>"+"<h6>(If Student returend the book Succesfully than it is waiting for Admin conformation, Once if it is conforme the returned book will be shown hear)</h6>");
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Book Number</th><th>Student Id</th><th>Student Name</th><th>Student Mobile</th><th>Issue Data</th><th>Return Data</th></tr>");
		for(ReturnFrom_Admin_Issue_Member member:list1){
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
	/*	+"</td><td>"
		+ "<a href='DeleteBook?callno="
		+member.getBook_number()
		+"'>Delete</a></td>"
		+"</td><td>"
		+"<a href='UpdateBook?callno="
		+member.getBook_number()
		+"'>Update</a></td>"
	*/
		+"</tr></center>");
		}
		out.println("</table>");
		
		out.println("</div>");
		
		
		//request.getRequestDispatcher("#footer.html").include(request, response);
		out.close();
	}
}