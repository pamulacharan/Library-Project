package Pamula;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ApproveLibrarians")
public class ApproveLibrariansServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String originalHtml = request.getParameter("htmlContent");

        String editedHtml = "<p>" + originalHtml + " (Edited)</p>";

        // JDBC connection setup
        try (Connection connection = DB.getCon()) {
            // SQL INSERT statement
            String sql = "INSERT INTO elibrary.e_librarian (html_content_column) VALUES (?)";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, editedHtml);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}