import java.awt.Graphics;

public class Line extends GeometricObject {

    private LineSegment dummy = new LineSegment();
    //Set up points to intersect
    public Line(Point a, Point b) {
        dummy.setBegin(a);
        dummy.setEnd(b);
    }
    // Creating m
    private double slope = (dummy.getEnd().getY()-dummy.getBegin().getY() /
                            dummy.getEnd().getY() - dummy.getBegin().getY());
    
    double getSlope() {
        return slope;
    }

    double intersection() {
        //double intersect = 

        return 0;
    }

    @Override
    public void draw(Graphics g) {
        // TO be edited.
        g.setColor(getBoundaryColor());
          g.drawLine((int)dummy.getBegin().getX(), (int)dummy.getBegin().getY(), 
                    (int)dummy.getEnd().getX(),(int)dummy.getEnd().getY());
    }


}