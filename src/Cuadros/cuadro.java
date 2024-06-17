package Cuadros;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.BorderFactory;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class cuadro extends JLabel{

    public cuadro(int x,int y){
        setSize(ancho,alto);
        setLocation(x,y);
        setIcon(new ImageIcon(img.getScaledInstance(ancho,alto, Image.SCALE_SMOOTH)));
        setBorder(BorderFactory.createLineBorder(Color.yellow));
    }

    public Rectangle obtenercuadro(){
        return this.getBounds();
    }
    Image img = new ImageIcon(getClass().getResource("../Puestos/puesto-caja.png")).getImage();
    int ancho = 150,alto = 150;
}
