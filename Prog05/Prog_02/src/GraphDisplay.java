import javax.swing.*;
import java.awt.*;

public class GraphDisplay extends JPanel {
    //geometric objects are painted on this panel.
    GeometricObject[] gArray;

    /**
     *  Default Constructor
     */
    public GraphDisplay(GeometricObject[] g)
    {
        setGeometricObjects(g);
    }

    /**
     *  Sets geometric objects.
     */
    public void setGeometricObjects(GeometricObject[] g)
    {
        this.gArray = g;
    }

    /**
     * Paints this panel; the system invokes it every time
     * it deems necessary to redraw the panel.
     */
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
