package Pamula;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname@gmail.com");
		String pass = request.getParameter("pass");
		if(uname.equals("uname@gmail.com") && pass.equals("pass"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("Name", uname);
			response.sendRedirect("AdminSucess.jsp");
		}
		else {
			response.sendRedirect("Error_admin.jsp");
		}
	}
}
