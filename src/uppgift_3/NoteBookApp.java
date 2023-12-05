package uppgift_3;
import javax.swing.*;

/**
 * @author Gazi Md Rakibul Hasan.
 * That class creates gui and controller to manage the application.
 */

public class NoteBookApp {
    public NoteBookApp(){
        NoteBookGUI gui = new NoteBookGUI();
        NoteBookController controller = new NoteBookController(gui);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NoteBookApp::new);
    }

}