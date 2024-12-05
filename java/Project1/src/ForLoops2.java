import java.util.Random;
import java.util.Scanner;

public class ForLoops2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int i;

        for(i = 1; i < 100; i ++)
        {
            if (i%7 == 0 || i%10 ==7 || i/10 == 7)
                System.out.println("BOOM ");
            else
                System.out.print(i + " ");
        }

        int count = 0;
        System.out.print("enter N -->");
        int n = input.nextInt();
        for (i=1; i <= n; i++)
        {
            int num = 1+ random.nextInt(100);
            if (num>9 && (num%10)/(num/10) == 0)
            {
                count++;
                System.out.println("deviding" + num);
            }
        }


        System.out.print("enter N -->");
        n = input.nextInt();
        count = 0;
        int temp = 1;
        int num = 1;
        for (i=1; i <= n; i++)
        {
            temp = num;
            num = 1+ random.nextInt(100);
            if (temp/num == 0)
            {
                count++;
                System.out.println("deviding" + num);
            }
        }


    }
}
