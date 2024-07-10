package com.example.bags;

public class Menu {
    public String name;
    public String composition;
    public String price;

    public Menu(String name, String composition, String price) {
        this.name = name;
        this.composition = composition;
        this.price = price;
    }

    public Menu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

