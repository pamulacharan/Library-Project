package Pamula;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get")

public class Get extends HttpServlet {
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
		
		out.println("<div class='container'>");
		
		List<AddBook_Member> list=AddBook_Dao.view();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Book Number</th><th>Book Name</th><th>Author</th><th>Publisher</th><th>Quantity</th><th>Delete</th><th>Update</th></tr>");
		for(AddBook_Member member:list){
			out.println("<left>"
					+ "<tr><td>"
					+member.getBook_Number()
					+"</td><td>"
					+member.getBook_Name()
					+"</td><td>"
					+member.getAuthor()
					+"</td><td>"
					+member.getPublisher()
					+"</td><td>"
					+member.getQuantity()
					+"</td><td>"
					+ "<a href='DeleteBook?Book_Number="
					+member.getBook_Number()
					+"'>Delete</a></td>"
					+"</td><td>"
					+"<a href='UpdateBook.jsp?Book_Number="
					+member.getBook_Number()
					+"'>Update</a></td>"
					+ "</tr></left>");
		}
		out.println("</table>");
		
		out.println("</div>");
		
		
		//request.getRequestDispatcher("#footer.html").include(request, response);
		out.close();
	}
}

//
//
//public class Get extends HttpServlet {
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		String url = "jdbc:mysql://localhost:3306/elibrary";
//		String username = "root";
//		String password = "Charan@#1998";
//
//		try {
//			// Register the MySQL JDBC driver
//			Class.forName("com.mysql.jdbc.Driver");
//
//			// Create a connection to the database
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/elibrary", "root",
//					"Charan@#1998");
//
//			// Execute a query to fetch the table data
//			Statement statement = connection.createStatement();
//			String query = "SELECT * FROM e_librarian";
//			ResultSet resultSet = statement.executeQuery(query);
//
//			// Retrieve the metadata to get the column names
//			ResultSetMetaData metaData = resultSet.getMetaData();
//			int columnCount = metaData.getColumnCount();
//
//			// Print column names
//			for (int i = 1; i <= columnCount; i++) {
//				System.out.print(metaData.getColumnName(i) + "\t");
//			}
//			System.out.println();
//
//			// Print table data
//			while (resultSet.next()) {
//				for (int i = 1; i <= columnCount; i++) {
//					System.out.print(resultSet.getString(i) + "\t");
//				}
//				System.out.println("\t");
//			}
//
//			// Close the database connection and release resources
//			resultSet.close();
//			statement.close();
//			connection.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
