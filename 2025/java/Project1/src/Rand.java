import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // ex 1
        int sumD1 = 0;
        int sumD10 = 0;
        int sumD100 = 0;
        for (int i =1; i <= 80; i++)
        {
            int num = random.nextInt(100, 1000);

            if (i%10 !=0)
                System.out.print(num + " ");
            else
                System.out.println(num);
            sumD1 += num %10;
            sumD10 += num/10 %10;
            sumD100 += num /100;

        }
        System.out.println("the sum of the d1 is:" + sumD1);
        System.out.println("the sum of the d10 is:" + sumD10);
        System.out.println("the sum of the d100 is:" + sumD100);

        //ex 2
        int positiveSum = 0;
        int negetiveSum =0;
        int evenSum =0;
        for (int i =1; i <= 100; i++)
        {
            int num = random.nextInt(-100 , 100);

            if (i%10 !=0)
                System.out.print(num + " ");
            else
                System.out.println(num);

            if (num > 0)
                positiveSum += num;
            else
                negetiveSum += num;

            if (num%2 ==0)
                evenSum += num;

        }
        System.out.println("positive sum is:" + positiveSum);
        System.out.println("negative sum is:" + negetiveSum);
        System.out.println("even sum is:" + evenSum);

        for (int i =1; i <= 80; i++)
        {
            int num = random.nextInt(10, 100);
            int num2 = random.nextInt(10, 100);
            int num3 = random.nextInt(10, 100);

            if (i%10 !=0)
                System.out.print(num + " ");
            else
                System.out.println(num);

        }
        System.out.println("the sum of the d1 is:" + sumD1);
        System.out.println("the sum of the d10 is:" + sumD10);
        System.out.println("the sum of the d100 is:" + sumD100);
    }
}
