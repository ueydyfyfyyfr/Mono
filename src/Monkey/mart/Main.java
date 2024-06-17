package Monkey.mart;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

import Alimentos.Cambur;
import Interacciones.Caja;
import Interacciones.PuestoMaiz;
import Cuadros.cuadro;
import Personaje.mono;
import javax.swing.JLabel;

public class Main extends JPanel {

    mono personaje = new mono();
    Cambur cambur = new Cambur();
    cuadro cuadroCaja = new cuadro(300,100);
    Caja caja = new Caja();
    int contador = 30;
    PuestoMaiz puestoMaiz = new PuestoMaiz();

    public Main() {
        setLayout(null);
        setBackground(Color.CYAN);

        // Hilo de todo el juego
        Timer tiempoDelJuego = new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add(personaje.crearPersonaje());
                repaint();
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
        add(cuadroCaja);
        puestoMaiz.crearConstruccion();
        
        //hilo del juego para los objetos
        Timer t = new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(personaje.cuadroMono()+"  "+puestoMaiz.obtenercuadro());
                if(personaje.cuadroMono().intersects(cuadroCaja.obtenercuadro())){
                    crearObjeto(caja.crearConstruccion(),500,300);
                }
                if(personaje.cuadroMono().intersects(puestoMaiz.obtenercuadro())){
                    crearObjeto(puestoMaiz.crearConstruccion(),500,30);
                }
            }
        });
        t.start();

        // mantener el focus en el Panel
        setFocusable(true);
    }
    
    
    public void crearObjeto(JLabel puesto,int x,int y){
        add(puesto);
        remove(cuadroCaja);
        add(new cuadro(x,y));
    }
}
