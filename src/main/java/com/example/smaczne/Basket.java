package com.example.smaczne;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class Basket extends HttpServlet {


    private ArrayList<String> basket= new ArrayList<>();
    public Basket(){}


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        addToCart(request.getParameter("pierogi"));
        addToCart(request.getParameter("schabowy"));
        addToCart(request.getParameter("zurek"));
        addToCart(request.getParameter("bigos"));

        addToCart(request.getParameter("kebab"));
        addToCart(request.getParameter("kumpir"));
        addToCart(request.getParameter("balikekmek"));

        addToCart(request.getParameter("pizza"));
        addToCart(request.getParameter("minestrone"));
        addToCart(request.getParameter("lasagne"));// zaczytuje warości z inputów i dodaje do listy

        String  form= request.getParameter("formularz"); // przypisuje warotość przy naciśnięciu na przycisk 'Zamów'
        String  delete= request.getParameter("basketDelete"); // przypisuje warotość przy naciśnięciu na przycisk 'Oproznij koszyk'
        clear(form);// czyści listę przy naciśnięciu na przycisk 'Zanów'
        clear(delete);// czyści listę przy naciśnięciu na przycisk 'Oproznij koszyk'
        String order= getKoszyk(); // wyśwetla zawartość koszyka
        request.setAttribute("order",order);
        RequestDispatcher rd = request.getRequestDispatcher("basket.jsp");// wyświetla ekran 'basket'

        if (form != null) rd = request.getRequestDispatcher("payment.jsp");// przenosi na ekran 'payment' gdy zostanie naciśniety  przysisk 'formularz'
        rd.forward(request,response);
    }

    public String getKoszyk() {
        String produkty = null;
        for (int i = 0; i< basket.size();i++)
        {
            if (produkty== null) produkty= basket.get(i)+"<br>";
            else
                produkty+= basket.get(i)+"<br>";
        }
        return produkty;
    }
    public void clear(String product) {
        if (product != null) {
            basket= new ArrayList<>();
        }
    }

    public void addToCart(String product) {
        if (product != null) {
            basket.add(product);
        }
    }
}
