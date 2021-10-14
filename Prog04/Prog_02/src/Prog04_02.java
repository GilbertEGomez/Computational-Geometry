import javax.swing.*;
public class Prog04_02 {
    public static void main(String[] args) throws Exception {
        GeometricObject[] g = new GeometricObject[2];
        RectPolygon poly1 = new RectPolygon();
        RectPolygon poly2 = new RectPolygon();
        poly1.addValue(new Point(50,50));
        poly1.addValue(new Point(80,100));
        poly1.addValue(new Point(90,300));
        poly1.addValue(new Point(10,50));
        poly2.addValue(new Point (9,5));
        poly2.addValue(new Point (12,15));
        poly2.addValue(new Point (15,35));
        poly2.addValue(new Point (9,20));

        g[0] = poly1;
        g[1] = poly2;
        FrameDisplay frame = new FrameDisplay(g);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("The area of the first polygon is " + poly1.area());
        System.out.println("The area of the second polygon is " + poly2.area());
    }
}
