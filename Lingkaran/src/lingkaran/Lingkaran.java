/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author 
 * DIAH ZUKHRUFI AZIZAH
 * SUKMA AYU SEPTIANINGRUM
 */
public class Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lingkaran");
        Gambar panel = new Gambar(150,150,90);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
