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
@WebServlet("/ReturnFrom_Admin_Issue_Dao")
public class ReturnFrom_Admin_Issue_Dao {
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
	public String insert(ReturnFrom_Admin_Issue_Member member) {
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Data entered successfully";
		String sql="insert into elibrary.admin_return_book values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, member.getBook_number());
			ps.setString(2, member.getId());
			ps.setString(3, member.getName());
			ps.setString(4, member.getMobile());
			ps.setString(5, member.getDate());//Return_date
			ps.setString(6, member.getReturn_date());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
		}
		return result;
	}
	public static List<ReturnFrom_Admin_Issue_Member> view(){
		List<ReturnFrom_Admin_Issue_Member> list=new ArrayList<ReturnFrom_Admin_Issue_Member>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from admin_return_book");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ReturnFrom_Admin_Issue_Member member=new ReturnFrom_Admin_Issue_Member();
				member.setBook_number(rs.getString("Book_number"));
				member.setId(rs.getString("Id"));
				member.setName(rs.getString("Name"));
				member.setMobile(rs.getString("Mobile"));
				member.setDate(rs.getString("Date"));//Return_date
				member.setReturn_date(rs.getString("Return_date"));
				list.add(member);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
	public static int delete(String Book_number){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement pss=con.prepareStatement("delete from admin_return_book where Book_number=?");
			ReturnFrom_Admin_Issue_Member member=new ReturnFrom_Admin_Issue_Member();
			pss.setString(1, Book_number);
			status=pss.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
}