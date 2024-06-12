package Interacciones;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class cuadro extends JLabel{

    public cuadro(){
        setSize(100,100);
        setLocation(400,400);
        setIcon(new ImageIcon(img.getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    }

    public Rectangle cuadro(){
        return this.getBounds();
    }
    Image img = new ImageIcon(getClass().getResource("../imagenesInteraciones/caja.png")).getImage();
}
