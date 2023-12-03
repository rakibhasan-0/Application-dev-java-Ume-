package se.umu.cs.apjava.burger.maxdonalds;
import se.umu.cs.apjava.burger.maxdonalds.burger.Burger;
import se.umu.cs.apjava.burger.maxdonalds.burger.BurgerBuilder;


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
