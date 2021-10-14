import javax.swing.*;

public class FrameDisplay extends JFrame
{
    int WIDTH = 450;
    int HEIGHT = 450;

    private GraphDisplay panel;

    public FrameDisplay(GeometricObject[] g)
    {
        setTitle("Graph Display");
        setSize(WIDTH,HEIGHT);

        panel = new GraphDisplay(g);
        add(panel);
    }
}