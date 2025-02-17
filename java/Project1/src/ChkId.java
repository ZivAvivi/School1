public class ChkId {
    public static boolean isIdValid(int[] arr)
    {
        int sum = 0, num;
        for (int i = 0; i < arr.length-1; i++) {
            if(i%2==1){
                num =arr[i] *2;
                sum += num/10 + num%10;
            } else sum+= arr[i];
        }
        int sb = 10-sum%10;
        return (sb==arr[arr.length-1]);
    }

    public static void main(String[] args) {
        int[] arr = new int[9];
        Array.arrKelet(arr);
        System.out.println(isIdValid(arr));

    }
}
