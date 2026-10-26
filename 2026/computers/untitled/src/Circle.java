public class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() { return center; }
    public void setCenter(Point center) { this.center = center; }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public double area() {return Math.PI * radius * radius;}
    public double perimeter() {return 2 * Math.PI * radius;}

    public boolean equals(Circle c) {
        return center.equals(c.center) && radius == c.radius;
    }

    public String toString() {
        return "center: " + center + ", radius: " + radius;
    }
}