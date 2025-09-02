import java.util.Scanner;

public class ForLoops1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;

        for(i = 1; i <= 100; i++)
        {
            if(i%5 ==0)
                System.out.print(i + " ");
        }
        System.out.println();
        for(i = 5; i <= 100; i+=5)
        {
            System.out.print(i  + " ");
        }
        System.out.println();
        // there is no difference between them
        // the 2nd one will run faster because it has fewer statements to check and doesn't check every number for 1 - 100

        for(i = 1; i <= 50; i+=2)
        {
            System.out.print(i  + " ");
        }
        System.out.println();
        for(i = 3; i <= 30; i+=3)
        {
            System.out.print(i  + " ");
        }
        System.out.println();
        for(i = 2; i <= 100; i+=2)
        {
            System.out.print(i  + " ");
        }
        System.out.println();

        int sum = 0;
        for(i = 1; i <= 10; i++)
        {
            System.out.print(i  + " ");
            sum += i;
        }
        System.out.println();
        System.out.println(sum);

        sum = 0;
        for(i = 30; i <= 50; i++)
        {
            System.out.print(i  + " ");
            sum += i;
        }
        System.out.println();
        System.out.println(sum);


        for(i = 1; i <= 50; i++)
        {
            if (i%8 ==0)
                System.out.print(i  + " nice ");
            else System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Enter num1 ->");
        int num1 = input.nextInt();
        System.out.print("Enter num2 ->");
        int num2 = input.nextInt();
        sum = 0;
        int count = 0;
        for(i = Math.min(num1, num2); i <= Math.max(num1, num2); i++)
        {
            count++;
            sum += i;
        }
        System.out.println("there were " + count + " numbers");
        System.out.println("sum = "+ sum);

        for(i = 12; i < 100; i +=3)
        {
            System.out.print(i  + " ");
        }
        System.out.println();
        for(i = 10; i < 100; i ++)
        {
            if (Math.sqrt(i)%1 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for(i = 12; i < 100; i +=3)
        {
            if (Math.sqrt(i)%1 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for(i = 10; i < 100; i ++)
        {
            if (Math.sqrt(i)%1 == 0)
                System.out.print("has whole squrt: " + i);
            else if (i%3==0)
            {
                System.out.println("deviadeable by 3: " + i);
            }
        }

        System.out.println();
        for(i = 10; i < 100; i ++)
        {
            if (i%7 == 0 || i%10 ==7 || i/10 == 7)
                System.out.print(i + " ");

        }
    }
}
/*
5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49
3 6 9 12 15 18 21 24 27 30
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100
1 2 3 4 5 6 7 8 9 10
55
30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50
840
1 2 3 4 5 6 7 8 nice 9 10 11 12 13 14 15 16 nice 17 18 19 20 21 22 23 24 nice 25 26 27 28 29 30 31 32 nice 33 34 35 36 37 38 39 40 nice 41 42 43 44 45 46 47 48 nice 49 50
Enter num1 ->1
Enter num2 ->15
there were 15 numbers
sum = 120
12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66 69 72 75 78 81 84 87 90 93 96 99
16 25 36 49 64 81
36 81
deviadeable by 3: 12
deviadeable by 3: 15
has whole squrt: 16deviadeable by 3: 18
deviadeable by 3: 21
deviadeable by 3: 24
has whole squrt: 25deviadeable by 3: 27
deviadeable by 3: 30
deviadeable by 3: 33
has whole squrt: 36deviadeable by 3: 39
deviadeable by 3: 42
deviadeable by 3: 45
deviadeable by 3: 48
has whole squrt: 49deviadeable by 3: 51
deviadeable by 3: 54
deviadeable by 3: 57
deviadeable by 3: 60
deviadeable by 3: 63
has whole squrt: 64deviadeable by 3: 66
deviadeable by 3: 69
deviadeable by 3: 72
deviadeable by 3: 75
deviadeable by 3: 78
has whole squrt: 81deviadeable by 3: 84
deviadeable by 3: 87
deviadeable by 3: 90
deviadeable by 3: 93
deviadeable by 3: 96
deviadeable by 3: 99

14 17 21 27 28 35 37 42 47 49 56 57 63 67 70 71 72 73 74 75 76 77 78 79 84 87 91 97 98
Process finished with exit code 0

 */
