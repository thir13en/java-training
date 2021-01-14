package com.santiloopz.learning.oop.billburgers;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe Burger", "Vegan", 19.1, "Seeds");
        this.addition1Name = "Drink";
        this.addition1Price = 0;
        this.addition2Name = "Chips";
        this.addition2Price = 0;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to the Deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        this.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        this.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        this.addHamburgerAddition1(name, price);
    }
}
