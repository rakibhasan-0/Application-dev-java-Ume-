package uppgift_3;
import java.util.UUID;

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
        NoteMemento m = new NoteMemento(this.id, this.note);
        System.out.println("Note from Memento: "+ m.getNote());
        return m;
    }


}
