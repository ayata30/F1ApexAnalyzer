import javax.swing.JButton;
import javax.swing.JFrame;
///import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {

         SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                 JFrame frame = new JFrame("F1 Race Analyzer");
                 frame.setSize(800, 600);
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
                 Track track = new Track();
                 frame.add(track);
                 
                 frame.setVisible(true);
                 
                 JPanel controlPanel = new JPanel();
                // controlPanel.setBorder(borderFactory.createEmptyBorder(30, 30, 10, 30));
                // controlPanel.setLayout(new GridLayout(0,1));
                 
                // frame.add(controlPanel, BorderLayout.CENTER);
                 
                 JButton button = new JButton("idk yet");
                 controlPanel.add(button);
             }
         });

        
          //  JPanel controlPanel = new JPanel();


        
    }     // the control panel with dropdwons and buttons
    
          


          


}
