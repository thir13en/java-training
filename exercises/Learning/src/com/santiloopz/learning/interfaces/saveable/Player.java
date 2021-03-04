package com.santiloopz.learning.interfaces.saveable;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(this.name);
        values.add(String.valueOf(this.hitPoints));
        values.add(String.valueOf(this.strength));
        values.add(this.weapon);

        return values;
    }

    public void read(List<String> values) {
        if (values != null && values.size() > 0) {
            for (int i=0; i<values.size(); i++) {
                switch (i) {
                    case 0:
                        this.setName(values.get(i));
                    case 1:
                        this.setHitPoints(Integer.parseInt(values.get(i)));
                    case 2:
                        this.setStrength(Integer.parseInt(values.get(i)));
                    case 3:
                        this.setWeapon(values.get(i));
                    default:
                        break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Player{name='" +
                this.name + "', hitPoints=" +
                this.hitPoints + ", strength=" +
                this.strength +", weapon='" +
                this.weapon+"'}";
    }
}