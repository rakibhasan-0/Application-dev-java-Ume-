package uppgift_3;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class NoteBookGUI {

    private final JTextArea textArea;
    private final JList<String> createdNotesList;
    private final DefaultListModel<String> listOfNotes;
    private final JButton saveButton;
    private final JButton deleteButton;
    private final JButton restoreButton;
    private final JButton createNote;


    public NoteBookGUI() {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        frame.add(panel, BorderLayout.NORTH);
        saveButton = new JButton("Save");
        deleteButton = new JButton("Delete");
        restoreButton = new JButton("Restore");
        createNote = new JButton("Create Note");

        Box box = new Box(BoxLayout.X_AXIS);
        box.add(saveButton);
        box.add(deleteButton);
        box.add(restoreButton);
        box.add(createNote);
        panel.add(box);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane,BorderLayout.CENTER);

        listOfNotes = new DefaultListModel<>();
        createdNotesList = new JList<>(listOfNotes);
        JScrollPane listNotesScrollPane = new JScrollPane(createdNotesList);
        listNotesScrollPane.setSize(10, 10);
        frame.add(listNotesScrollPane, BorderLayout.WEST);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JTextArea getTextArea() {
        return textArea;
    }

    DefaultListModel<String> getListModel() {
        return listOfNotes;
    }

    JList<String> getListOfNotes() {
        return createdNotesList;
    }

    JButton getCreateNoteButton(){
        return createNote;
    }

    JButton getSaveButton(){
        return saveButton;
    }


    JButton getDeleteButton(){
        return deleteButton;
    }


    JButton getRestoreButton(){
        return restoreButton;
    }

}
