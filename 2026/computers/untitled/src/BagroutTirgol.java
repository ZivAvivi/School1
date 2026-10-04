public class BagroutTirgol {
    public static void main(String[] args) {
        System.out.println("is 407 narc " + isNarc(407) );
        theNarc(407);
    }

    public static void theNarc(int n){
        for (int i = 1; i <= n; i++) {
            if(isNarc(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isNarc(int num){
        int sum = 0;
        int digits = digitNum(num);
        int onum = num; // original number
        while(num!=0){
            sum += Math.pow(num%10, digits);
            num /= 10;
        }
        return sum == onum;
    }

    public static int digitNum(int num){
        int count = 0;
        while(num!=0){
            num /= 10;
            count++;
        }
        return count;
    }


    public static void showArr(int[] arr)
    {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("}");

    }

    public static void arrange(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] >= 0) {
                        int temp = arr[j];
                        for (int k = j; k > i; k--) {
                            arr[k] = arr[k - 1];
                        }
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
    }

}
