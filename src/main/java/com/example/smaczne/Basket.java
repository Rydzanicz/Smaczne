package com.example.smaczne;

import java.util.List;

public class Basket {
    public List basket= null;
    public Basket(){}

    public List getKoszyk() {
        return basket;
    }

    public void setKoszyk(String idProduktu) {
        this.basket.add(idProduktu);
    }
}
