package uppgift_2;

import javax.swing.SwingUtilities;

/**
 * Starting point for Hamburger ordering application
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new MaxDonaldsGuiBuilder().buildGui());
    }
}
