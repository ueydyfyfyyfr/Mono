package Personaje;

import javax.swing.JLabel;

public abstract class personaje {
    int posicionX = 300;
    int posicionY = 20;
    int ancho = 60;
    int alto = 60;
    
    public abstract JLabel crearPersonaje();
}
