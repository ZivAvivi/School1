public class Cylinder extends Circle {

    private double height;

    public Cylinder(Point center, double radius, double height) {
        super(center, radius);
        this.height = height;
    }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double lateralArea() {
        return Math.round(2 * Math.PI * getRadius() * height * 100) / 100.0;
    }

    public double surfaceArea() {
        double r = getRadius();
        return Math.round((2 * Math.PI * r * r + 2 * Math.PI * r * height) * 100) / 100.0;
    }

    public double volume() {
        double r = getRadius();
        return Math.round(Math.PI * r * r * height * 100) / 100.0;
    }

    public String toString() {
        return "Cylinder: " + super.toString() + ", height: " + height + ", surface area: " + surfaceArea() + ", lateral area: " + lateralArea();
    }
}