import java.util.Scanner;

public class DrinkMechine {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // menu
        menu();

        int drink = drinkInput(7);

        double price = getPrice(drink);

        System.out.print("type sum of money you pay the mechine  -->");
        double sum = input.nextDouble();

        double odef = sum - price;
        if (odef < 0)
            msgOK(drink, price, sum, odef);
        else if (odef > 0) {
            odef(odef, drink, price);
        }

        System.out.println("\n thanks for using my drink machine! \n");

    }

    public static void menu()
    {
        System.out.println("----= My drink Machine =----");
        System.out.println("1.\t Coffe - ness:     3.25");
        System.out.println("2.\t coffe - black:    3.15");
        System.out.println("3.\t Tea:              2.30");
        System.out.println("4.\t Hot chocolate:    2.50");
        System.out.println("5.\t Soup:             3.10");
        System.out.println("6.\t Cola:             5.50");
        System.out.println("7.\t Orange juice:     4.20");
    }

    /*
    מקבל: מספר המשקה
    מחזיר: מחיר המשקה
    * */
    public static double getPrice(int drink)
    {
        double price = 0;
        switch (drink)
        {
            case 1: price = 3.25; break;
            case 2: price = 3.15; break;
            case 3: price = 2.3; break;
            case 4: price = 2.5; break;
            case 5: price = 3.1; break;
            case 6: price = 5.5; break;
            case 7: price = 4.2; break;
        }
        return  price;
    }

    /*
    קולט מהמשתמש מספר תקין למשקה ומחזירה אותו
    * */
    public static int drinkInput(int numDrink)
    {
        int num = 0;
        do {
            System.out.print("which drink would you like? -->");
            num = input.nextInt();
        }while (num > numDrink || num < 1);
        return num;
    }

    public static void msgOK(int drink, double price, double sum, double odef)
    {
        System.out.println("you chose drink #" + drink);
        System.out.println("which costs " + price + " nis");
        System.out.println("you only paid " + sum + " nis");
        System.out.println("you must add another " + Math.abs(odef)+ "nis");
    }

    /*
    מקבל: את מספר המשקה  מחיר המשקה וכמה עודף יש להחזיר
    מדפיס את כמות המטבעות שיש קיבל עודף
    * */
    public static void odef(double odef, int drink, double price)
    {

        int odefAG = (int)(odef *100);

        int tenShekel = odefAG/1000;
        odefAG = odefAG%1000;

        int fiveShekel = odefAG/500;
        odefAG = odefAG%500;

        int twoShekel = odefAG/200;
        odefAG = odefAG%200;

        int oneShekel = odefAG/100;
        odefAG = odefAG%100;

        int halfShekel = odefAG/50;
        odefAG = odefAG%50;

        int tenAg = odefAG/10;
        odefAG = odefAG%10;

        int fiveAg =0;
        if(odefAG >0)
            fiveAg =1;

        System.out.println("you chose drink #" + drink);
        System.out.println("which costs " + price + " nis");
        System.out.println("You deserve a surplus of " + odef + " nis");
        System.out.println("as follows:");
        if (tenShekel!=0)
            System.out.println("\t" + tenShekel + " coins of 10nis");
        if (fiveShekel!=0)
            System.out.println("\t" + fiveShekel + " coins of 5nis");
        if (twoShekel!=0)
            System.out.println("\t" + twoShekel + " coins of 2nis");
        if (oneShekel!=0)
            System.out.println("\t" + oneShekel + " coins of 1nis");
        if (halfShekel!=0)
            System.out.println("\t" + halfShekel + " coins of 0.5nis");
        if (tenAg!=0)
            System.out.println("\t" + tenAg + " coins of 10 ag");
        if (fiveAg!=0)
            System.out.println("\t" + fiveAg + " coins of 5 ag");


    }

}
/*
----= My drink Machine =----
1.	 Coffe - ness:     3.25
2.	 coffe - black:    3.15
3.	 Tea:              2.30
4.	 Hot chocolate:    2.50
5.	 Soup:             3.10
6.	 Cola:             5.50
7.	 Orange juice:     4.20
which drink would you like? -->3
type sum of money you pay the mechine  -->50
you chose drink #3
which costs 2.3 nis
You deserve a surplus of 47.7 nis
as follows:
	4 coins of 10nis
	1 coins of 5nis
	1 coins of 2nis
	1 coins of 0.5nis
	2 coins of 10 ag

 thanks for using my drink machine!


 ----= My drink Machine =----
1.	 Coffe - ness:     3.25
2.	 coffe - black:    3.15
3.	 Tea:              2.30
4.	 Hot chocolate:    2.50
5.	 Soup:             3.10
6.	 Cola:             5.50
7.	 Orange juice:     4.20
which drink would you like? -->1
type sum of money you pay the mechine  -->3.25

 thanks for using my drink machine!


 ----= My drink Machine =----
1.	 Coffe - ness:     3.25
2.	 coffe - black:    3.15
3.	 Tea:              2.30
4.	 Hot chocolate:    2.50
5.	 Soup:             3.10
6.	 Cola:             5.50
7.	 Orange juice:     4.20
which drink would you like? -->7
type sum of money you pay the mechine  -->1
you chose drink #7
which costs 4.2 nis
you only paid 1.0 nis
you must add another 3.2nis

 thanks for using my drink machine!
* */