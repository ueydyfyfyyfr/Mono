package Interacciones;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PuestoMaiz extends objetosDelJuego{

    @Override
    public JLabel crearConstruccion() {
        puestoMaiz.setBounds(200,200,ancho,alto);
        puestoMaiz.setIcon(new ImageIcon(img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        return puestoMaiz;
    }
    JLabel puestoMaiz = new JLabel();
    Image img = new ImageIcon(getClass().getResource("../imagenesInteraciones/puestoMaiz.png")).getImage();
}
