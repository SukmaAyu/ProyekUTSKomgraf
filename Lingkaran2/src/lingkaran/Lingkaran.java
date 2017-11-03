/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lingkaran;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author 
 */
public class Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("ALGORITMA PEMBUAT LINGKARAN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        
        Dimension screenSize =
        Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((screenSize.width - frame.getWidth()) / 2,
        (screenSize.height - frame.getHeight()) / 2);

        frame.setVisible(true);

        gambar gbr = new gambar();
        gbr.setxc(100);
        gbr.setyc(150);
        gbr.setr(100);
        frame.add(gbr);
    }

}
