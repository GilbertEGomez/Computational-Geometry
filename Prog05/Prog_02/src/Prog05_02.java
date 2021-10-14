public class Prog05_02 {
    public static void main(String[] args) throws Exception {
        new Prog05_02();
    }
    public Prog05_02() {
        K2Tree tree = new K2Tree();
        //Rectangle points
        Point p1 = new Point(25,50);
        tree.add(p1);
        Point p2 = new Point(65,50);
        tree.add(p2);

        //Interior Points
        Point p3 = new Point(30,50);
        tree.add(p3);
        Point p4 = new Point(35,50);
        tree.add(p4);

        //These two points shouldn't be within Rectangle. Shouldn't Print out.
        Point p5 = new Point(100,200);
        tree.add(p5);
        Point p6 = new Point(200,300);
        tree.add(p6);
       
        Rectangle r = new Rectangle(p1,p2);
        tree.pointsInRange(r);
    }
}
