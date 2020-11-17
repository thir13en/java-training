package com.santiloopz.learning.oop;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator() {
    }

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.carpet.getCost() * this.floor.getArea();
    }
}
