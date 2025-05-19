public class Point {
    private int x, y;
    public Point(int X, int Y){
        this.x = X;
        this.y = Y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int X) {
        this.x = X;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int Y) {
        this.y = Y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
