public class rekorsia {

    static public void main(String[] args) {
        int[] arr = {6, 3 ,27, 81, 49, 67, 69, 42, 24};
        System.out.println(isAllDigitsEven(28882224));
    }

    static public int sumEvenArr(int[] arr){
        if (arr[0]%2==0)
            return arr[0] + sumEvenArr(1, arr);
        return sumEvenArr(1, arr);
    }

    static private int sumEvenArr(int place, int[] arr){
        if (place == arr.length -1)
            if (arr[place]%2 == 0)
                return arr[place];
            else return 0;
        if (arr[place]%2 == 0)
            return arr[place] + sumEvenArr(place+1, arr);
        return sumEvenArr(place+1, arr);
    }

    public static boolean intInArr(int num, int[] arr){
        return arr[0]==num || intInArr(num, arr, 1);
    }

    private static boolean intInArr(int num, int[] arr, int place){
        if (place == arr.length-1)
            return arr[place]==num;
        return arr[place]==num || intInArr(num, arr, place+1);
    }

    private static boolean isAllDigitsEven(int num){
        if (num==0)
            return true;
        return (num%10)%2==0 && isAllDigitsEven(num/10);
    }

}
