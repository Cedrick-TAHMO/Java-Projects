public class Triangle {
    private Point p1, p2, p3;

    public Triangle(Point p1In, Point p2In, Point p3In){
        p1 = p1In;
        p2 = p2In;
        p3 = p3In;
    }
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        p1 = new Point(x1,y1);
        p2 = new Point(x2,y2);
        p3 = new Point(x3,y3);
    }
public Point getP1(){
    return p1;
}

public Point getP2(){
    return p2;
}
public Point getP3(){
    return p3;
}
public void setP1(Point p1In){
p1 = p1In;
}
public void setP2(Point p2In){
p1 = p2In;
}
public void setP3(Point p3In){
p1 = p3In;
}

//Calculates the Perimeter
public double getPeriment(){
    return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
}
//Calculates the Area
public double getArea(){
             double ax = p1.getX();
               double bx = p2.getX();
               double cx = p3.getX();
               double ay = p1.getY();
               double by = p2.getY();
               double cy = p3.getY();

               double topPart = (ax*(by-cy)) + (bx*(cy-ay)) + (cx*(ay-by));
               return Math.abs(topPart/2.0);
}


}
