package com.example.smaczne;

public class InBasket {
    private String name;
    private int price;
    public InBasket(String name,  int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + " " + price + "zł";
    }
}