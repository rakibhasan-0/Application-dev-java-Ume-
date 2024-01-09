package uppgift_4;


/**
 * As it name says that it is a concrete aggregate class and That clas will crate list of objects
 * position will be point at the first element in the list. add() method will add element
 * in the list at the current position, and it moves the position to the next.
 */
public class ConcreteAggregate implements Aggregate {
    private final LinkedList<Object> linkedList;
    private LinkedList.Position currentPosition;
    public ConcreteAggregate(){
        linkedList = new LinkedList<Object>();
        currentPosition = linkedList.first();
    }


    /**
     * It adds the given object to the list of objects.
     * @param name
     */
    public void add(Object name){
        linkedList.insert(currentPosition,name);
        currentPosition = linkedList.next(currentPosition);
    }

    @Override
    public Iterator createIterator() {
        return new LinkedListIterator(linkedList);
    }


}
