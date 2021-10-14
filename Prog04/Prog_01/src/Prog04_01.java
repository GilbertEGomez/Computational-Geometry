import javax.swing.*;

//This class will test the Rectangle class and draw in a window.
public class Prog04_01 {
    public static void main(String[] args) throws Exception {
        Rectangle rect1 = new Rectangle(new Point(60, 30), new Point(70, 45));
        Rectangle rect2 = new Rectangle(new Point(25,30), new Point(30,45));
        Rectangle rect3 = new Rectangle(new Point(50,30), new Point(60,45));
        GeometricObject[] g = new GeometricObject[3];
        g[0] = rect1;
        g[1] = rect2;
        g[2] = rect3;

        FrameDisplay frame = new FrameDisplay(g);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

         //Printing the info of the drawn rectangles
         for (int i = 0; i < g.length; i++) {
            System.out.println(g[i]);
        }
    }

}
