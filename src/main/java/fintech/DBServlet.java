package com.fintech;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class DBServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://db:3306/fintech",
                "user1",
                "pass123"
            );

            Statement stmt = con.createStatement();

            // 1. Create table
            stmt.executeUpdate(
                "CREATE TABLE IF NOT EXISTS users (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(50)," +
                "email VARCHAR(50))"
            );

            // 2. Insert sample data
            stmt.executeUpdate("INSERT INTO users(name,email) VALUES('Krishna','krishna@test.com')");
            stmt.executeUpdate("INSERT INTO users(name,email) VALUES('Ravi','ravi@test.com')");
            stmt.executeUpdate("INSERT INTO users(name,email) VALUES('Anjali','anjali@test.com')");

            // 3. Fetch data
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            out.println("<h2 style='color:green;'>✅ Connected to DB Successfully</h2>");
            out.println("<h3>📋 Users List:</h3>");

            out.println("<table border='1' cellpadding='10'>");
            out.println("<tr><th>ID</th><th>Name</th><th>Email</th></tr>");

            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt("id") + "</td>");
                out.println("<td>" + rs.getString("name") + "</td>");
                out.println("<td>" + rs.getString("email") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");

            con.close();

        } catch (Exception e) {
            out.println("<h2 style='color:red;'>❌ DB Connection Failed</h2>");
            out.println("<pre>" + e.getMessage() + "</pre>");
        }
    }
}
