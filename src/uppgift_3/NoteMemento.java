package uppgift_3;
import java.util.UUID;

public class NoteMemento {
    private UUID id;
    private String note;

    public NoteMemento(UUID id, String note) {
        this.id = id;
        this.note = note;
    }

    public UUID getId(){
        return id;
    }

    public String getNote(){
        return note;
    }
}
