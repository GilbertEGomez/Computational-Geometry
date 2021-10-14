import java.awt.Color;
import javax.swing.*;
public class Prog03_05 {
    public static void main(String[] args) throws Exception {
        new Prog03_05();
    }

    public Prog03_05() {
        GeometricObject[] g = new GeometricObject[3];
        Point p1 = new Point(200,100);
        p1.setInteriorColor(Color.RED);
        Point p2 = new Point (200, 150);
        p2.setInteriorColor(Color.YELLOW);
        Point p3 = new Point (200, 200);
        p3.setInteriorColor(Color.GREEN);
        g[0] = p1;
        g[1] = p2;
        g[2] = p3;

        FrameDisplay frame = new FrameDisplay(g);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Vector rv = new Vector(-1, 1); //translation vector for red point.
        Vector gv = new Vector(1, -1); //translation vector for green point.

        delay(500);

        for(int i = 1; i<=50; i++) {
            delay(50);

            p1.translate(rv);
            g[0] = p1;

            p3.translate(gv);
            g[2] = p3;

            //frame.setGeometricObjects(g);
                                // For illustartion purposes only;
                                //No need to invoke setGeometricObjects in
                                //this case.
            frame.repaint();

        }

    }

    public void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
    }
}
