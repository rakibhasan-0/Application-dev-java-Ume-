package se.umu.cs.apjava.burger.maxdonalds.burger;

import java.util.ArrayList;
import java.util.List;

public abstract class Burger {
    protected List<String> vegetables;
    protected List<String> sauces;
    protected int totalPrice;


    public Burger() {
        vegetables = new ArrayList<>();
        sauces = new ArrayList<>();
    }

    public abstract int getCost();
    public abstract String getDescription();
}
