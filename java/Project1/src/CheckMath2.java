import java.util.Scanner;

public class CheckMath2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" הכנס מספר שלם חיובי1 ->");
        int num1 = input.nextInt();
        System.out.print("הכנס מספר שלם חיובי2 ->");
        int num2 = input.nextInt();

        System.out.println("is " + num1 + " prime? " + MyMath.isPrime(num1));
        System.out.println("the square root of " + num1 + " with the approximation of 3 numbers after the dot is " + MyMath.squreRoot(num1));
        System.out.println("the first 10 digits of fiboonachi are");
        MyMath.fibonacci();
        System.out.println("all the numbers that are smaller in the fibonacci sequance than " + num2 + "are");
        MyMath.fiboSmallerNum(num2);

    }
}
