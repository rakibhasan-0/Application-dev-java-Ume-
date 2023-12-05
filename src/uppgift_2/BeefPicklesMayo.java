package uppgift_2;
import se.umu.cs.apjava.maxdonalds.burger.Burger;
import se.umu.cs.apjava.maxdonalds.burger.BurgerBuilder;

/**
 * It represents a certain burger type which is Beef Pickles Mayo burger. This implements
 * the BurgerFactory interface and it will use BurgerBuilder class to create that
 * specific burger.
 */
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
