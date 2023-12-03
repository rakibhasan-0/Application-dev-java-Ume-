package uppgift_3;
import javax.swing.*;
import java.util.HashMap;
import java.util.UUID;

public class NoteBookController{
    NoteCareTaker careTaker = new NoteCareTaker();
    HashMap<Integer, UUID> notesIdMap = new HashMap<>();
    HashMap<UUID, Note> notes = new HashMap<>();
    int selectedNoteIndex;
    NoteBookGUI gui;

    public NoteBookController(NoteBookGUI gui){
        this.gui = gui;
        createNoteButton();
        selectedNote();
        saveButton();
        restoreButton();
        deleteButton();
    }

    private void deleteButton() {
        gui.getDeleteButton().addActionListener(e -> {
            if (selectedNoteIndex >= 0 && selectedNoteIndex < gui.getListModel().getSize()) {
                UUID selectedNoteId = notesIdMap.get(selectedNoteIndex);
                if (selectedNoteId != null) {
                    gui.getListModel().remove(selectedNoteIndex);
                    careTaker.removeMemento(selectedNoteId);
                    notesIdMap.remove(selectedNoteIndex);
                    selectedNoteIndex = -1;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No note selected", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    // TODO exception handling!!
    // check for the exception.
    private void restoreButton() {
        gui.getRestoreButton().addActionListener(e -> {
            if (selectedNoteIndex != -1) {
                UUID selectedNoteId = notesIdMap.get(selectedNoteIndex);
                if (selectedNoteId != null) {
                    NoteMemento memento = careTaker.getMemento(selectedNoteId);
                    if (memento != null) {
                        String previousState = memento.getNote();
                        gui.getTextArea().setText(previousState);
                        Note currentNote = notes.get(selectedNoteId);
                        if (currentNote != null) {
                            currentNote.setNote(previousState);
                        }
                    }else {
                        gui.getTextArea().setText(" ");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No note selected to restore.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }



    private void saveButton() {
        gui.getSaveButton().addActionListener(e -> {
            if (selectedNoteIndex != -1) {
                UUID noteId = notesIdMap.get(selectedNoteIndex);
                if (noteId != null) {
                    Note currentNote = notes.get(noteId);
                    if (currentNote != null) {
                        String noteText = gui.getTextArea().getText();
                        currentNote.setNote(noteText);
                        careTaker.saveMemento(currentNote);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error retrieving the note to save.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No note selected to save.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });
    }



    private void selectedNote() {
        gui.getListOfNotes().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                selectedNoteIndex = gui.getListOfNotes().getSelectedIndex();
                if (selectedNoteIndex != -1) {
                    UUID selectedNoteId = notesIdMap.get(selectedNoteIndex);
                    if (selectedNoteId != null) {
                        Note currentNote = notes.get(selectedNoteId);
                        if (currentNote != null) {
                            String text = currentNote.getNote();
                            gui.getTextArea().setText(text);
                        } else {
                            gui.getTextArea().setText("");
                        }
                    }
                }
            }
        });
    }


    private void createNoteButton() {
        gui.getCreateNoteButton().addActionListener(e->{
            Note note = new Note();
            int index = gui.getListModel().size()+1;
            notesIdMap.put(gui.getListModel().size(), note.getId());
            notes.put(note.getId(), note);
            gui.getListModel().addElement("Note"+index);
        });
    }

}