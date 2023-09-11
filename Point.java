import java.awt.*;
import java.util.Arrays;
import javax.swing.*;


public class Point extends JComponent {
    public double coordX;
    public double coordY;

    public double speedX;
    public double speedY;

    public double[] coord;

    /**
     * 
     * @param x position en x
     * @param y position en y
     * @param vX vitesse ajouté en x toutes les 5 millisecondes
     * @param vY vitesse ajouté en y toutes les 5 millisecondes
     */
    public Point(double x, double y, double vX, double vY) {
        this.coordX = x;
        this.coordY = y;   
        
        this.speedX = vX;
        this.speedY = vY;
    }

    /**
     * 
     * @return
     */
    public double[] getCoord(){
        double[] coord = {this.coordX, this.coordY};
        return coord;
    }

    /**
     * 
     * @param nwX nouvelle coordonées
     */
    public void setCoord(double nwCoord, int place){
        this.coord[place] = nwCoord;
    }

    public void setSpeedX(double nwSpeedX){
        this.speedX = nwSpeedX;
    }

    public void setSpeedY(double nwSpeedY){
        this.speedY = nwSpeedY;
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

        int convertX = (int)this.getCoord()[0];
        int convertY = (int)this.getCoord()[1];
        g.fillOval(convertX, convertY, 50, 50);
    }
}
