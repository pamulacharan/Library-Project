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
@WebServlet("/Get_Permit")
public class Get_Permit extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Permit Librarians</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("#").include(request, response);
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
