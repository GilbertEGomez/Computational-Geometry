import javax.swing.*;
import java.awt.*;

public class GraphDisplay extends JPanel
{
    //vertex parameters
    Point p;

    /**
     * Default Constructor
     */

     public GraphDisplay()
    {
        setVertex(new Point());
    }
    /**
     * Parameterized constructor
     */
    public GraphDisplay(Point p)
    {
        setVertex(p);
    }
    /**
     * Vertex mutator
     */

     public void setVertex(Point p)
     {
         this.p = p;
     }
    /**
     * Paints this panel; the system invokes it every time
     * it deems necessary to redraw the panel.
     */
    public void paint(Graphics g)
    {
        super.paint(g); //clears window
        //draw vertex
        p.draw(g);
    }
}