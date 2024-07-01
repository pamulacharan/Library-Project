package Pamula;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Issue_Book
 */
	@WebServlet("/ReturnFrom_Admin_Issue_Book")
public class ReturnFrom_Admin_Issue_Book extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReturnFrom_Admin_Issue_Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Book_number = request.getParameter("Book_number");
		String Id = request.getParameter("Id");
		String Name = request.getParameter("Name");
		String Mobile = request.getParameter("Mobile");
		String Date = request.getParameter("Date");//Return_date
		String Return_date = request.getParameter("Return_date");
		ReturnFrom_Admin_Issue_Member member = new ReturnFrom_Admin_Issue_Member(Book_number, Id, Name, Mobile, Date, Return_date);
		ReturnFrom_Admin_Issue_Dao rDao = new ReturnFrom_Admin_Issue_Dao();
		String result = rDao.insert(member);
		response.getWriter().print(result);
	}

}