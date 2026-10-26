public class Cone extends Circle {

    private double height;

    public Cone(Point center, double radius, double height) {
        super(center, radius);
        this.height = height;
    }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    private double slant() {
        double r = getRadius();
        return Math.sqrt(r * r + height * height);
    }

    public double lateralArea() {
        return Math.PI * getRadius() * slant();
    }

    public double surfaceArea() {
        return lateralArea() + area();
    }

    public double volume() {
        return area() * height / 3;
    }

    public String toString() {
        return "Cone: " + super.toString() + ", height: " + height;
    }
}