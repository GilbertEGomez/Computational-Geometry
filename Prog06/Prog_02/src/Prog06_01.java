import java.awt.Color;
import java.util.Random;
import javax.swing.*;

public class Prog06_01 {
    public static void main(String[] args) {
        new Prog06_01();
    }    
    public Prog06_01() {
        //frame size
        int frameWidth = 500;
        int frameHeight = 500;
        //defining the geometric objects that represents the problem data.
        int pointNumber = 10;
        LineSegment[] isArray = new LineSegment[pointNumber];
        
        //creating a set of random points
        Random rnd = new Random();
        double x,  y;
        for (int i=0; i< pointNumber; i++) {
            x = rnd.nextInt(frameWidth);
            y = rnd.nextInt(frameHeight);
            Point begin = new Point(x,y);
            x = rnd.nextInt(frameWidth);
            y = rnd.nextInt(frameHeight);
            Point end = new Point(x,y);

            isArray[i] = new LineSegment(begin, end);
            isArray[i].setBoundaryColor(Color.blue);
        }

    //graphing
    FrameDisplay frame = new FrameDisplay(frameWidth, frameHeight, isArray);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }
}
