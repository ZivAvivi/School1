import java.util.Scanner;

public class vars {
    // קולט שני משתנים מהמשתמש ומחשב פעולות שונות
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("enter num1 --> ");
        num1 = input.nextInt();
        System.out.print("enter num2 --> ");
        num2 = input.nextInt();
        System.out.println(num1 + " + " + num2 + " = " +(num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " +(num1 - num2));
        System.out.println(num1 + " / " + num2 + " = " +(num1 / num2));
        System.out.println(num1 + " * " + num2 + " = " +(num1 * num2));
    }

}
/*
enter num1 --> 5
enter num2 --> 4
5 + 4 = 9
5 - 4 = 1
5 / 4 = 1
5 * 4 = 20


enter num1 --> 11
enter num2 --> 4
11 + 4 = 15
11 - 4 = 7
11 / 4 = 2
11 * 4 = 44
* */