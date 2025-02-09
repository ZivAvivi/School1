import java.util.Scanner;

public class CharsTirgol {
    public static Scanner input = new Scanner(System.in);

    public static void encryptBy1(char[] arr)
    {
        System.out.print("unencrypted text: \" ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

        System.out.print("\" encrypted text: \"");
        for (int i = 0; i < arr.length; i++)
            System.out.print(Chars.nextLetter(arr[i]));

        System.out.println("\"");
    }

    public static void encryptByNum(char[] arr, int num)
    {

        System.out.print("unencrypted text: \" ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

        System.out.print("\" encrypted text: \"");
        for (int i = 0; i < arr.length; i++)
        {
            char temp = arr[i];
            for (int j = 0; j < num; j++) {
                temp = Chars.nextLetter(temp);
            }
            System.out.print(temp);
        }

        System.out.println("\"");
    }

    public static void tagril3(char[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(Chars.isUpper(arr[i]))
                System.out.print(Chars.toLower(arr[i]));
            else if(Chars.isLower(arr[i]))
                System.out.print(Chars.toUpper(arr[i]));
            if(Chars.isNumber(arr[i]))
                System.out.print("???");
        }
    }


    public static void main(String[] args) {
        input.useDelimiter("");
        char[] arr = new char[5];
        System.out.print("enter " + arr.length + " letters --> ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = input.next().charAt(0);


        encryptBy1(arr);

        input.reset(); // without this line the input crashes
        System.out.print("enter the encryption number -->: ");
        int num = input.nextInt();
        encryptByNum(arr, num);




    }
}
