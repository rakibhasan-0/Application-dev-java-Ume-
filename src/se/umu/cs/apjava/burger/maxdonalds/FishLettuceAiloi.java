package se.umu.cs.apjava.burger.maxdonalds;

import se.umu.cs.apjava.burger.maxdonalds.burger.Burger;
import se.umu.cs.apjava.burger.maxdonalds.burger.BurgerBuilder;

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
