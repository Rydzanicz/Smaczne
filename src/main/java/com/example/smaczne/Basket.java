package com.example.smaczne;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Basket extends HttpServlet {


    List<InBasket> basket =  new ArrayList<>();
    List<InBasket> basket2 =  new ArrayList<>();
    String produkty;

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

        for (int i = 0; i< basket.size();i++)
        {
            if(i ==0 ) produkty= basket.get(i).toString()+"<br>";
            else
                produkty+= basket.get(i).toString()+"<br>";// tworzy string z zamówieniami
        }
        return produkty;
    }
    public void clear(String product) {
        if (product != null) { // czyści listę produktów
            basket = new ArrayList<>();
        }
    }

    public void addToCart(String name, String product) {
        if (product != null)
        {
            InBasket inBasket= new InBasket(name, Integer.valueOf(product));// tworzy obiekt zamówienia
            basket.add(inBasket);// dodaje obiekt do koszyka
        }
    }
}
