import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
///import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {

       
       // creating a new driver - instianting the object
       Driver name1 = new Driver();
       Driver name2 = new Driver("leclerc");
    
       
       
       
    
       
       
       
       
        SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                 JFrame frame = new JFrame("F1 Race Analyzer");
                 frame.setSize(800, 600);
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
                 Track track = new Track();
                 frame.add(track);
                 
                 frame.setVisible(true);
               //  frame.add(label);
                 
                 JPanel controlPanel = new JPanel();
                // controlPanel.setBorder(borderFactory.createEmptyBorder(30, 30, 10, 30));
                // controlPanel.setLayout(new GridLayout(0,1));
                 
                // frame.add(controlPanel, BorderLayout.CENTER);
                JLabel label = new JLabel();
                label.setText("u good");
                 
                 JButton button = new JButton("idk yet");
                 controlPanel.add(button);
             }
         });

        
          //  JPanel controlPanel = new JPanel();


        
    }     // the control panel with dropdwons and buttons
    
          


          


}
