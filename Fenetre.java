import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * La class fenetre est une classe qui a simplement pour but de créer une Fenetre, puis attendre que des class hérite d'elle afin d'utiliser sa JFrame
 * @version 1.1
 * @author Matthis Fauvet 
 */

public class Fenetre extends JFrame implements ActionListener{
    
    protected JFrame fenetre;

    /**
     * Contructeur
     */
    public Fenetre() {
        this.fenetre = new JFrame("Simmultaion d'évolution");

        this.fenetre.setSize(1000, 1000);
        this.fenetre.setLocationRelativeTo(null); // centre la fenêtre sur l'écran

        Terrain terrain = new Terrain();
        this.fenetre.add(terrain);


        this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.fenetre.setVisible(true);

        Timer timer = new Timer(1000, this); // toutes les 1S
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
        System.out.println("hello world!");
    }
}