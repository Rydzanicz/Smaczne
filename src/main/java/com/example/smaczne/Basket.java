package com.example.smaczne;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Basket extends HttpServlet {


    private ArrayList<String> basket= new ArrayList<>();
    public Basket(){}


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        addToCart(request.getParameter("pierogi"));
        addToCart(request.getParameter("schabowy"));
        addToCart(request.getParameter("zurek"));
        addToCart(request.getParameter("bigos"));

        addToCart(request.getParameter("kebab"));
        addToCart(request.getParameter("kumpir"));
        addToCart(request.getParameter("balikekmek"));

        addToCart(request.getParameter("pizza"));
        addToCart(request.getParameter("minestrone"));
        addToCart(request.getParameter("lasagne"));
        String order= getKoszyk().toString();
        request.setAttribute("order",order);
        RequestDispatcher rd = request.getRequestDispatcher("basket.jsp");
        rd.forward(request,response);

    }

    public List getKoszyk() {
        return basket;
    }
    public void clear() {
        basket= new ArrayList<>();
    }

    public void addToCart(String product) {
        if (product != null) {
            basket.add(product);
        }
    }
}
