import java.awt.Color;
import javax.swing.*;

public class Prog03_04 {
    public static void main(String[] args) {
        new Prog03_04();
    }

    public Prog03_04() {
        double[] x = {0,2,2,0,-2,-2,-2,0,2};
        double[] y = {0,0,2,2,2,0,-2,-2,-2};

        //testing directions
        for (int i=0; i<x.length; i++)
        {
            Vector v = new Vector(x[i], y[i]);
            System.out.println("Direction of " + v + v.direction() + "\u00B0");
        }

        //testing other vector operations
        Vector v1 = new Vector(x[1], y[1]);
        Vector v2 = new Vector(x[2], y[2]);
        Vector sum = v1.add(v2);
        System.out.println("SUM operation: " + v1 + " + " + v2 + " = " + sum);
        System.out.println("Direction of sum vector: " + sum.direction() + "\u00B0");
        
        Vector neg = sum.neg();
        System.out.println("Negative sum vector: " + neg);
        System.out.println("Direction of negative sum vector: " + neg.direction() + "\u00B0");


    }
}