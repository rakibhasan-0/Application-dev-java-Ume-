package se.umu.cs.apjava.burger.maxdonalds;
import se.umu.cs.apjava.burger.maxdonalds.burger.Burger;
import se.umu.cs.apjava.burger.maxdonalds.burger.BurgerBuilder;


public class BeefPicklesMayo implements BurgerFactory {
    private final BurgerBuilder builder;

    public BeefPicklesMayo() {
        this.builder = new BurgerBuilder();
    }

    @Override
    public Burger createBurger() {
        builder.setMeat("beef");
        builder.addVegetable("pickles");
        builder.addSauce("mayo");
        return builder.build();
    }

}
