package uppgift_2;
import se.umu.cs.apjava.maxdonalds.burger.Burger;
import se.umu.cs.apjava.maxdonalds.burger.BurgerBuilder;

public class FavoriteBurgers implements FavouriteBurgersFactory{

    // creating a burger that type of the chicken, tomato and ketchup
    @Override
    public Burger createSpecialBurger() {
        BurgerBuilder builder = new BurgerBuilder();
        builder.setMeat("Chicken");
        builder.addVegetable("Tomato");
        builder.addSauce("Ketchup");
        return builder.build();
    }



    // fish burger
    @Override
    public Burger createPremiumBurger() {
        BurgerBuilder builder = new BurgerBuilder();
        builder.setMeat("Fish");
        builder.addSauce("Ailoi");
        builder.addVegetable("Lettuce");
        return builder.build();
    }


    // beef burger
    @Override
    public Burger createClassicBurger() {
        BurgerBuilder builder = new BurgerBuilder();
        builder.setMeat("beef");
        builder.addVegetable("pickles");
        builder.addSauce("mayo");
        return builder.build();
    }
}
