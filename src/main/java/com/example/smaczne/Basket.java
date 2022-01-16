package com.example.smaczne;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Basket extends HttpServlet {
    public List basket= null;
    public Basket(){}


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String pierogi = request.getParameter("pierogi");
        String schabowy = request.getParameter("schabowy");
        String zurek = request.getParameter("zurek");

        out.println(schabowy);


    }

    public List getKoszyk() {
        return basket;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("post");
        out.print(getKoszyk());
    }
    public void setKoszyk(String idProduktu) {
        this.basket.add(idProduktu);
    }
}
