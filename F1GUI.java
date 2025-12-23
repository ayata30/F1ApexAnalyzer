import javax.swing.*;

public class F1GUI {
    public static void main(String[] args) {
        // executes a runanble awt dispatch thread

       SwingUtilities.invokeLater(() -> createAndShowGUI());

    }


   private static void createAndShowGUI() {
    // initilize the frame
    JFrame frame = new JFrame("F1 Race Analyzer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);

    frame.setVisible(true);


    JPanel  controlPanel = new JPanel();
    JButton selectYearButton = new JButton("Select Year");


   }


}


