package com.santiloopz.learning.interfaces.saveable;

public class Monster {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Monster{name='Werewolf', hitPoints=20, strength=40}";
    }
}
