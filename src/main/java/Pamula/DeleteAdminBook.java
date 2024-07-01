package Pamula;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteAdminBook")
public class DeleteAdminBook extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReturnFrom_Admin_Issue_Dao.delete(request.getParameter("Book_number"));
		response.sendRedirect("Get_admin_return_book");
	}
}
