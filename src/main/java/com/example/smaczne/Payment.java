package com.example.smaczne;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Payment extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cvc = request.getParameter("CVC");
        String data = request.getParameter("Data");
        String cardNr = request.getParameter("CardNr");// pobiera warość z inputa CardNr
        RequestDispatcher rd;
        if(cvc.isEmpty()||data.isEmpty()||cardNr.isEmpty()) // jęśli użytkownik nic nie poda to odświerze ekran
             rd = request.getRequestDispatcher("payment.jsp");
        else
            rd = request.getRequestDispatcher("succesfull.jsp"); // tworzy request do stony sukces
        rd.forward(request,response);
    }
}