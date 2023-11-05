package GUI;

import GUI.Tetris.TetrisPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TetrisGUI {
    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("JTetris Alpha Version");
        try {
            mainFrame.setIconImage(ImageIO.read(new File("icon/jtetris-icon.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);

        TetrisPanel tp = new TetrisPanel();
        mainFrame.add(tp);

        /*
         * Clase Toolkit de java para obtener las dimensiones de la pantalla y ponerlo para que aparezca en
         * coordenadas relativas al monitor. Con esta se obtiene el ancho y largo de la pantalla y dividiéndolo entre
         * un número. Va a dar como resultado unas coordenadas relativas a cualquier monitor
         */
        Dimension e = Toolkit.getDefaultToolkit().getScreenSize();

        mainFrame.setLocation((int) (e.getWidth() / 6), (int) (e.getHeight() / 6));
        mainFrame.setSize(650, 700);
        mainFrame.setLocationRelativeTo(null);
        tp.startGameThread();
        mainFrame.setVisible(true);
    }
}
