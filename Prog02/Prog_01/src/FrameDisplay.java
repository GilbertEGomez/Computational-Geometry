import javax.swing.*;

public class FrameDisplay extends JFrame {
    int WIDTH = 450;
    int Height = 450;

    public FrameDisplay() {
        setSize(WIDTH, Height);
        setTitle("Graph Display");
        GraphDisplay panel = new GraphDisplay();
        add(panel);
    }

}
