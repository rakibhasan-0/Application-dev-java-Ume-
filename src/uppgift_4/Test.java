package uppgift_4;


public class Test {

    public static void main(String[] args) {
        Names names = new Names();
        names.addName("Bertil");
        names.addName("Hugo");
        names.addName("Adam");
        names.addName("Diana");

        Iterator iterator = names.createIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}

