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
@WebServlet("/ReturnFrom_Librarian_Issue_Dao")
public class ReturnFrom_Librarian_Issue_Dao {
	private String dburl="jdbc:mysql://localhost:3306/elibrary";
	private String dbuname="root";
	private String dbpassword="Charan@#1998";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(dburl,dbuname,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public String insert(ReturnFrom_Librarian_Issue_Member member) {
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Data entered successfully";
		String sql="insert into elibrary.librarian_return_book values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, member.getBook_Number_3());
			ps.setString(2, member.getId_3());
			ps.setString(3, member.getName_3());
			ps.setString(4, member.getMobile_3());
			ps.setString(5, member.getIssue_Date_3());
			ps.setString(6, member.getReturn_Date_3());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
		}
		return result;
	}
	public static List<ReturnFrom_Librarian_Issue_Member> view(){
		List<ReturnFrom_Librarian_Issue_Member> list=new ArrayList<ReturnFrom_Librarian_Issue_Member>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from librarian_return_book");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ReturnFrom_Librarian_Issue_Member member=new ReturnFrom_Librarian_Issue_Member();
				member.setBook_Number_3(rs.getString("Book_Number_3"));
				member.setId_3(rs.getString("Id_3"));
				member.setName_3(rs.getString("Name_3"));
				member.setMobile_3(rs.getString("Mobile_3"));//Return_date
				member.setIssue_Date_3(rs.getString("Issue_Date_3"));
				member.setReturn_Date_3(rs.getString("Return_Date_3"));
				list.add(member);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
	public static int delete(String Book_Number_3, String Id_3) {
		int status = 0;
		try {
			Connection con = DB.getCon();
			PreparedStatement pss = con.prepareStatement("delete from librarian_return_book where Book_Number_3=? AND Id_3=?");
			ReturnFrom_Librarian_Issue_Member member = new ReturnFrom_Librarian_Issue_Member();
			pss.setString(1, Book_Number_3);
			pss.setString(2, Id_3);
			status = pss.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}
	
}