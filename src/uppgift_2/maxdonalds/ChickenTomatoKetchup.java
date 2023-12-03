package uppgift_2.maxdonalds;
import uppgift_2.maxdonalds.burger.Burger;
import uppgift_2.maxdonalds.burger.BurgerBuilder;


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
