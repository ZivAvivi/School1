public class ColoredPoint extends Point {

    private String color;

    public ColoredPoint() {
        super();
        this.color = "black";
    }

    public ColoredPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public ColoredPoint(ColoredPoint p) {
        super(p);
        this.color = p.color;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean equals(Point p) {
        ColoredPoint other = (ColoredPoint) p;
        return super.equals(p) && this.color.equals(other.color);
    }

    public String toString() {
        return super.toString() + " color: " + color;
    }
}