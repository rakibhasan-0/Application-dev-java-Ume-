package uppgift_3;
import java.util.Stack;
import java.util.*;


/**
 *  That class save the snap shot of the memento class and the user of that class can
 *  retrieve certain snapshot which is already stored within that class.
 */
public class NoteCareTaker {
    private final HashMap<UUID, Stack<NoteMemento>> mementosMap;

    public NoteCareTaker() {
        mementosMap = new HashMap<>();
    }

    public void saveMemento(Note note) {
        UUID noteId = note.getId();
        Stack<NoteMemento> mementosStack = mementosMap.get(noteId);

        if (mementosStack == null) {
            mementosStack = new Stack<>();
            mementosMap.put(noteId, mementosStack);
        }
        NoteMemento memento = note.save();
        mementosStack.push(memento);
    }

    public NoteMemento getMemento(UUID noteId) {
        Stack<NoteMemento> mementosStack = mementosMap.get(noteId);
        if (mementosStack != null && !mementosStack.isEmpty()) {
            if(!mementosStack.isEmpty()){
                return mementosStack.pop();
            }else{
                return null;
            }
        }
        return null;
    }


    public ArrayList<NoteMemento> getMementos(UUID noteId) {
        ArrayList<NoteMemento> mementos = new ArrayList<>();
        Stack<NoteMemento> mementosStack = mementosMap.get(noteId);
        if (mementosStack != null) {
            mementos.addAll(mementosStack);
        }
        return mementos;
    }


    public void removeMemento(UUID uuid) {
        mementosMap.remove(uuid);
    }

}