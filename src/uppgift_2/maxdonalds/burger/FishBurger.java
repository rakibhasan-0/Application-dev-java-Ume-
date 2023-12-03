package uppgift_2.maxdonalds.burger;
import java.util.ArrayList;

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
