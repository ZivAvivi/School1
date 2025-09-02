import java.util.Scanner;

public class Menu {
    // asks you which dish you want to order from the menu and prints the price
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = 0.0;

        // menu
        System.out.println("\t\t -= our menu =-");
        System.out.println("1.\t shwarma:\t\t\t69.99");
        System.out.println("2.\t hot cocoa:\t\t\t20.00");
        System.out.println("3.\t fish and chips:\t70.00");
        System.out.println("4.\t chocolate cake:\t30.00");
        System.out.println("5.\t vanilla muffin:\t25.00");
        System.out.println("6.\t gefilte fish:\t\t45.00");

        System.out.print("which dish number would you like? -->");
        int choice = input.nextInt();
        switch (choice)
        {
            case 1: price = 69.99; break;
            case 2: price = 20; break;
            case 3: price = 70; break;
            case 4: price = 30; break;
            case 5: price = 25; break;
            case 6: price = 45; break;
        }
        System.out.print("How many would you like? -->");
        int sum = input.nextInt();
        double toPay = sum * price;
        System.out.println("You need to pay "+ toPay);

    }
}
/*
		 -= our menu =-
1.	 shwarma:			69.99
2.	 hot cocoa:			20.00
3.	 fish and chips:	70.00
4.	 chocolate cake:	30.00
5.	 vanilla muffin:	25.00
6.	 gefilte fish:		45.00
which dish number would you like? -->2
How many would you like? -->6
You need to pay 120.0

		 -= our menu =-
1.	 shwarma:			69.99
2.	 hot cocoa:			20.00
3.	 fish and chips:	70.00
4.	 chocolate cake:	30.00
5.	 vanilla muffin:	25.00
6.	 gefilte fish:		45.00
which dish number would you like? -->6
How many would you like? -->2
You need to pay 90.0
 */