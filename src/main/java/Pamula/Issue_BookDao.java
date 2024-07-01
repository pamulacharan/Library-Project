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
@WebServlet("/Issue_BookDao")
public class Issue_BookDao {
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
	public String insert(Issue_Book_Member member) {
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Data entered successfully";
		String sql="insert into elibrary.issuebook values(?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, member.getBook_Number_2());
			ps.setString(2, member.getId_2());
			ps.setString(3, member.getName_2());
			ps.setString(4, member.getMobile_2());
			ps.setString(5, member.getIssue_Date_2());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
		}
		return result;
	}
	public static List<Issue_Book_Member> view(){
		List<Issue_Book_Member> list=new ArrayList<Issue_Book_Member>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from issuebook");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Issue_Book_Member member=new Issue_Book_Member();
				member.setBook_Number_2(rs.getString("Book_Number_2"));
				member.setId_2(rs.getString("Id_2"));
				member.setName_2(rs.getString("Name_2"));
				member.setMobile_2(rs.getString("Mobile_2"));
				member.setIssue_Date_2(rs.getString("Issue_Date_2"));
				
				list.add(member);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
	public static int delete(String Book_Number_2){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement pss=con.prepareStatement("delete from issuebook where Book_Number_2=?");
			Issue_Book_Member member=new Issue_Book_Member();
			pss.setString(1, Book_Number_2);
			status=pss.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	public static int update(Issue_Book_Member member) {//Issue_Book_Member
		int status = 0;
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement(
					"UPDATE elibrary.issuebook SET Id_2=?, Name_2=?, Mobile_2=?, Issue_Date_2=? WHERE Book_Number_2=?");
			
			
			ps.setString(1, member.getId_2()); // Set id parameter
			ps.setString(2, member.getName_2()); // Set name parameter
			ps.setString(3, member.getMobile_2()); // Set mobile parameter
			ps.setString(4, member.getIssue_Date_2()); // Set Issue_Date_2 parameter
			ps.setString(5, member.getBook_Number_2()); // Set Book_Name parameter

			status = ps.executeUpdate(); // Execute the update query
			con.close();

		} catch (Exception e) {
			e.printStackTrace(); // Print the stack trace for debugging purposes
		}

		return status;
	}
}
