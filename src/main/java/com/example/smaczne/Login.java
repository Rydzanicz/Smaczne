package com.example.smaczne;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Login extends HttpServlet {

@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); //towrzenie obiektu odpowiedzialnego za wyświetlanie komunikatów na stronie

        String name = request.getParameter("name");
        String pass = request.getParameter("pass");// przypisuje wartości z inputów za pomocą servleta

        //sprawdzenie czy podany użytkownik znajduje się w bazie danych
        //jeżeli tak to przechodzi do strony głównej
        //jeżeli nie to odświeża stronę
        if(Validate.checkUser(name,pass))
        {
            RequestDispatcher rs = request.getRequestDispatcher("main.jsp");
            rs.forward(request, response);
        }
        else
        {
            out.println("Nazwa użytkownika lub hasło są niepoprawne");
            RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
            rs.include(request, response);
        }
    }
}