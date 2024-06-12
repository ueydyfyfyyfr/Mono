package Interacciones;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Caja extends objetosDelJuego{

    @Override
    public JLabel crearConstruccion() {
        caja.setBounds(100,300,ancho,alto);
        caja.setIcon(new ImageIcon(imagenCaja.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        return caja;
    }

    JLabel caja = new JLabel();
    Image imagenCaja = new ImageIcon(getClass().getResource("../imagenesInteraciones/caja.png")).getImage();
}