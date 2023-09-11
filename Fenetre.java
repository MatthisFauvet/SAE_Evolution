import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * La class fenetre est une classe qui a simplement pour but de créer une Fenetre, puis attendre que des class hérite d'elle afin d'utiliser sa JFrame
 * @version 1.1
 * @author Matthis Fauvet 
 */

public class Fenetre implements ActionListener{
    
    protected JFrame fenetre;

    public Point point = new Point(1920/2, 0, 0, 5);

    /**
     * Contructeur
     */
    public Fenetre() {
        this.fenetre = new JFrame("Test");

        this.fenetre.setSize(1920, 1080);
        this.fenetre.setLocationRelativeTo(null); // centre la fenêtre sur l'écran

        this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.fenetre.add(point);

        this.fenetre.setVisible(true);

        Timer timer = new Timer(10, this); // toutes les 1s
        timer.start();

    }

    /**
     * Cette méthode a pour but de fermer la fenetre quand on le demande 
     */
    public void closeFrame() {
        this.fenetre.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        point.move();
        SwingUtilities.updateComponentTreeUI(this.fenetre);
    }
}