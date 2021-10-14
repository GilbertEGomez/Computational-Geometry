import javax.swing.*;
public class Prog02_05 {
    public static void main(String[] args) throws Exception {
        new Prog02_05();
    }

    public Prog02_05() {
        int leftX = 100;
        int topY = 100;
        int width = 50;
        int height = 50;

        FrameDisplay frame = new FrameDisplay(leftX, topY, width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        for(int i= 1; i<=100; i++) {
            delay(20);
            frame.setVertex(leftX+i, topY+i, width, height);
            frame.repaint();
        }
    
    }
    
        /**
         * Method that makes the thread that it's calling from to pause
         * 
         * @param ms milliseconds the thread will pause
         */
        public void delay(int ms) {
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {}
        }

   
}
