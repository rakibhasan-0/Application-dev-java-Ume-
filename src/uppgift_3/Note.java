package uppgift_3;
import java.util.UUID;

/**
 * That class represents each note.
 */
public class Note {
    private UUID id;
    private String note;

    public Note() {
        this.id = UUID.randomUUID();
        this.note = "";
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public UUID getId() {
        return id;
    }

    public NoteMemento save(){
        return new NoteMemento(this.id, this.note);
    }


}
