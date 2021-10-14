import java.util.Scanner;
import javax.swing.*;

public class Prog02_04 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter vertex description: ");
        int leftX = in.nextInt();
        int TopY = in.nextInt();
        int width = in.nextInt();
        int height = in.nextInt();

        FrameDisplay frame = new FrameDisplay(leftX, TopY, width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.print("Enter vertex description: ");
        leftX = in.nextInt();
        TopY = in.nextInt();
        width = in.nextInt();
        height = in.nextInt();

        frame.setVertex(leftX, TopY, width, height);
        frame.repaint();
        
        
    }
}
