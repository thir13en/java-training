package com.santiloopz.learning.oop.billburgers;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Seeds");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        totalPrice += this.healthyExtra1Price > 0 ? this.healthyExtra1Price : 0;
        totalPrice += this.healthyExtra2Price > 0 ? this.healthyExtra2Price : 0;
        return totalPrice;
    }
}
