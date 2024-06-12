package Monkey.mart;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setTitle("Monkey Mart");
        ventana.add(new Main());
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setIconImage(new ImageIcon("src/ImagenesdeJuego/Monkey_mart.jpg").getImage());
        ventana.setVisible(true);
    }
}
