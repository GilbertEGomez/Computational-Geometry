/**
 * This class represents a K-2 tree.
 */
public class K2Tree
{
    private Node root;    //root of the k-2 tree; implemented as a dummy node.
    
    public K2Tree()
    {
        root = new Node();  //dummy node as the root
        root.setLeftChild(null);
        root.setRightChild(null);
        root.setInfo(null); //dummy Point assigned to the root
    }
    
    public void add(Point p)
    {
        root.setLeftChild(add(p, root.getLeftChild(), "even"));
    }

    public boolean isEmpty()
    {
        return root.getLeftChild() == null;
    }
    
    /**
     * Prints points in this tree object contained in the given rectangle.
     * 
     * @param r rectangle
     */
    public void pointsInRange(Rectangle r)
    {
        pointsInRange(r, root.getLeftChild(), "even");
    }

    public String toString()
    {
        String str = toString(root.getLeftChild());
        str = "[" + str.substring(0, str.length()-2) + "]";

        return str;
    }

    private Node add(Point p, Node node, String level)
    {
        if (node == null)
            node = new Node(p);
        else
            switch (level)
            {
                case "even" ->
                {
                    if (p.getX() < node.getInfo().getX())
                        node.setLeftChild(add(p, node.getLeftChild(), "odd"));
                    else
                        node.setRightChild(add(p, node.getRightChild(), "odd"));
                }
                case "odd" ->
                {
                    if (p.getY() < node.getInfo().getY())
                        node.setLeftChild(add(p, node.getLeftChild(), "even"));
                    else
                        node.setRightChild(add(p, node.getRightChild(), "even"));
                }
            }

        return node;
    }

    private void pointsInRange(Rectangle r, Node node, String level)
    {
        if (node != null)
        {
            double minX = r.smallestX();
            double maxX = r.greatestX();
            double minY = r.smallestY();
            double maxY = r.greatestY();

            double x = node.getInfo().getX();
            double y = node.getInfo().getY();

            if ((minX<=x && x<=maxX) &&
                (minY<=y && y<=maxY))
            {
                System.out.println(node.getInfo());
            }

            switch (level)
            {
                case "even" ->
                {
                    if (minX <= x)
                        pointsInRange(r, node.getLeftChild(), "odd");
                    if (maxX >= x)
                        pointsInRange(r, node.getRightChild(), "odd");
                }

                case "odd" ->
                {
                    if (minY <= y)
                        pointsInRange(r, node.getLeftChild(), "even");
                    if (maxY >= y)
                        pointsInRange(r, node.getRightChild(), "even");
                }
            }
        }
    }

    private String toString(Node p)
    {
        if (p != null)
        {
            return toString(p.getLeftChild()) +
                   p.getInfo() + ", " +
                   toString(p.getRightChild());
        } 
        else return "";
    }
}
