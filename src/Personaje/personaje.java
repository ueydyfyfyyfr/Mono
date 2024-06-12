package Personaje;

import javax.swing.JLabel;

public abstract class personaje {
    int posicionX = 40;
    int posicionY = 40;
    int ancho = 100;
    int alto = 100;
    
    public abstract JLabel crearPersonaje();
}
