package com.santiloopz.learning.interfaces.saveable;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
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

    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            list.add(this.name);
            list.add(String.valueOf(this.hitPoints));
            list.add(String.valueOf(this.strength));
            list.add(this.weapon);
        }
    }

    public List<String> write() {
        List<String> list;
        // TODO WIP
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

    @Override
    public String toString() {
        return "Player{name='" +
                this.name + "', hitPoints=" +
                this.hitPoints + ", strength=" +
                this.strength +", weapon='" +
                this.weapon+"'}";
    }
}
