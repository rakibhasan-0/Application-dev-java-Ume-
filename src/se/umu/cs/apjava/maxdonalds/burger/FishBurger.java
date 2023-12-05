package se.umu.cs.apjava.maxdonalds.burger;

import java.util.ArrayList;

/**
 * That class represents a fish burger and it will get the cost to the user,
 * There will be methods to get the total price of the burger and description of the
 * burger.
 */

class FishBurger extends Burger {

    protected FishBurger(){
        super.totalPrice = 12;
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
        description.append("Fish Burger with bread");
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
