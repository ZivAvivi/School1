import java.util.Scanner;

public class ChekNum3Dig {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1, d10, d100;
        System.out.print("enter d1 -->");
        d1 = input.nextInt();
        System.out.print("enter d10 -->");
        d10 = input.nextInt();
        System.out.print("enter d100 -->");
        d100 = input.nextInt();
        Num3Digit num = new Num3Digit(d1, d10, d100);
        System.out.println(num.getD100() + num.getD10() *10 + num.getD1() *100);

    }
}
