package uppgift_4;

public class Names implements Container{
    private final LinkedList<Object> linkedList;
    private LinkedList.Position currentPosition;
    public Names (){
        linkedList = new LinkedList<Object>();
        currentPosition = linkedList.first();
    }

    public void addName(Object name){
        linkedList.insert(currentPosition,name);
        currentPosition = linkedList.next(currentPosition);
    }

    @Override
    public Iterator createIterator() {
        return new LinkedListIterator(linkedList);
    }


}
