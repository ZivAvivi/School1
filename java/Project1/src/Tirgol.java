import java.util.Random;
import java.util.Scanner;

public class Tirgol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(10, 100);
        int count =0;
        while (num!=99)
        {
            if(num/10 == num%10) // checks if the first digits equals the 2nd
            {
                count++;
            }
            num = random.nextInt(10, 100);
        }
        System.out.println("count: " + count);

        //---------------------------------------

        num = 0;
        count = 0;
        while (num != -1)
        {
            if (num%5==0 || num%3==0)
                count++;
            System.out.print("enter a num that is less than 100 -->");
            num = input.nextInt();
        }
        System.out.println(count + " numbers are devideable by 5 or 3");

        //-------------------------------------------

        count = 0;
        int sum = 0;
        System.out.print("enter your grade -->");
        num = input.nextInt();
        while (num!=-1)
        {
            count++;
            sum+=num;
            System.out.print("enter your grade -->");
            num = input.nextInt();
        }
        System.out.println("Your avg grade is: " + (double)sum/count);

        //--------------------------------------------

        System.out.print("enter num between (70 to 120) -->");
        int temp = num = input.nextInt();
        for (int i = 0; i < 9; i++) {
            System.out.print("enter num between (70 to 120) -->");
            num = input.nextInt();
            if(temp<num)
                temp = num; // temp is the biggest number
        }
        System.out.println("the biggest num is " + temp);

        //---------------------------------------------

        System.out.print("enter num between (70 to 120) -->");
        temp = num = input.nextInt();
        while (num!=-1){
            System.out.print("enter num between (70 to 120) -->");
            num = input.nextInt();
            if(temp<num)
                temp = num; // temp is the biggest number
        }
        System.out.println("the biggest num is " + temp);

        //----------------------------------------------


        count = 0;
        int count2 = 0;
        System.out.print("enter a num between -100 to 100 -->");
        num = input.nextInt();
        while (num!=-101)
        {
            if (num%2==0)
                count2++;
            else
                count++;
            System.out.print("enter a num between -100 to 100 (-101 to exit) -->");
            num = input.nextInt();
        }
        System.out.println(count + " numbers are devideable by 5 or 3");

        //--------------------------------------------

        System.out.print("enter the bucket coppasity -->");
        int bucket = input.nextInt();
        System.out.print("enter the tank coppasity -->");
        int tank = input.nextInt();
        System.out.print("enter how much water there is in the tank -->");
        int water = input.nextInt();
        count = 0;
        while(water > tank/4.0)
        {
            water -= bucket;
            count++; // counts how many buckets it used
            System.out.println(water);
        }
        System.out.println("you needed " + count + " buckets to empty the tank");
    }
}
