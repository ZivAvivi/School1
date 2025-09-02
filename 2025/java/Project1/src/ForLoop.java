import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(i);
            sum+=i;
        }
        System.out.println();
        System.out.println(sum);
        sum = 0;
        for (int i = 30; i <= 50; i++)
        {
            System.out.print(i);
            sum+=i;
        }
        System.out.println();
        System.out.println(sum);
        sum =0;
        for (int i = 200; i <= 300; i++)
            sum+=i;

        System.out.println();
        System.out.println(sum);
        sum=0;

        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        for (int i = 1; i <= 100; i++)
        {
            num1 = input.nextInt();
            num2 = input.nextInt();
            num3 = input.nextInt();
            sum = num1+num2+num3;
            if (num2 == num2+num1)
                System.out.println("yes");
            else System.out.println("no");
        }
        System.out.println();
        System.out.println(sum);
    }
}
