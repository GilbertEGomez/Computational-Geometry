
import javax.swing.*;
import java.awt.*;

public class GraphDisplay extends JPanel
{
    GeometricObject[] gArray; //geometric objects
    
    /**
     * Parameterized constructor.
     */
    public GraphDisplay(int width, int height, GeometricObject[] g)
    {
        this.gArray = g;
        
        setBackground(Color.white);
        Dimension d = new Dimension(width, height);
        setPreferredSize(d);
        
    }

    /**
     * Paints this panel; the system invokes it every time
     * it deems necessary to redraw the panel.
     */
    @Override
    public void paint(Graphics g)
    {
        super.paint(g); //clears window

        //draws geometric objects
        for (GeometricObject e:gArray)
        {
            e.draw(g); //invokes object's draw method through polymorphism
        }
        
    }
}
