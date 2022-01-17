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

        addToCart("Pierogi", request.getParameter("pierogi"));
        addToCart("Schabowy", request.getParameter("schabowy"));
        addToCart("Zurek", request.getParameter("zurek"));
        addToCart("Bigos", request.getParameter("bigos"));

        addToCart("Adama kebab", request.getParameter("kebab"));
        addToCart("Kumpir", request.getParameter("kumpir"));
        addToCart("Balik ekmek", request.getParameter("balikekmek"));

        addToCart("Pizza", request.getParameter("pizza"));
        addToCart("Minestrone", request.getParameter("minestrone"));
        addToCart("Lasagne", request.getParameter("lasagne"));// zaczytuje warości z inputów i dodaje do listy

        String  form= request.getParameter("formularz"); // przypisuje warotość przy naciśnięciu na przycisk 'Zamów'
        String  delete= request.getParameter("basketDelete"); // przypisuje warotość przy naciśnięciu na przycisk 'Oproznij koszyk'

        clear(delete);// czyści listę przy naciśnięciu na przycisk 'Oproznij koszyk'
        String order= getKoszyk(); // wyśwetla zawartość koszyka
        request.setAttribute("order",order);
        RequestDispatcher rd = request.getRequestDispatcher("basket.jsp");// wyświetla ekran 'basket'

        if (form != null&& !basket.isEmpty()){// gdy koszyk nie jest pusty i zostanie naciśniety przycisk zamów
            rd = request.getRequestDispatcher("payment.jsp");// przenosi na ekran 'payment' gdy zostanie naciśniety  przysisk 'formularz'
            clear(form);// czyści listę przy naciśnięciu na przycisk 'Zanów'
        }
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

    public void addToCart(String name, String product) {
        if (product != null) {
            basket.add(name+" "+product+"zł");
        }
    }
}
