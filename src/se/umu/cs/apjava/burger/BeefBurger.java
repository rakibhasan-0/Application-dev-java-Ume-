package se.umu.cs.apjava.burger;

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
