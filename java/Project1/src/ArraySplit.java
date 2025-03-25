import java.util.Random;

public class ArraySplit {
    public static Random rand = new Random();
    static int indexB = 0;
    static int indexC = 0;



    public static void main(String[] args) {
        int[] b = new int[15];
        int[] c = new int[15];
        int[] a = getRandomArray(15, -25, 25);
        splitArr(a,b,c);
        show(a, a.length);
        show(b, indexB);
        show(c, indexC);
    }

    // takes an array and splits it to two arrays one for negative numbers one for positive
    public static void splitArr(int[] arr, int[] emptyArr1, int[] emptyArr2){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                emptyArr1[indexB] = arr[i];
                indexB++;
            } else {
                emptyArr2[indexC] = arr[i];
                indexC++;
            }
        }
    }

    // returns true if a number exist in the given array
    public static boolean exist(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return true;
        }
        return false;
    }

    // returns a new random array with unique random numbers between min and max values
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

    // prints an array
    public static void show(int[] arr, int arrLength){
        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
/*
-16 21 -8 -5 -18 -9 -13 -25 -10 5 19 9 -17 24 3
21 5 19 9 24 3
-16 -8 -5 -18 -9 -13 -25 -10 -17
* */