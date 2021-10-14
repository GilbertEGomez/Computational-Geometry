import javax.swing.*;

public class FrameDisplay extends JFrame
{
    int WIDTH = 450;
    int HEIGHT = 450;

    private GraphDisplay panel;

    public FrameDisplay(Point p)
    {
        setTitle("Graph Display");
        setSize(WIDTH, HEIGHT);

        panel = new GraphDisplay(p);
        add(panel);
    }

    public void setVertex(Point p)
    {
        panel.setVertex(p);

    }

    public void repaint()
    {
        panel.repaint();
    }
}