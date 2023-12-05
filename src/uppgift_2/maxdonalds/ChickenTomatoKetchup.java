package uppgift_2.maxdonalds;


import se.umu.cs.apjava.burger.Burger;
import se.umu.cs.apjava.burger.BurgerBuilder;


/**
 * It represents a certain burger type which is Chicken Tomato Ketchup. This implements
 * the BurgerFactory interface and it will use BurgerBuilder class to create that
 * specific burger.
 */
public class ChickenTomatoKetchup implements BurgerFactory{
    BurgerBuilder builder;

    public ChickenTomatoKetchup(){
        builder = new BurgerBuilder();
    }

    @Override
    public Burger createBurger() {
        builder.setMeat("Chicken");
        builder.addVegetable("Tomato");
        builder.addSauce("Ketchup");
        return builder.build();
    }

}
