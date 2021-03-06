import javax.swing.*;
import java.awt.*;

public class Horizontal {

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // draw 3 lines with that function.
    int[] startPoint = {50,90};
    drawHorizontals(graphics, startPoint);
  }
  public static void drawHorizontals(Graphics draw, int[] start) {
    draw.setColor(Color.BLUE);
    for (int i = 0; i <= 2; i++) {
      draw.drawLine(start[0],start[1],start[0] + 50,start[1]);
      start[0] += 60;
      start[1] += 50;
    }
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}
