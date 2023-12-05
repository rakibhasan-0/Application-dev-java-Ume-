package se.umu.cs.apjava.maxdonalds.burger;

public class TestBuilderPattern {
    public static void main(String[] args){
        BurgerBuilder builder = new BurgerBuilder();
        builder.setMeat("Chicken");
        builder.addVegetable("Tomato");
        builder.addVegetable("Lettuce");
        builder.addSauce("Ketchup");
        builder.addSauce("Mayo");
        Burger burger = builder.build();
        System.out.println(burger.getDescription());

        BurgerBuilder builder1 = new BurgerBuilder();
        builder1.setMeat("Beef");
        builder1.addVegetable("Tomato");
        builder1.addVegetable("Lettuce");
        builder1.addSauce("Ketchup");
        builder1.addSauce("Mayo");
        Burger burger1 = builder1.build();
        System.out.println(burger1.getDescription());
    }
}
