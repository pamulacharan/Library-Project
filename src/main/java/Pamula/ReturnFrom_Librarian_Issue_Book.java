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
@WebServlet("/ReturnFrom_Librarian_Issue_Book")
public class ReturnFrom_Librarian_Issue_Book extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReturnFrom_Librarian_Issue_Book() {
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
		String Book_Number_3 = request.getParameter("Book_Number_3");
		String Id_3 = request.getParameter("Id_3");
		String Name_3 = request.getParameter("Name_3");
		String Mobile_3 = request.getParameter("Mobile_3");
		String Issue_Date_3 = request.getParameter("Issue_Date_3");//Return_date
		String Return_Date_3 = request.getParameter("Return_Date_3");
		ReturnFrom_Librarian_Issue_Member member = new ReturnFrom_Librarian_Issue_Member(Book_Number_3, Id_3, Name_3, Mobile_3, Issue_Date_3, Return_Date_3);
		ReturnFrom_Librarian_Issue_Dao rDao = new ReturnFrom_Librarian_Issue_Dao();
		String result = rDao.insert(member);
		response.getWriter().print(result);
		
		ReturnFrom_Librarian_Issue_Dao.delete(request.getParameter("Book_Number_3"),request.getParameter("Id_3"));
		response.sendRedirect("Get_Librarians_ReturnBooks");
	}
	

}