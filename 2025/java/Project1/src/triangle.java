import java.util.Scanner;

public class triangle {
    // this program calculates the 3 medians in a triangle and its area
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("enter a ->: ");
        a = input.nextInt();
        System.out.print("enter b ->: ");
        b = input.nextInt();
        System.out.print("enter c ->: ");
        c = input.nextInt();

        // all length of the triangles squared
        double pa = Math.pow(a,2);
        double pb = Math.pow(b,2);
        double pc = Math.pow(c,2);

        // calculates the median
        double ma = Math.sqrt((2*pb+2*pc-pa)/4);
        double mb = Math.sqrt((2*pa+2*pc-pb)/4);
        double mc = Math.sqrt((2*pb+2*pc-pc)/4);

        System.out.println("the median to A is: "+ ma);
        System.out.println("the median to B is: "+ mb);
        System.out.println("the median to C is: "+ mc);

        double p = (a+b+c)/2; // half of the circumference of the triangle
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c)); // the area of the triangle
        System.out.println("the area of the triangle is: " + area);
    }
}
/*
enter a ->: 3
enter b ->: 4
enter c ->: 5
the median to A is: 4.272001872658765
the median to B is: 3.605551275463989
the median to C is: 3.774917217635375
the area of the triangle is: 6.0

enter a ->: 8
enter b ->: 10
enter c ->: 14
the median to A is: 11.489125293076057
the median to B is: 10.246950765959598
the median to C is: 9.9498743710662
the area of the triangle is: 39.191835884530846
* */