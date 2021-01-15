package com.santiloopz.learning.oop.billburgers;

public class Hamburger {
    private final String name;
    private final String meat;
    protected final double price;
    private final String breadRollType;
    protected String addition1Name;
    protected double addition1Price;
    protected String addition2Name;
    protected double addition2Price;
    protected String addition3Name;
    protected double addition3Price;
    protected String addition4Name;
    protected double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeBurger() {
        double totalPrice = this.price;
        totalPrice += this.addition1Price > 0 ? this.addition1Price : 0;
        totalPrice += this.addition2Price > 0 ? this.addition2Price : 0;
        totalPrice += this.addition3Price > 0 ? this.addition3Price : 0;
        totalPrice += this.addition4Price > 0 ? this.addition4Price : 0;
        return totalPrice;
    }
}
