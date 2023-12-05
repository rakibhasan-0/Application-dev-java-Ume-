package uppgift_4;


/**
 * That class implements the iterator interface, it will take already created list as
 * constructor parameter and currentPosition attribute will be used to track the position
 * of the element in the list.
 */
public class LinkedListIterator implements Iterator{
    LinkedList<Object> list;
    LinkedList.Position currentPosition;

    public LinkedListIterator(LinkedList<Object> list){
        this.list = list;
        currentPosition = list.first();
    }

    @Override
    public boolean hasNext() {
        return !list.isEnd(currentPosition);
    }

    @Override
    public Object next() {
        Object o = list.inspect(currentPosition);
        currentPosition = list.next(currentPosition);
        return o;
    }

}