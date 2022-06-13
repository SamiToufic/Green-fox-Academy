import javax.swing.*;

import java.awt.*;

import static java.awt.Color.green;
import static java.awt.Color.red;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

  public static void drawImage(Graphics graphics) {
    // Draw a green 10x10 square to the canvas' center
    graphics.setColor(green);
    graphics.drawRect(HEIGHT/4, WIDTH/4, WIDTH/2, HEIGHT/2);
    // CR: does this create a 10*10 square?

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
