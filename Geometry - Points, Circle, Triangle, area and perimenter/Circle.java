public class Circle {

    //The center point of the circle

    private Point center; // A Circle  "has a " Point

    private double radius; // The radius of the CIrcle 

public Circle(Point centerIn, double radiusIn){
    radius = radiusIn;
    center = centerIn;
}

//Constructs a Circle given the (X,Y) values for the center as well as the radius. A Point object is created as part of constructing the circle

// Note: Two constructors is an example of overloading - the 
//          two constructors are in the same class and differ only in their parameters.

public Circle(double x, double y, double radiusIn){
    center = new Point(x,y);
    radius = radiusIn;
}

//Return center and radius of the circle
public Point getCenter()
{
    return center;
}
public double getRadius(){
    return radius;
}

//Changes the center Point for this Circle

public void setCenter(Point centerIn){
    center = centerIn;
}
public void setRadius(double radiusIn){
    radius = radiusIn;
}

// Calculates the area of the circle

public double getArea(){
    return Math.PI * radius * radius;
}

// Create a String representatiion of the Area

public String toString(){
    return "Circle[ center = "
        + center.toString() 
        + ", radius=" + radius + "]";
}
    
}
