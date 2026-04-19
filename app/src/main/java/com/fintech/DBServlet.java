package com.fintech;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DBServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://db:3306/fintech",
                "user1",
                "pass123"
            );

            Statement stmt = con.createStatement();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS users(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), email VARCHAR(50))");

            stmt.executeUpdate("INSERT INTO users(name,email) VALUES('Krishna','krishna@test.com')");
            stmt.executeUpdate("INSERT INTO users(name,email) VALUES('Ravi','ravi@test.com')");

            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            out.println("<h2>✅ Connected to DB</h2>");
            out.println("<table border='1'>");

            while(rs.next()){
                out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
            }

            out.println("</table>");
            con.close();

        } catch(Exception e){
            out.println("Error: " + e.getMessage());
        }
    }
}
