import java.awt.*;
import javax.swing.*;

public class Noeud extends JComponent {

    public Noeud(){
        
    }

    @Override
    public void paintComponent(Graphics g){
        g.drawOval(0, 0, 10, 10);
    }
}
