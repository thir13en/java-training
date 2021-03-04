package com.santiloopz.learning.interfaces.saveable;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(this.name);
        values.add(String.valueOf(this.hitPoints));
        values.add(String.valueOf(this.strength));

        return values;
    }

    public void read(List<String> values) {
        if (values != null && values.size() > 0) {
            for (int i=0; i<values.size(); i++) {
                switch (i) {
                    case 0:
                        this.name = values.get(i);
                    case 1:
                        this.hitPoints = Integer.parseInt(values.get(i));
                    case 2:
                        this.strength = Integer.parseInt(values.get(i));
                    default:
                        break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Monster{name='Werewolf', hitPoints=20, strength=40}";
    }
}
