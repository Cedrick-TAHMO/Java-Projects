// Representats a point in a 2D plane, defines as (x,y). 
// @author Cedrick TAHMO

public class Point {

    // The location of the point in the X direction
    private double x;

    // The location of the point in the Y direction
    private double y;

    // Constructs a Point from given x and y values.
    // @param xIn the location of the Point in the X direction.
    // @param yIn the location of the Point in the Y direction.

    public Point(double xIn, double yIn){
        x = xIn;
        y = yIn;

    }

        // Returns the x value for this Point

    public double getX(){
        return x;
    }

        // Returns the y value for this Point
    public double getY(){
        return y;
    }
    
    // Calculates the distance between this Point and another Point using the Pythagora's Theorem.
    public double distance (Point other){
        double dx = x - other.getX();
        double dy = y - other.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    //Returns a String representation of the x and y values for this Point

    public String toString(){
        return "Point[x=" + x  + ", y =" + y + "]";
    }

    //Change the x value for this Point.

    public void setX(double xIn){
        x=xIn;
    }

    //Changes the y value for this Point

    public void setY(double yIn){
        y=yIn;
    }




}