import java.awt.Color;
import javax.swing.*;
public class Prog03_06 {
    public static void main(String[] args) throws Exception {
        new Prog03_06();
    }

    public Prog03_06() {
        GeometricObject[] g = new GeometricObject[3];
        Point p0 = new Point(200, 100);
        p0.setInteriorColor(Color.RED);
        Point p1 = new Point(200, 150);
        p1.setInteriorColor(Color.YELLOW);
        Point p2 = new Point(200, 200);
        p2.setInteriorColor(Color.GREEN);
        g[0] = p0;
        g[1] = p1;
        g[2] = p2;

        FrameDisplay frame = new FrameDisplay(g);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        delay(500);

        Vector v = new Vector(p1.getX(), p1.getY());
        
        while(true) {
            delay(5);
            p0.translate(v.neg());
            p0.rotate(1);
            p0.translate(v);

            p2.translate(v.neg());
            p2.rotate(1);
            p2.translate(v);
            
            frame.repaint();
        }
    }

    public void delay (int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

