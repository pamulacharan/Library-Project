package Pamula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

@WebServlet("/AddBook_Dao")
public class AddBook_Dao {
	private String dburl = "jdbc:mysql://localhost:3306/elibrary";
	private String dbuname = "root";
	private String dbpassword = "Charan@#1998";
	private String dbdriver = "com.mysql.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public String insert(AddBook_Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into elibrary.add_book values(?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getBook_Number());
			ps.setString(2, member.getBook_Name());
			ps.setString(3, member.getAuthor());
			ps.setString(4, member.getPublisher());
			ps.setString(5, member.getQuantity());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}

	public static List<AddBook_Member> view() {
		List<AddBook_Member> list = new ArrayList<AddBook_Member>();
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("select * from add_book");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AddBook_Member member = new AddBook_Member();
				member.setBook_Number(rs.getString("Book_Number"));
				member.setBook_Name(rs.getString("Book_Name"));
				member.setAuthor(rs.getString("Author"));
				member.setPublisher(rs.getString("Publisher"));
				member.setQuantity(rs.getString("Quantity"));

				list.add(member);
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}

	public static int delete(String Book_Number) {
		int status = 0;
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("delete from add_book where Book_Number=?");
			AddBook_Member member = new AddBook_Member();
			ps.setString(1, Book_Number);
			status = ps.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static int update(AddBook_Member member) {
		int status = 0;
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement(
					"UPDATE elibrary.add_book SET Book_Name=?, Author=?, Publisher=?, Quantity=? WHERE Book_Number=?");
			
			ps.setString(1, member.getBook_Name()); // Set Book_Name parameter
			ps.setString(2, member.getAuthor()); // Set Author parameter
			ps.setString(3, member.getPublisher()); // Set Publisher parameter
			ps.setString(4, member.getQuantity()); // Set Quantity parameter
			ps.setString(5, member.getBook_Number()); // Set Book_Number parameter

			status = ps.executeUpdate(); // Execute the update query
			con.close();

		} catch (Exception e) {
			e.printStackTrace(); // Print the stack trace for debugging purposes
		}

		return status;
	}
}