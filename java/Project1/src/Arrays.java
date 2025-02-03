import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("enter arr size (7 - 12) -->");
        int[] arr = new int[input.nextInt()];

        fillArr(arr);

        showArr(arr);

        System.out.println("the sum of all the arr values is " + arrSum(arr));



    }

    /*
    פעולה שמקבלת מערך וממלא אותו בערכים מוגרלים
    * */
    public static void fillArr(int[] arr)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("type num #" + i + " -->");
            arr[i] = rand.nextInt(1, 100);
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

}
/*
enter arr size (7 - 12) -->9
type num #0 -->
type num #1 -->
type num #2 -->
type num #3 -->
type num #4 -->
type num #5 -->
type num #6 -->
type num #7 -->
type num #8 -->
{ 44, 35, 34, 3, 78, 44, 32, 86, 90, }
the sum of all the arr values is 446
* */