package Alimentos;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Huevos extends alimento{
    
    int posicionX = 20;
    int posicionY = 350;
    int ancho = 50;
    int alto = 50;
    
    @Override
    public JLabel crearAlimento(){

       fruta.setBounds(posicionX, posicionY, ancho, alto);
        fruta.setIcon(new ImageIcon(cambur.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        return fruta;
    }
    JLabel fruta = new JLabel();
    Image cambur = new ImageIcon(getClass().getResource("../ImagenesAlimentos/zanahoria.png")).getImage();
}