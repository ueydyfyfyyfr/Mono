package Monkey.mart;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

import Alimentos.Cambur;
import Alimentos.Huevos;
import Alimentos.Leche;
import Alimentos.Maiz;
import Interacciones.Caja;
import Interacciones.PuestoMaiz;
import Personaje.mono;

public class Main extends JPanel {

    mono personaje = new mono();
    Cambur cambur = new Cambur();

    public Main() {
        setLayout(null);
        setBackground(Color.CYAN);

        // Hilo de todo el juego
        Timer tiempoDelJuego = new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add(personaje.crearPersonaje());
            }
        });
        tiempoDelJuego.start();
        // animacion del personaje
        personaje.Animacion();

        // acciones de teclado
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                personaje.moverPersonaje(e);
            }
        });

        add(new Cambur().crearAlimento());
        add(new Huevos().crearAlimento());
        add(new Leche().crearAlimento());
        add(new Maiz().maiz());
        add(new Caja().crearConstruccion());
        add(new PuestoMaiz().crearConstruccion());

        // mantener el focus en el Panel
        setFocusable(true);
    }
}
