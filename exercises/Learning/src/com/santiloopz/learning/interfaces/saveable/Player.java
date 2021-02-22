package com.santiloopz.learning.interfaces.saveable;

public class Player {
    String name;
    String weapon;
    int hitPoints;
    int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
}
