import javax.swing.*;

public class FrameDisplay extends JFrame {
    int WIDTH = 450;
    int HEIGHT = 450;

    public FrameDisplay(int leftX, int topY, int width, int height) {
        setTitle("Graph Display");
        setSize(WIDTH, HEIGHT);

        GraphDisplay panel = new GraphDisplay(leftX, topY, width, height);
        add(panel);
     }
    }


