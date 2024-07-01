package Pamula;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/View_ReturnBook_LibrarianLoginServlet")
public class View_ReturnBook_LibrarianLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
//  /**
//   * @see HttpServlet#HttpServlet()
//   */
//  public LoginServlet() {
//      super();
//      // TODO Auto-generated constructor stub
//  }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elibrary","root","Charan@#1998");
			//String id = request.getParameter("textName");
			String name = request.getParameter("textName");
			String password = request.getParameter("textpwd");
			PreparedStatement pst = con.prepareStatement("SELECT * FROM e_librarian WHERE Name=? AND Password=?");
			/***
			 charan	Charan@1998
			 pamula	Charan@1998
			 */
			//pst.setString(1, id);
			pst.setString(1, name);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				response.sendRedirect("Get_Librarian_return_book");
			} else {
				response.sendRedirect("Error_view.jsp");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}