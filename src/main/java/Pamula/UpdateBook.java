package Pamula;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/UpdateBook")
public class UpdateBook extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Book_Number=request.getParameter("Book_Number");// 
		String Book_Name=request.getParameter("Book_Name");
		String Author=request.getParameter("Author");
		String Publisher=request.getParameter("Publisher");
		String Quantity=request.getParameter("Quantity");
		AddBook_Member member=new AddBook_Member(Book_Number, Book_Name, Author, Publisher, Quantity);
		AddBook_Dao.update(member);
		response.sendRedirect("Get");//
	}

}