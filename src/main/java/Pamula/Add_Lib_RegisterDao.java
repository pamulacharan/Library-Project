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
@WebServlet("/Add_Lib_RegisterDao")
public class Add_Lib_RegisterDao {
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
	public String insert(Add_Lib_Member member) {
		loadDriver(dbdriver);
		Connection connec=getConnection();
		String result="Data entered successfully";
		String sql="insert into elibrary.login values(?,?,?)";
		try {
			PreparedStatement pre=connec.prepareStatement(sql);
			pre.setString(1, member.getName_1());
			pre.setString(2, member.getPassword_1());
			pre.setString(3, member.getApproved_1());
			pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
		}
		return result;
	}
	public static List<Add_Lib_Member> view() {
		List<Add_Lib_Member> list = new ArrayList<Add_Lib_Member>();
		try {
			Connection con=DB.getCon();
			PreparedStatement pre = con.prepareStatement("select * from login");
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
				Add_Lib_Member member = new Add_Lib_Member();
				
				member.setName_1(rs.getString("Name_1"));
				member.setPassword_1(rs.getString("Password_1"));
				member.setApproved_1(rs.getString("Approved_1"));

				list.add(member);
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}
	
	public static Add_Lib_Member viewByName_1(String Name_1){
		Add_Lib_Member member=new Add_Lib_Member();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from login where Name_1=?");
			ps.setString(1,Name_1);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				member.setName_1(rs.getString(1));
				member.setPassword_1(rs.getString(2));
				member.setApproved_1(rs.getString(3));
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return member;
	}
	
}
