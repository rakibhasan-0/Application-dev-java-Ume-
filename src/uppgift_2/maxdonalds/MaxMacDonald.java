package uppgift_2.maxdonalds;
import uppgift_2.maxdonalds.burger.Burger;


public class MaxMacDonald {
    private final BurgerFactory factory;

    public MaxMacDonald (BurgerFactory factory) {
        this.factory = factory;
    }

    public Burger orderBurger() {
        return factory.createBurger();
    }

}

