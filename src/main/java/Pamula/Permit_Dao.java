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
@WebServlet("/Permit_Dao")
public class Permit_Dao {
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
	public static List<Permit_Member> view() {
		List<Permit_Member> list = new ArrayList<Permit_Member>();
		try {
			Connection con=DB.getCon();
			PreparedStatement pre = con.prepareStatement("select * from login");
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
				Permit_Member member = new Permit_Member();
				
				member.setUsername(rs.getString("Username"));
				member.setPassword(rs.getString("Password"));
				member.setApproved(rs.getString("Approved"));

				list.add(member);
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}
	
	public static Permit_Member viewByUsername(String Username){
		Permit_Member member=new Permit_Member();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from login where username=?");
			ps.setString(1,Username);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				member.setApproved(rs.getString(1));
				member.setUsername(rs.getString(2));
				member.setPassword(rs.getString(3));
				
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return member;
	}
	public static int delete(String Username) {
		int status = 0;
		try {
			Connection con = DB.getCon();
			PreparedStatement pss = con.prepareStatement("delete from login where Username=?");
			Permit_Member member = new Permit_Member();
			pss.setString(1, Username);
			status = pss.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}
	
}
