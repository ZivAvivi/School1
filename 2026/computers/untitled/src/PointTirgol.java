import java.util.Map;
import java.util.Scanner;

public class PointTirgol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a num bigger than5 smaller than 10 -->");
        int size = input.nextInt();
        Point[] pArr = new Point[size];
        int x, y;
        for (int i = 0; i < pArr.length; i++) {
            System.out.print("enter value 1 - 10 ->");
            x = input.nextInt();
            System.out.print("enter value 1 - 10 ->");
            y = input.nextInt();
            pArr[i] = createPoint(x, y);
        }

        Point p1 = pArr[0];
        Point p2 = pArr[0];
        int longest = 0;
        int temp;
        for (int i = 0; i < pArr.length; i++) {
            x = pArr[i].getX();
            y = pArr[i].getY();
            for (int j = 0; j < pArr.length; j++) {
                if (x == pArr[j].getX())
                {
                    if (Math.abs(y - pArr[j].getY()) > longest)
                    {
                        longest = Math.abs(y - pArr[j].getY());
                        p1 = pArr[i];
                        p2 = pArr[j];
                    }
                } else if (y == pArr[j].getY())
                {
                    if (Math.abs(x- pArr[j].getX()) > longest)
                    {
                        longest = Math.abs(x - pArr[j].getX());
                        p1 = pArr[i];
                        p2 = pArr[j];
                    }
                }
            }
        }
        System.out.println(p2.toString());
        System.out.println(p1.toString());
    }

    public static Point createPoint(int x, int y){
        return new Point(x, y);
    }
}
