public class Toastss {
    public static void main(String[] args) {


        char[] arr = {'f', 'a', 's', 'l', 'h', 'm', 'o', 'z'};
        int nu = 563142;
        System.out.println(tostring(arr, nu));
    }
    public static String tostring(char[] arr, int num){
        String newSt = "";
        while (num!=0)
        {
            newSt += arr[num % 10];
            num = num/10;

        }
        return newSt;
    }


}
