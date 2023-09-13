import javax.swing.*;
import java.awt.*;

public class Terrain extends JComponent {

    JFrame window;
    
    public Terrain(){
                
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 1000, 1000);
    }
}
