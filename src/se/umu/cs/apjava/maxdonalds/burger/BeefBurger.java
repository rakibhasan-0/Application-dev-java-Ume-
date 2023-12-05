package se.umu.cs.apjava.maxdonalds.burger;

/**
 * That class represents a beef burger and it will get the cost to the user,
 * There will be methods to get the total price of the burger and description of the
 * burger.
 */
public class BeefBurger extends Burger {
    public BeefBurger(){
        super.totalPrice = 11;
    }

    @Override
    public int getCost() {
        return super.totalPrice;
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder();
        description.append("Beef Burger with bread");
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
