import java.util.Scanner;

public class CharsTirgol {
    public static Scanner input = new Scanner(System.in);

    public static void targil1(char[] arr)
    {
        System.out.print("unencrypted text: \" ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

        System.out.print("\" encrypted text: \"");
        for (int i = 0; i < arr.length; i++)
            System.out.print(Chars.nextLetter(arr[i]));

        System.out.println("\"");
    }

    public static void targil2(char[] arr, int num)
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
            else if(Chars.isNumber(arr[i]))
                for (int j = 0; j < Chars.charToNum(arr[i]); j++)
                    System.out.print(arr[i]);

            else System.out.print(arr[i]);
        }
    }


    public static void main(String[] args) {

        char[] arr = new char[5];

        input.useDelimiter("");
        System.out.print("enter " + arr.length + " letters --> ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = input.next().charAt(0);

        targil1(arr);

        input.reset(); // without this line the input crashes (removes the delimiter to avoid bugs)
        System.out.print("enter the encryption number -->: ");
        int num = input.nextInt();
        targil2(arr, num);

        tagril3(arr);


    }
}
/*
enter 5 letters --> Ab C3
unencrypted text: " Ab C3" encrypted text: "Bc!D4"

enter the encryption number -->: 8
unencrypted text: " Ab C3" encrypted text: "Ij(K;"

aB c333
* */
