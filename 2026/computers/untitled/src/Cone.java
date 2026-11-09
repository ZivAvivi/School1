
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
        return Math.round(Math.PI * getRadius() * slant() * 100) / 100.0;
    }

    public double surfaceArea() {
        double r = getRadius();
        return Math.round((Math.PI * r * slant() + Math.PI * r * r) * 100) / 100.0;
    }

    public double volume() {
        double r = getRadius();
        return Math.round(Math.PI * r * r * height / 3 * 100) / 100.0;
    }

    public String toString() {
        return "Cylinder: " + super.toString() + ", height: " + height + ", surface area: " + surfaceArea() + ", lateral area: " + lateralArea();
    }
}

/*
Type: Circle
circle: (1, 2), radius: 3.0, area: 28.27, perimeter: 18.85

Type: Cylinder
Cylinder: center: (0, 0), radius: 2.0, area: 12.57, perimeter: 12.57, height: 5.0, surface area: 87.96, lateral area: 62.83

Type: Cone
Cylinder: center: (3, 4), radius: 1.5, area: 7.07, perimeter: 9.42, height: 4.0, surface area: 27.2, lateral area: 20.13

Type: Circle
circle: (1, 2), radius: 3.0, area: 28.27, perimeter: 18.85
* */