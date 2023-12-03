package uppgift_2.maxdonalds;

import uppgift_2.maxdonalds.burger.Burger;
import uppgift_2.maxdonalds.burger.BurgerBuilder;

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
