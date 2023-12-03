package se.umu.cs.apjava.burger;

import java.util.ArrayList;

class ChickenBurger extends Burger {
    protected ChickenBurger(){
        super.totalPrice = 10;
        vegetables = new ArrayList<>();
        sauces = new ArrayList<>();
    }

    @Override
    public int getCost() {
        return super.totalPrice;
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder();
        description.append("Chicken Burger with bread");
        for (String s : vegetables) {
            description.append(", ").append(s);
        }
        for (String s : sauces) {
            description.append(", ").append(s);
        }
        description.append(". Total price: ").append(getCost());
        return description.toString();
    }

}