package uppgift_2.maxdonalds;
import uppgift_2.maxdonalds.burger.Burger;
import uppgift_2.maxdonalds.burger.BurgerBuilder;


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
