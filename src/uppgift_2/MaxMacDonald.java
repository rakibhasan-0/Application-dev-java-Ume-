package uppgift_2;


import se.umu.cs.apjava.maxdonalds.burger.Burger;

/**
 * That is a concrete factory class it means that class will take instance of the abstract
 * factory class and will create a burger based on the type the user wants in that case.
 */
public class MaxMacDonald {
    private final BurgerFactory factory;

    public MaxMacDonald (BurgerFactory factory) {
        this.factory = factory;
    }

    public Burger orderBurger() {
        return factory.createBurger();
    }

}

