import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void drawImage(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        drawCheckboard(i * HEIGHT / 5, j * WIDTH / 5, graphics, i, j);

      }}} // CR: formatting
      public static void drawCheckboard (int x, int y, Graphics graphics, int i, int j) {
        if (i % 2 == 0 && j % 2 == 0) {
          graphics.setColor(new Color(0, 0, 0));
          graphics.fillRect(x, y, HEIGHT / 5, WIDTH / 5);
        } else if (i % 2 != 0 && j % 2 != 0){
          graphics.setColor(new Color(0, 0, 0));
        graphics.fillRect(x, y, HEIGHT / 5, WIDTH / 5);}

      else {
          graphics.setColor(new Color(255, 255, 250));
          graphics.fillRect(x, y, HEIGHT / 5, WIDTH / 5);
        }


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