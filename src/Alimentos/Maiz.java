package Alimentos;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Maiz{
    
    int posicionX = 200;
    int posicionY = 35;
    int ancho = 50;
    int alto = 50;
    
    public JLabel maiz(){

        fruta.setBounds(posicionX, posicionY, ancho, alto);
        fruta.setIcon(new ImageIcon(cambur.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        return fruta;
    }
    JLabel fruta = new JLabel();
    Image cambur = new ImageIcon(getClass().getResource("../ImagenesAlimentos/maiz.png")).getImage();
}