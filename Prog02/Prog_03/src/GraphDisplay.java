import java.awt.Color;
import java.awt.Graphics;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
public class GraphDisplay extends JPanel {
    //vertex parameters
    private int leftX;
    private int topY;
    private int width;
    private int height;

    /**
     * Default constructor.
     */
    public GraphDisplay() {
       setVertex(100, 100, 50, 50); 
}

/**
 * Parameteredized Constructor
 */
public GraphDisplay(int leftX, int topY, int width, int height) {
    setVertex(leftX, topY, width, height);
}

/**
 * Vertex Mutator
 */
public void setVertex(int leftX, int topY, int width, int height) {
    this.leftX = leftX;
    this.topY = topY;
    this.width = width;
    this.height = height;
}

/**
 * Paints this panel; the system invokes it every time
 * it deems necessary to redraw the panel.
 */
public void paint(Graphics g) {
    g.setColor(Color.ORANGE);
    g.fillOval(leftX, topY, width, height);
    g.setColor(Color.BLACK);
    g.drawOval(leftX, topY, width, height);
}
}