import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // test 2001
        // this program cheacks which player won the game and prints the scores
        int num, num2;
        String name, name2;
        System.out.print("enter person 1 name  --> ");
        name = input.next();
        System.out.print("enter person 1 score --> ");
        num = input.nextInt();
        System.out.print("enter person 2 name --> ");
        name2 = input.next();
        System.out.print("enter person 2 score  --> ");
        num2 = input.nextInt();
        if (num > num2)
            System.out.println(name + " is the winner with the score of "+ num);
        else if (num2 > num)
            System.out.println(name2 + " is the winner with the score of "+ num2);
        else System.out.println("TEKO " + num);
        /*
        enter person 1 name  --> ziv
        enter person 1 score --> 5
        enter person 2 name --> levi
        enter person 2 score  --> 5
        TEKO 5

         enter person 1 name  --> ziv
        enter person 1 score --> 12
        enter person 2 name --> levi
        enter person 2 score  --> 4
        ziv is the winner with the score of 12
        * */

        // 2002
        // this program caculates if the famaly is eligable for diborit
        System.out.print("enter your family name -->");
        String familyName = input.next();
        System.out.print("enter phone 1 call number --> ");
        int phone1 = input.nextInt();
        System.out.print("enter phone 2 call number --> ");
        int phone2 = input.nextInt();
        System.out.print("enter phone 3 call number --> ");
        int phone3 = input.nextInt();
        if (phone1+phone2+phone3 > 1000)
            System.out.println(familyName + "זכאי לדיבורית");
        /*
        enter your family name -->avivi
        enter phone 1 call number --> 213
        enter phone 2 call number --> 34134
        enter phone 3 call number --> 67
        aviviזכאי לדיבורית

        enter your family name -->avivi
        enter phone 1 call number --> 1
        enter phone 2 call number --> 2
        enter phone 3 call number --> 3

        * */

        // 2003
        // this program checks if you are going above the speed limit
        System.out.print("whats the cars speed? -->");
        int speed = input.nextInt();
        System.out.print("whats the car's plate number? -->");
        String plate = input.next();
        if (speed > 50)
            System.out.println("קנס");
            System.out.println(plate);
            System.out.println(speed);
    }
}
