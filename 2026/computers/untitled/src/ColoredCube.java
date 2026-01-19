public class ColoredCube {
    String Color;
    int Side;

    public ColoredCube(String color, int side) {
        Color = color;
        Side = side;
    }
    public ColoredCube() {
        Color = "test";
        Side = 6;
    }

    public int getSide() {
        return Side;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    public void setSide(int side) {
        Side = side;
    }

    @Override
    public String toString() {
        return "Color=" + Color  + ", Side=" + Side;
    }
}
