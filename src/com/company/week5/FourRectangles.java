import javax.swing.*;

import java.awt.*;

import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.awt.Color.yellow;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void drawImage(Graphics graphics) {
    // Draw four different size and color rectangles
    // Avoid code duplication!

    for (int i = 0; i < 6; i++) {
      drawRectangles(i * 2, i* 4, graphics);

    }
  }
  public static void drawRectangles(int x, int y, Graphics graphics){
    graphics.setColor(red);
    if (x==0)
    graphics.drawRect(x,y,WIDTH/3, HEIGHT/5);

    graphics.setColor(green);
    if (x==2)
      graphics.drawRect(x,y,WIDTH/3, HEIGHT/5);

    graphics.setColor(blue);
    if (x==4)
      graphics.drawRect(x,y,WIDTH/3, HEIGHT/5);

    graphics.setColor(yellow);
    if (x==6)
      graphics.drawRect(x,y,WIDTH/3, HEIGHT/5);

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