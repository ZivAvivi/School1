import java.util.Scanner;

public class tnaiPasot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // questions 1
        // prints big when num is bigger than 100, small when smaller and when exactly 100
        System.out.print("enter a num --> ");
        int num = input.nextInt();

        if (num>100)
            System.out.println("big");
        else if (num<100)
            System.out.println("small");



        System.out.println("------ \n");

        // questions 11
        System.out.print("enter a num --> ");
        num = input.nextInt();

        if (num > 7)
            System.out.println("a lot");
        else
            if (num < 7)
                System.out.println("little");
            else if (7==num)
                System.out.println("exactly");


        System.out.println("------ \n");

        // questions 12
        System.out.print("enter a num --> ");
        num = input.nextInt();
        System.out.print("enter a num2 --> ");
        int num2 = input.nextInt();

        if (num == num2)
            System.out.println("even");
        else
            System.out.println("different");


        System.out.println("------ \n");

        // questions 13
        System.out.print("enter a num --> ");
        num = input.nextInt();

        if (num > 0)
            System.out.println("positive");
        else
        if (num < 0)
            System.out.println("negative");
        else if (num == 0)
            System.out.println("is 0");

    }
}

/*
enter a num --> 2
small
------

enter a num --> 2
little
------

enter a num --> 5
enter a num2 --> 9
different
------

enter a num --> 0
is 0

* */



/*
enter a num --> 101
big
------

enter a num --> 7
exactly
------

enter a num --> 3
enter a num2 --> 3
even
------

enter a num --> -7
negative
**/