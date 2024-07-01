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

@WebServlet("/Add_Dao")
public class Add_Dao {
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
		Connection conne = null;
		try {
			conne = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conne;
	}

	public String insert(Add_Member member) {
		loadDriver(dbdriver);
		Connection conne = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into elibrary.e_librarian values(?,?,?,?,?,?)";
		try {
			PreparedStatement pss = conne.prepareStatement(sql);
			pss.setString(1, member.getId());
			pss.setString(2, member.getStatus());
			pss.setString(3, member.getName());
			pss.setString(4, member.getPassword());
			pss.setString(5, member.getEmail());
			pss.setString(6, member.getMobile());//Status
			
			pss.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}

	public static List<Add_Member> view() {
		List<Add_Member> list = new ArrayList<Add_Member>();
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("select * from e_librarian");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Add_Member member = new Add_Member();
				member.setId(rs.getString("Id"));
				member.setStatus(rs.getString("Status"));
				member.setName(rs.getString("Name"));
				member.setPassword(rs.getString("Password"));
				member.setEmail(rs.getString("Email"));
				member.setMobile(rs.getString("Mobile"));
				

				list.add(member);
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}

	public static int delete(String Id) {
		int status = 0;
		try {
			Connection con = DB.getCon();
			PreparedStatement pss = con.prepareStatement("delete from e_librarian where Id=?");
			Add_Member member = new Add_Member();
			pss.setString(1, Id);
			status = pss.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static int update(Add_Member member) {
	    int status = 0;
	    try {
	        Connection con = DB.getCon();
	        PreparedStatement ps = con.prepareStatement("UPDATE elibrary.e_librarian SET Status=?, Name=?, Password=?, Email=?, Mobile=? WHERE Id=?");
	        
	        ps.setString(1, member.getStatus());
	        ps.setString(2, member.getName());     // Set Name parameter
	        ps.setString(3, member.getPassword()); // Set Password parameter
	        ps.setString(4, member.getEmail());    // Set Email parameter
	        ps.setString(5, member.getMobile());   // Set Mobile parameter
	        ps.setString(6, member.getId());          // Set Id parameter 
	       
	        
	        status = ps.executeUpdate(); // Execute the update query
	        con.close();

	    } catch (Exception e) {
	        e.printStackTrace(); // Print the stack trace for debugging purposes
	    }

	    return status;
	}

	public static Add_Member viewById(int Id){
		Add_Member member=new Add_Member();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from e_librarian where Id=?");
			ps.setInt(1,Id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				
				member.setId(rs.getString(1));
				member.setStatus(rs.getString(2));
				member.setName(rs.getString(3));
				member.setPassword(rs.getString(4));
				member.setEmail(rs.getString(5));
				member.setMobile(rs.getString(6));
				
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return member;
	}
//	public static int Approve(Add_Member_Approve member) {
//	    int status = 0;
//	    try {
//	        Connection con = DB.getCon();
//	        PreparedStatement ps = con.prepareStatement("UPDATE elibrary.e_librarian SET Approved=? WHERE Id=?");
//	    
//	        ps.setString(1, member.getId());     // Set Name parameter
//	        ps.setString(2, member.getApproved());          // Set Id parameter
//	        
//	        status = ps.executeUpdate(); // Execute the update query
//	        con.close();
//
//	    } catch (Exception e) {
//	        e.printStackTrace(); // Print the stack trace for debugging purposes
//	    }
//
//	    return status;
//	}
//	public static void updateApprovalStatus(String Id, String Approved) {
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        
//        try {
//            connection = DB.getCon(); // Replace with your connection setup
//            
//            String updateQuery = "UPDATE elibrary.e_librarian SET approved = ? WHERE Id = ?";
//            preparedStatement = connection.prepareStatement(updateQuery);
//            preparedStatement.setString(1, Approved);
//            preparedStatement.setString(2, Id);
//            
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace(); // Handle or log the exception properly
//        } finally {
//            // Close resources
//            if (preparedStatement != null) {
//                try {
//                    preparedStatement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}
