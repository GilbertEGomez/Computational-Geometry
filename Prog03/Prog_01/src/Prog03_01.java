import javax.swing.*;
import java.awt.Color;

public class Prog03_01 {
    public static void main(String[] args) throws Exception {
        new Prog03_01();
    }
    public Prog03_01() {
        //set Geometric object
        Point p = new Point(100,100);
        p.setInteriorColor(Color.BLUE);
        FrameDisplay frame = new FrameDisplay(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //modify object and pass updated object to frame.

        for (int i = 1 ; i<=10; i++)
        {
            delay(500);
            
            p.setX(p.getX()+30);
            if(i%2 == 0)
            { p.setY(p.getY()+30);}
            
            else p.setY(p.getY()-30);

            System.out.println(p);
            frame.setVertex(p);
            frame.repaint();
        }
    }

    public void delay(int ms)
    {
        try{
            Thread.sleep(ms);

        } catch (InterruptedException e)
        {

        }
    }
}
