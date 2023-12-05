package uppgift_3;
import java.util.UUID;

/**
 * That class is responsible for creating memento objects.
 */
public class NoteMemento {
    private final UUID id;
    private final String noteText;

    public NoteMemento(UUID id, String note) {
        this.id = id;
        this.noteText = note;
    }

    public UUID getId(){
        return id;
    }

    public String getNote(){
        return noteText;
    }
}
