public class ColoredPoint extends Point
{
    private String color;

    public ColoredPoint(int x, int y, String color)
    {
        super(x, y);
    }
    public String  getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
}
