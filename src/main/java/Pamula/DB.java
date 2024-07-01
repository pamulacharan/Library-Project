package Pamula;

import java.sql.*;

public class DB {
public static Connection getCon(){
	
	Connection con=null;
	
	try{
		Class.forName("com.mysql.jdbc.Driver");//com.mysql.jdbc.Driver//oracle.jdbc.driver.OracleDriver
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elibrary","root","Charan@#1998");
		
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
