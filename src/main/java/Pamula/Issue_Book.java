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
@WebServlet("/Issue_Book")
public class Issue_Book extends HttpServlet {
	private static final long serialVersionUId_2 = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Issue_Book() {
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
	 */// Book_Number_2 Id_2 Name_2 Mobile_2 Issue_Issue_Date_2
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Book_Number_2 = request.getParameter("Book_Number_2");
		String Id_2 = request.getParameter("Id_2");
		String Name_2 = request.getParameter("Name_2");
		String Mobile_2 = request.getParameter("Mobile_2");
		String Issue_Date_2 = request.getParameter("Issue_Date_2");
		Issue_Book_Member member = new Issue_Book_Member(Book_Number_2, Id_2, Name_2, Mobile_2, Issue_Date_2);
		Issue_BookDao rDao = new Issue_BookDao();
		String result = rDao.insert(member);
		response.getWriter().print(result);
	}

}