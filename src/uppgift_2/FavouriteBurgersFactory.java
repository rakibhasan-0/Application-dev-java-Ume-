package uppgift_2;
import se.umu.cs.apjava.maxdonalds.burger.Burger;

/**
 * It is an abstract class factory.
 */
public interface FavouriteBurgersFactory {
    Burger createClassicBurger();
    Burger createPremiumBurger();
    Burger createSpecialBurger();
}


