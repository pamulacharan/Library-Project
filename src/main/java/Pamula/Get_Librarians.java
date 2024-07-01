package Pamula;

import java.io.IOException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;
import java.util.List;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Get_Librarians")
public class Get_Librarians extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>"); 
		out.println("<head>");
		out.println("<title>View Librarians</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("#").include(request, response);
		
		out.println("<div class='container'>");
		{
		List<Add_Member> list=Add_Dao.view();
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Status</th><th>Id</th><th>Librarian Name</th><th>Password</th><th>Email</th><th>Mobile</th><th>Delete</th><th>Update</th></tr>");

		for(Add_Member member:list){
			out.println("<center><tr><td>"
		//+ "<a href='Approve.jsp?Id="+member.getApproved()
		//+"'>Approve </a></td>"
		//+"</td><td>"
		+member.getStatus()			//<th>Approved Status</th>
		+"</td><td>"
		+member.getId()
		+"</td><td>"
		+member.getName()
		+"</td><td>"
		+member.getPassword()
		+"</td><td>"
		+member.getEmail()
		+"</td><td>"
		+member.getMobile()
		+"</td><td>"
		+ "<a href='DeleteLibrarian?Id="+member.getId()
		+"'>Delete</a></td>"
		+"</td><td>"
		+ "<a href='update_librarian.jsp?Id="+member.getId() //update_librarian.jsp //UpdateLibrarian
		+"'>Update</a></td>"
		+ "</tr></center>");
		}
		out.println("</table>");
		out.println("</form>");
		out.println("</div>");
		}
		{
			out.println("<div class='container'>");
			
			List<Permit_Member> list=Permit_Dao.view();
			out.println("<table class='table table-bordered table-striped'>");
			out.println("<tr><th>Approval Status</th><th>User Name</th><th>Password</th><th>Delete</th></tr>");//<th>Update</th>

			for(Permit_Member member:list){
				out.println("<center><tr><td>"
			+member.getApproved()
			+"</td><td>"
			+member.getUsername()
			+"</td><td>"
			+member.getPassword()
			+"</td><td>"
			+ "<a href='Delete_Permit?Username="+member.getUsername()
			+"'>Delete</a></td>"
			//+"</td><td>"
			//+ "<a href='permit_librarian.html?Username="+member.getUsername() //update_librarian.jsp //UpdateLibrarian
			//+"'>Update</a></td>"
			+ "</tr></center>");
			}
			out.println("</table>");
			out.println("</form>");
			out.println("</div>");
			}
		//request.getRequestDispatcher("#footer.html").include(request, response);
		out.close();
	}
	
}
