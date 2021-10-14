import java.awt.Color;
import java.util.Random;

public class Prog03_07 {
    public static void main(String[] args) throws Exception {
        new Prog03_07();
    }

    public Prog03_07() {
        GeometricObject[] g = new GeometricObject[10];
        Point[] points = new Point[10];
        Random rnd = new Random();

        for(int i=0; i<10; i++) {
            double x = rnd.nextDouble()*400;
            double y = rnd.nextDouble()*400;
            points[i] = new Point(x, y);
            points[i].setInteriorColor(Color.CYAN);
            g[i] =  points[i];
        }
        FrameDisplay frame = new FrameDisplay(g);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        delay(1000);
        int[] indices = new int[2];
        Algorithms.closestPairOfPoints(points, indices);
        points[indices[0]].setInteriorColor(Color.RED);
        points[indices[1]].setInteriorColor(Color.RED);
        frame.repaint();
    }
    /**
     * Method that takes the thread it's called from to pause
     * @param ms milliseconds the thread will pause
     */
    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
