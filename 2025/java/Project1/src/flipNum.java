import java.util.Scanner;

public class flipNum {
    // flips 2 digits, 3 digits and 4 digits number
    public static void main(String[] args) {
        int d1, d10, num, newNum;
        Scanner input = new Scanner(System.in);

        // flips a 2 digit number
        System.out.print("enter 2 digits number ->");
        num = input.nextInt();
        d1 = num % 10;
        d10 = num / 10;
        newNum = d1 * 10 + d10;
        System.out.println("the original number is: "+ num);
        System.out.println("the reversed number is: "+ newNum);

        System.out.println("\n-------------------\n");

        // flips 3 digit number
        int d100, temp;
        System.out.print("enter 3 digit number ->");
        num = input.nextInt();
        d1 = num % 10;
        temp = num /10;
        d10 = temp % 10;
        d100 = temp / 10;
        newNum = d1 * 100 + d10 * 10 + d100;
        System.out.println("the original number is: "+ num);
        System.out.println("the reversed number is: "+ newNum);

        System.out.println("\n-------------------\n");

        //flips 4 digit number
        int d1000;
        System.out.print("enter 4 digit number ->");
        num = input.nextInt();
        d1 = num % 10;
        temp = num /10;
        d10 = temp % 10;
        temp = temp /10;
        d100 = temp % 10;
        d1000 = temp / 10;
        newNum = (d1 * 1000) + (d10 *100) + (d100 * 10) + d1000;
        System.out.println("the original number is: "+ num);
        System.out.println("the reversed number is: "+ newNum);
    }
}

/*
enter 2 digits number ->23
the original number is: 23
the reversed number is: 32

-------------------

enter 3 digit number ->234
the original number is: 234
the reversed number is: 432

-------------------

enter 4 digit number ->2345
the original number is: 2345
the reversed number is: 5432
* */