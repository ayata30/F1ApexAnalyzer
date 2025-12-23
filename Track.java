import java.awt.*;
import javax.swing.*;

public class Track extends JPanel {

    public Track (){
        setBackground(Color.WHITE);
    }
    

    @Override

    protected void paintComponent(Graphics g ){
        super.paintComponent(g); // clears the old frame 

        Graphics2D g2 = (Graphics2D) g;

        // drawing the track

        g2.setColor(Color.DARK_GRAY);
        g2.setStroke(new BasicStroke(8));
        g2.drawOval(100, 100, 400, 300);

        // drawing the cars

        g2.setColor(Color.RED);
        g2.fillOval(290,90,20,20);
    }
}
// abstarct class 