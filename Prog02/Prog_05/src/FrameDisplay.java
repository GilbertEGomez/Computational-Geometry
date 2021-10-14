import javax.swing.*;

public class FrameDisplay extends JFrame {
    int WIDTH = 450;
    int HEIGHT = 450;

    private GraphDisplay panel;

    public FrameDisplay(int leftX, int topY, int width, int height) {
        setTitle("Graph Display");
        setSize(WIDTH, HEIGHT);

        panel = new GraphDisplay(leftX, topY, width, height);
        add(panel);
     }
    
     public void setVertex(int leftX, int topY, int width, int height) {
         panel.setVertex(leftX, topY, width, height);
     }

     public void repaint() {
         panel.repaint();
     }
     
    }

