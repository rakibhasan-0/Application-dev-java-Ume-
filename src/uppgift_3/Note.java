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

    /**
     * It will get the note.
     * @return The note.
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * It will get the note id number.
     * @return The note id number.
     */
    public UUID getId() {
        return id;
    }


    /**
     * It will create the memento and the note with the given state will be saved.
     * @return It will create NoteMemento.
     */
    public NoteMemento save(){
        return new NoteMemento(this.id, this.note);
    }


}
