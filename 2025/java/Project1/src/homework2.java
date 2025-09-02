import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //question one
        // this will calculate how much TAX you need to pay
        System.out.print("how much money did you earn? -->");
        int money = input.nextInt();
        if (money < 2001)
            System.out.println("you dont need to pay tax");
        else if (money < 4001)
            System.out.println("you need to pay " + money *0.25);
        else
            if (money < 5001)
                System.out.println("you need to pay " + money * 0.35);
            else
                System.out.println("you will need to pay " + money * 0.45);


        // question 43
        System.out.print("enter a 4 digit number -->");
        int password = input.nextInt();
        int d1, temp, d10, d100, d1000;
        double sum = 0;
        d1 = password % 10;
        temp = password /10;
        d10 = temp % 10;
        temp = temp /10;
        d100 = temp % 10;
        d1000 = temp / 10;
        sum = (d10 + d100 + d1000) /5.0;
        if(d1 == sum)
            System.out.println("password is correct");
        else System.out.println("password is not current");

        //quastion 44
        System.out.print("enter num 1 -->");
        int num1 = input.nextInt();
        System.out.print("enter num 2 -->");
        int num2 = input.nextInt();
        System.out.print("enter num 3 -->");
        int num3 = input.nextInt();
        System.out.print("enter num 4 -->");
        int num4 = input.nextInt();

        if (num1 + num2 == num3 + num4)
            System.out.println(num1 + "+" + num2 + "=" + num3 + num4);
        if (num2 + num3 == num1 + num4)
            System.out.println(num2 + "+" + num3 + "=" + num4 + num1);
        if (num2 + num4 ==  num1 + num3)
            System.out.println(num2 + "+" + num4 + "=" + num3 + num1);

    }
}
