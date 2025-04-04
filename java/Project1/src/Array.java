import java.util.Random;
import java.util.Scanner;

public class Array {
    public static Scanner input = new Scanner(System.in);
    public static Random rand = new Random();

    /*
    פעולה שמקבלת מערך וממלא אותו בערכים מוגרלים
    * */
    public static void arrFill(int[] arr)
    {
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
   פעולה שמקבלת מערך ומדפיסה את כל הערכים בצורה יפה
   * */
    public static void show(int[] arr, int size)
    {
        System.out.print("{ ");
        for (int i = 0; i < size; i++)
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

    public static int[] getRandomArray(int arrLength, int min, int max){
        int[] arr = new int[arrLength];
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            do {
                temp = rand.nextInt(min, max);
            }while (exist(arr,temp));
            arr[i] = temp;
        }
        return arr;
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

    public static void primeSum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (MyMath.isPrime(arr[i-1] + arr[i])){
                System.out.println("sum of index #"+(i-1) + " and index #" + i + " is " + (arr[i-1] + arr[i]));
            }
        }
    }

    // 0 < from < to < arr.length
    public static boolean isPartInOrder(int[] arr, int from, int to){
        for (int i = from+1; i < to ; i++) {
            if(arr[i-1]+1 != arr[i])
                return false;
        }
        return true;
    }

    // arr length is 120 long
    public static int targil2(int[] arr){
        int count =0;
        for (int i = 0; i < 120; i+=10) {
            if (isPartInOrder(arr, i, i+10))
                count++;
        }
        return count;
    }

    /*
    פעולה המבצעים "חיפוש בינרי" למערך מסודר
    * */
    public static boolean binSerch(int[] arr, int x){
        int left =0; int right = arr.length-1;
        while (left<=right){
            int mid = (right +left)/2;
            if(arr[mid] <= x) return true;
            if(arr[mid] > x) right = mid-1;
            else left = mid+1;
        }
        return false;
    }





}
