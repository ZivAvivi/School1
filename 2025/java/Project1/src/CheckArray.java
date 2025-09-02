import java.util.Scanner;

public class CheckArray {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("תרגיל 1ג");
        int[] array = new int[10];
        Array.arrKelet(array);
        Array.showArr(array);

        System.out.println("\n --------- \n");

        System.out.println("תרגיל 2ב");
        System.out.print("enter array length -->");
        int num = input.nextInt();
        int[] arr = new int[num];
        Array.arrFill(arr);
        Array.showArr(arr);

        System.out.println("\n --------- \n");

        System.out.println("arr sum: " + Array.arrSum(arr));

        Array.showBackwards(arr);

        System.out.print("enter the num to look for in the array -> ");
        num = input.nextInt();

        System.out.println("the number "+ num +" appears " + Array.countX(arr, num) + " times");

        System.out.println("does the number "+ num +" appear in the array? " + Array.exist(arr, num));

        System.out.println("sumEven: " + Array.sumEven(arr));

        System.out.println("sumEvenPlaces: " + Array.sumEvenPlaces(arr));


    }
}
/*
תרגיל 1ג
type num #0 -->123
type num #1 -->343
type num #2 -->23
type num #3 -->65
type num #4 -->23
type num #5 -->75
type num #6 -->23
type num #7 -->7523
type num #8 -->89
type num #9 -->56
{ 123, 343, 23, 65, 23, 75, 23, 7523, 89, 56, }

 ---------

תרגיל 2ב
enter array length -->12
{ 73, 58, 63, 48, 33, 34, 20, 97, 84, 61, 44, 27, }

 ---------

arr sum: 642
{ 27, 44, 61, 84, 97, 20, 34, 33, 48, 63, 58, 73, }
enter the num to look for in the array -> 20
the number 20 appears 1 times
does the number 20 appear in the array? true
sumEven: 288
sumEvenPlaces: 317

* */

/*
הפעולות בשלילה

{ 50, 87, 18, 12, 74, 88, 20, 44, 49, 50, 16, 19, }
enter the num to look for in the array -> 99
the number 99 appears 0 times
does the number 99 appear in the array? false

* */