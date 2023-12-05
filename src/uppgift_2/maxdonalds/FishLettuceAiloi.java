package uppgift_2.maxdonalds;
import se.umu.cs.apjava.burger.Burger;
import se.umu.cs.apjava.burger.BurgerBuilder;
/**
 * It represents a certain burger type which is Fish Lettuce Ailoi . This implements
 * the BurgerFactory interface and it will use BurgerBuilder class to create that
 * specific burger.
 */
public class FishLettuceAiloi implements BurgerFactory{
    BurgerBuilder builder;
    public FishLettuceAiloi(){
        builder = new BurgerBuilder();
    }

    @Override
    public Burger createBurger() {
        builder.setMeat("Fish");
        builder.addSauce("Ailoi");
        builder.addVegetable("Lettuce");
        return builder.build();
    }
}
