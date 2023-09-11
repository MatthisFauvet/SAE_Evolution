import java.awt.*;
import javax.swing.*;

public class Point extends JComponent {
    public int coordX;
    public int coordY;

    public int speedX;
    public int speedY;

    public Point(int x, int y, int vX, int vY) {
        this.coordX = x;
        this.coordY = y;   
        
        this.speedX = vX;
        this.speedY = vY;
    }

    public void move(){
        this.coordX += this.speedX;
        this.coordY += this.speedY;
    }

    /**
     * Méthode qui est appelé automatiquement lors d'un apelle de la classe Cellule
     * Cette méthode à pour but de repeindre notre Cellule 
     * @param g objet graphique 
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillOval(this.coordX, this.coordY, 50, 50);
    }
}
