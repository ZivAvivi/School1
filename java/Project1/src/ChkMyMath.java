import java.util.Scanner;

public class ChkMyMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter num1 ->");
        int num1 = input.nextInt();
        System.out.print("enter num2 ->");
        int num2 = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + MyMath.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + MyMath.sub(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + MyMath.mult(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + MyMath.div(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + MyMath.divide(num1, num2));
        System.out.println(num1 + " % " + num2 + " = " + MyMath.mod(num1, num2));


    }
}

/*

enter num1 ->2
enter num2 ->2
2 + 2 = 4
2 - 2 = 0
2 * 2 = 4
2 / 2 = 1
2 / 2 = 1.0
2 % 2 = 0

* */