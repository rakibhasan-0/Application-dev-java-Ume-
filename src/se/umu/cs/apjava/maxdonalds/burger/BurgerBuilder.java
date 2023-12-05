package se.umu.cs.apjava.maxdonalds.burger;

/**
 * That class creates the burger object which the user specified, and it will
 * add ingredients of the burger such as beef, vegetables and so on.
 * There is a method name build() which returns the object that has been built
 * by using that class.
 */

public class BurgerBuilder {
    Burger burger;
    public BurgerBuilder(){
        burger = new BeefBurger();
    }

    public void setMeat(String meat){
        switch (meat.toLowerCase()) {
            case "beef":
                burger = new BeefBurger();
                break;
            case "fish":
                burger = new FishBurger();
                break;
            case "chicken":
                burger = new ChickenBurger();
                break;
            default:
                throw new IllegalArgumentException("Invalid type of meat: " + meat);
        }
    }

    public void addVegetable(String vegetable){
        burger.vegetables.add(vegetable);
        burger.totalPrice += 3;
    }

    public void addSauce(String sauce){
        burger.sauces.add(sauce);
        burger.totalPrice += 2;
    }

    public Burger build(){
        return burger;
    }

}
