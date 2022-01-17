package com.example.smaczne;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
                    ("jdbc:mysql://localhost:3306/users","123","123");

            PreparedStatement ps = con.prepareStatement
                    ("insert into student values(?,?,?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, pass);
            int i = ps.executeUpdate();

            if(i > 0) {
                out.println("You are sucessfully registered");
                RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
                rd.forward(request,response);

            }
            else
            {
                out.println("Rejestracja nie udana");
            }

        }
        catch(Exception se) {
            se.printStackTrace();
        }


    }
}