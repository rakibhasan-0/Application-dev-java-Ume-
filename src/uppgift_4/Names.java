package uppgift_4;

/**
 * That class uses the Iterator design pattern in order to traverse through the elements
 * which has been added in the list.
 */
public class Names {
    public static void main(String[] args) {
        ConcreteAggregate names = new ConcreteAggregate();
        names.add("Bertil");
        names.add("Hugo");
        names.add("Adam");
        names.add("Diana");

        Iterator iterator = names.createIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}

