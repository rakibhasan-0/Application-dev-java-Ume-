package uppgift_4;

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