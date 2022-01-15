package com.example.smaczne;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import  javax.servlet.http.HttpServlet;

@WebServlet(name = "register", value = "register")
public class Register extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        try {

            // loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database 
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/users","","");

            PreparedStatement ps = con.prepareStatement
                    ("insert into student values(?,?,?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, pass);
            int i = ps.executeUpdate();

            if(i > 0) {
                out.println("You are sucessfully registered");
            }

        }
        catch(Exception se) {
            se.printStackTrace();
        }

    }
}