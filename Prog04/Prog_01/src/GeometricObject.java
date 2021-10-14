
import java.awt.*;

abstract public class GeometricObject
{
    private Color boundaryColor;    //boundary color
    private Color interiorColor;    //interior color

    /**
     * Default constructor; sets object to default colors.
     */
    public GeometricObject()
    {
        interiorColor = Color.white;
        boundaryColor = Color.black;
    }

    /**
     * Parameterized constructor; sets object to user colors.
     */
    public GeometricObject(Color iC, Color bC)
    {
        interiorColor = iC;
        boundaryColor = bC;
    }

    /**
     * Abstract drawing method, to be implemented in subclasses.
     * 
     * @param g device context where object is drawn in
     */
    abstract public void draw(Graphics g);

    /**
     * Accessor method.
     */
    public Color getBoundaryColor()
    {
        return boundaryColor;
    }
    
    /**
     * Accessor method.
     */
    public Color getInteriorColor()
    {
        return interiorColor;
    }

    /**
     * Mutator method.
     */
     public void setBoundaryColor(Color boundaryColor)
    {
        this.boundaryColor = boundaryColor;
    }
    
    /**
     * Mutator method.
     */
     public void setInteriorColor(Color interiorColor)
    {
        this.interiorColor = interiorColor;
    }

    @Override
    public String toString()
    {
        String str;
        str = "BOUNDARY (" +
              boundaryColor.getRed() + ", " +
              boundaryColor.getGreen() + ", " +
              boundaryColor.getBlue() + ", " +
              boundaryColor.getAlpha() + ") " +
              "INTERIOR (" +
              interiorColor.getRed() + ", " +
              interiorColor.getGreen() + ", " +
              interiorColor.getBlue() + ", " +
              interiorColor.getAlpha() + ")";
        return str;
    }
}
