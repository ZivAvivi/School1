import java.util.Random;
import java.util.Scanner;

public class Array {
    public static Scanner input = new Scanner(System.in);

    /*
    פעולה שמקבלת מערך וממלא אותו בערכים מוגרלים
    * */
    public static void arrFill(int[] arr)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(10, 100);
        }
    }

    /*
    פעולה שמקבלת מערך וממלא אותו בערכים מהמשתמש
    * */
    public static void arrKelet(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("type num #" + i + " -->");
            arr[i] = input.nextInt();
        }
    }

    /*
    פעולה שמקבלת מערך ומדפיסה את כל הערכים בצורה יפה
    * */
    public static void showArr(int[] arr)
    {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("}");

    }

    /*
    פעולה שמקבלת מערך ןמחזירה את סכום כל אבריו
    * */
    public static int arrSum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }



    public static int countX(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                count++;
        }
        return count;
    }

    public static boolean exist(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return true;
        }
        return false;
    }

    /*
    פעולה שמקבלת מערך ומדפיסה את כל הערכים בצורה יפה הפוך
    * */
    public static void showBackwards(int[] arr)
    {
        System.out.print("{ ");
        for (int i = arr.length-1; i >= 0; i--)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("}");

    }

    /*
    פעולה שמקבלת מערך ןמחזירה את סכום כל אבריו הזוגיים
    * */
    public static int sumEven(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
                sum += arr[i];
        }
        return sum;
    }

    /*
    פעולה שמקבלת מערך ןמחזירה את סכום כל אבריו במקום זוגי
    * */
    public static int sumEvenPlaces(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i+=2) {
            sum += arr[i];
        }
        return sum;
    }


    public static void addNum(int[] arr, int num){

    }






}
