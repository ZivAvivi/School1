public class Cylinder extends Circle {

    private double height;

    public Cylinder(Point center, double radius, double height) {
        super(center, radius);
        this.height = height;
    }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double lateralArea() {
        return perimeter() * height;
    }

    public double surfaceArea() {
        return 2 * area() + lateralArea();
    }

    public double volume() {
        return area() * height;
    }

    public String toString() {
        return "Cylinder: " + super.toString() + ", height: " + height;
    }
}