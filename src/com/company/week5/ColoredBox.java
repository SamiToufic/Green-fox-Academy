import javax.swing.*;

import java.awt.*;

import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void drawImage(Graphics graphics) {
    // Draw a box that has different colored lines on each edge
    graphics.setColor(red);
    graphics.drawLine(100, 160, 250, 160);
    graphics.setColor(blue);
    graphics.drawLine(100, 160, 100, 20);
    graphics.setColor(green);
    graphics.drawLine(100, 20, 250, 20);
    graphics.setColor(black);
    graphics.drawLine(250, 20, 250, 160);


  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      drawImage(graphics);
    }
  }
}
