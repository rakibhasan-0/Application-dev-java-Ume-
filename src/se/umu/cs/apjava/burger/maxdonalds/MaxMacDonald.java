package se.umu.cs.apjava.burger.maxdonalds;
import se.umu.cs.apjava.burger.maxdonalds.burger.Burger;


public class MaxMacDonald {
    private final BurgerFactory factory;

    public MaxMacDonald (BurgerFactory factory) {
        this.factory = factory;
    }

    public Burger orderBurger() {
        return factory.createBurger();
    }

}

