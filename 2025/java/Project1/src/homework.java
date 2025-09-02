import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // questions 1
        System.out.print("enter a num --> ");
        int num = input.nextInt();

        if (num%2 ==0)
            System.out.println("even");
        else
            System.out.println("odd");


        System.out.println("--- \n");

        // questions 2
        System.out.print("enter a num --> ");
        num = input.nextInt();
        System.out.print("enter a num2 --> ");
        int num2 = input.nextInt();

        if (num == num2)
            System.out.println("even");
        else
            System.out.println("sum is " + (num + num2));
            System.out.println("product is " + (num * num2));


        System.out.println("------ \n");

        // questions 3
        int d100, temp, d1, d10;
        System.out.print("enter a 3digit num --> ");
        num = input.nextInt();
        d1 = num % 10;
        temp = num /10;
        d10 = temp % 10;
        d100 = temp / 10;
        if (d1 + d10 == d100)
            System.out.println("yes");
        else
            System.out.println("no");


        System.out.println("------ \n");

        // questions 4
        System.out.print("enter a 2 digit num --> ");
        num = input.nextInt();
        d1 = num % 10;
        temp = num /10;
        d10 = temp % 10;
        if (d1%2 ==0 && d10 %2 ==0)
            System.out.println("2");
        else
            if (d1 %2 ==0 && d10%2 != 0)
            System.out.println("1");
            else
                if (d1 %2 !=0 && d10%2 == 0)
                    System.out.println("1");
                else
                     System.out.println("0");


        System.out.println("--- \n");

        // questions 5
        System.out.print("enter a num --> ");
        num = input.nextInt();
        System.out.print("enter a num2 --> ");
        num2 = input.nextInt();
        if (num != num2)
            if (num > num2)
                System.out.println(num);
            else System.out.println(num2);
        else
            System.out.println("they are the same " + num + "=" + num2);

        System.out.println("--- \n");

        // questions 6
        System.out.print("how many kids are going to the trip --> ");
        num = input.nextInt();

        if (num%4 ==0)
            System.out.println((num/4) + "jeeps are needed");
        else System.out.println((num/4 + 1) + "jeeps are needed");

        System.out.println("--- \n");

        // questions 7
        System.out.print("enter a 2 digit num --> ");
        num = input.nextInt();
        d1 = num % 10;
        temp = num /10;
        d10 = temp % 10;
        System.out.print("enter 1 digit num --> ");
        num2 = input.nextInt();
        if (d1 == num2 || d10 == num2 )
            System.out.println("yes sir");
        else
            System.out.println("nope");

        System.out.println("--- \n");

        // questions 8
        String name, name2;
        System.out.print("enter runner1 name  --> ");
        name = input.next();
        System.out.print("enter runner1 time --> ");
        num = input.nextInt();
        System.out.print("enter runner2 name --> ");
        name2 = input.next();
        System.out.print("enter runner2 time  --> ");
        num2 = input.nextInt();
        if (num < num2)
            System.out.println(name + " is the winner with the time of "+ num);
        else if (num2 < num)
            System.out.println(name2 + " is the winner with the time of "+ num2);
        else System.out.println("both finished with the same time");

        System.out.println("--- \n");

        // questions 9
        System.out.print("enter a num --> ");
        num = input.nextInt();
        System.out.print("enter a num2 --> ");
        num2 = input.nextInt();
        System.out.print("enter a mathematical operation +/  --> ");
        String oparation = input.next();
        if (oparation.equals("+"))
            System.out.println(num + num2);
        else if (oparation.equals("-"))
            System.out.println(num - num2);


        System.out.println("--- \n");

        // questions 10
        System.out.print("enter a 3 digit num --> ");
        num = input.nextInt();
        d1 = num % 10;
        temp = num /10;
        d10 = temp % 10;
        d100 = temp / 10;
        if (d1 == d100)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
/*
enter a num --> 12
even
---

enter a num --> 12
enter a num2 --> 35
sum is 47
product is 420
------

enter a 3digit num --> 321
yes
------

enter a 2 digit num --> 12
1
---

enter a num --> 45
enter a num2 --> 23
45
---

how many kids are going to the trip --> 63
16jeeps are needed
---

enter a 2 digit num --> 23
enter 1 digit num --> 3
yes sir
---

enter runner1 name  --> ziv
enter runner1 time --> 12
enter runner2 name --> nadav
enter runner2 time  --> 17
ziv is the winner with the time of 12
---

enter a num --> 12
enter a num2 --> 34
enter a mathematical operation +/  --> +
46
---

enter a 3 digit num --> 436
no

* */