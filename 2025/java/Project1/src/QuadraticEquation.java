import java.util.Scanner;

public class QuadraticEquation {
    // התוכנית הזו קולטת 3 מספרים שלמים ומחשבת את נוסחת השורשים
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        double x1, x2;
        System.out.print("Enter A ->:");
        a = input.nextInt();
        System.out.print("Enter B ->:");
        b = input.nextInt();
        System.out.print("Enter C ->:");
        c = input.nextInt();
        d = (int)Math.pow(b,2) -4*a*c;

        if (a==0)
            System.out.println("משוואה לינארית");
        else if (d < 0)
            System.out.println("no real answers ");
            else if (d ==0) {
            x1 = (double)(-1 * b) / (2 * a);
            System.out.println("x1: " + x1);
        } else
        {
            x1 = ((-1 * b) + Math.sqrt(d)) / (2 * a);
            x2 = ((-1 * b) - Math.sqrt(d)) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    }
}
/*
Enter A ->:1
Enter B ->:5
Enter C ->:6
x1: -2.0
x2: -3.0

Enter A ->:1
Enter B ->:5
Enter C ->:12
no real answers

Enter A ->:0
Enter B ->:4
Enter C ->:4
משוואה לינארית

Enter A ->:1
Enter B ->:0
Enter C ->:0
x1: 0.0
 */
