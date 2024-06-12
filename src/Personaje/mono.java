package Personaje;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class mono extends personaje {

    @Override
    public JLabel crearPersonaje() {
        personaje.setBounds(posicionX, posicionY, ancho, alto);
        return personaje;
    }

    public void Animacion() {
        Timer hilo = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personaje.setIcon(new ImageIcon(animacion[i].getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
                i++;
                if (i == animacion.length) {
                    i = 0;
                }
            }
        });
        hilo.start();
    }

    public void moverPersonaje(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_D:
                colisiones(posicionX, 'd');
                break;
            case KeyEvent.VK_A:
            colisiones(posicionX, 'a');
                break;
            case KeyEvent.VK_W:
            colisiones(posicionY, 'w');
                break;
            case KeyEvent.VK_S:
            colisiones(posicionY, 's');
                break;
        }
    }

    private void colisiones(int posicion, char letra) {
        if (letra == 'w') {
            if (posicion != 0) {
                posicionY -=2;
            }
        }
        if (letra == 's') {
            if (posicion != 470) {
                posicionY +=2;
            }
        }
        if (letra == 'a') {
            if (posicion != 0) {
                posicionX -=2;
            }
        }
        if (letra == 'd') {
            if (posicion != 680) {
                posicionX +=2;
            }
        }
    }

    int i = 0;
    JLabel personaje = new JLabel();
    Image[] animacion = {
            new ImageIcon(getClass().getResource("../ImagenesPersonaje/KirbyMovimiento1.png")).getImage(),
            new ImageIcon(getClass().getResource("../ImagenesPersonaje/KirbyMovimiento2.png")).getImage(),
            new ImageIcon(getClass().getResource("../ImagenesPersonaje/KirbyMovimiento3.png")).getImage(),
            new ImageIcon(getClass().getResource("../ImagenesPersonaje/KirbyMovimiento4.png")).getImage(),
            new ImageIcon(getClass().getResource("../ImagenesPersonaje/KirbyMovimiento5.png")).getImage(),
            new ImageIcon(getClass().getResource("../ImagenesPersonaje/KirbyMovimiento6.png")).getImage(),
            new ImageIcon(getClass().getResource("../ImagenesPersonaje/KirbyMovimiento7.png")).getImage(),
            new ImageIcon(getClass().getResource("../ImagenesPersonaje/KirbyMovimiento8.png")).getImage(),
            new ImageIcon(getClass().getResource("../ImagenesPersonaje/KirbyMovimiento9.png")).getImage(),
    };
}
