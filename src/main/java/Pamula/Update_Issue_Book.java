package Pamula;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Update_Issue_Book")
public class Update_Issue_Book extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Book_Number_2=request.getParameter("Book_Number_2");// 
		String Id_2=request.getParameter("Id_2");
		String Name_2=request.getParameter("Name_2");
		String Mobile_2=request.getParameter("Mobile_2");
		String Issue_Date_2=request.getParameter("Issue_Date_2");
		Issue_Book_Member member=new Issue_Book_Member(Book_Number_2, Id_2, Name_2, Mobile_2, Issue_Date_2);
		Issue_BookDao.update(member);
		response.sendRedirect("Get_View_issued_Book");//
	}

}