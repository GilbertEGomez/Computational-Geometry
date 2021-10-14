import java.awt.Color;
import javax.swing.*;

public class Prog03_02 {
    public static void main(String[] args)
    {
        new Prog03_02();
    }

    public Prog03_02() {
        GeometricObject[] g = new GeometricObject[3];
        Point p1 = new Point(200, 100);
        p1.setInteriorColor(Color.RED);
        Point p2 = new Point(200, 150);
        p2.setInteriorColor(Color.YELLOW);
        Point p3 = new Point(200, 200);
        p3.setInteriorColor(Color.GREEN);
        g[0] = p1;
        g[1] = p2;
        g[2] = p3;
        
        FrameDisplay frame = new FrameDisplay(g);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}