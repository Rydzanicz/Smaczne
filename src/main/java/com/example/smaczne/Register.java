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
        PrintWriter out = response.getWriter();//towrzenie obiektu odpowiedzialnego za wyświetlanie komunikatów na stronie

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");// przypisuje wartości z inputów za pomocą servleta

        if (name.isEmpty()||email.isEmpty()||pass.isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
            rd.forward(request, response);
        }

        else {
            try {

                //ładowanie sterowników mysql
                Class.forName("com.mysql.jdbc.Driver");

                //tworzenie połączenia z bazą
                Connection con = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/users","123","123");
                //Dodawanie użytkownika do tablicy student
                PreparedStatement ps = con.prepareStatement
                        ("insert into student values(?,?,?,?)");

                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, pass);
                ps.setString(4, "user");
                int i = ps.executeUpdate();//

                if(i > 0) {
                    out.println("Pomyślnie zarejestrowano");// komunikat na stronie
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp"); // włącza stronę główną
                    rd.forward(request,response);
                }
                else
                {
                    out.println("Rejestracja nie udana");
                    RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
                    rd.forward(request, response);
                }
            }
            catch(Exception se) {
                se.printStackTrace();
            }
        }

    }
}