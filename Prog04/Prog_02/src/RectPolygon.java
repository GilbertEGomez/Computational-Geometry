import java.awt.Graphics;
public class RectPolygon extends GeometricObject {
    Point[] vertexList;
    int size;
    int vertNumber;

    public RectPolygon() {
        size = 100;
        vertexList = new Point[size];
        vertNumber = 0;
    }

    public void addValue(Point v) {
        vertexList[vertNumber] = v;
        vertNumber++;
    }
    public void draw(Graphics g) {
        int[] xCoord = new int[vertNumber];
        int[] yCoord = new int[vertNumber];

        for(int i = 0; i < vertNumber; i++) {
            xCoord[i] = (int) vertexList[i].getX();
        }
        for(int i = 0; i < vertNumber; i++) {
            yCoord[i] = (int) vertexList[i].getY();
        }

        //Shade and draw Polygon
       g.fillPolygon(xCoord, yCoord, vertNumber);
        }
    

    public double area() {

        if(vertNumber <4) return Double.NaN;
        double sum1 = 0.0, sum2 = 0.0;
        Point v1, v2;
        for (int i = 0; i < vertNumber; i++) {
            v1 = vertexList[i];
            v2 = vertexList[(i + 1) % vertNumber];

            sum1 += v1.getX() * v2.getY();
            sum2 += v2.getX() * v1.getY();

        }
        //Shoelace Formula to calculate the area.
        double area = 0.5 * Math.abs(sum1 - sum2);
        return area;
    }

    
}
