import javax.swing.JPanel;
import java.awt.*;
public class GraphDisplay extends JPanel {
    public void paint(Graphics g) {
        int leftX = 100;
        int topY = 100;
        int width = 50;
        int height = 50;
        int labelX = 17;
        int labelY = 31;
        int gridWidth = 150;

         //Draw vertex 1
    g.setColor(Color.ORANGE);
    g.fillOval(leftX, topY, width, height);
    g.setColor(Color.BLACK);
    g.drawString("1", leftX + labelX, topY + labelY);
    //Draw vertex 2
    g.setColor(Color.ORANGE);
    g.fillOval(leftX + gridWidth, topY, width, height);
    g.setColor(Color.BLACK);
    g.drawString("2", leftX + gridWidth + labelX, topY + labelY);
    //draw edge (1, 2)
    g.setColor(Color.BLACK);
    g.drawLine(leftX+width, topY+height/2, leftX+gridWidth, topY+height/2);
    
    }
   
}