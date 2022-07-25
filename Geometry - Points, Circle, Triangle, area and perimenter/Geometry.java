public class Geometry {
    public static void main(String[] args) {

        Point p1 = new Point(9.0, 5.0);
        Circle circle1 = new Circle(p1, 1.5);

        Point p2 = new Point(10.0, 0.0);
        Circle circle2 = new Circle(p2, 2.0);

        Point p3 = new Point(1.0, 0.0);
        Triangle myTriangle = new Triangle(p1, p2, p3);

        System.out.println("p1: " + p1.toString());
        System.out.println("\ncircle1: " + circle1.toString());

        System.out.println("\nDistance from p3 to p1: " + p3.distance(p1));

        System.out.println("\nArea of circle2: " + circle2.getArea());

        System.out.println("\nPerimeter of myTriangle: " + myTriangle.getPeriment());

        double dist1to2 = p1.distance(p2) - (circle1.getRadius() + circle2.getRadius());
        System.out.println("\nDistance from circle 3 to circle 1: " + dist1to2);
    }
}
