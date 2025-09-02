import java.util.Scanner;

public class ChekChars {
    public static void main(String[] args) {
        String str = "";

        Scanner input = new Scanner (System.in);
        input.useDelimiter("");

        System.out.print("enter your string --> ");

        char ch= input.next().charAt(0);
        while (ch != '\n'){
            str += Chars.nextLetter(ch);
            ch = input.next().charAt(0);

        }
        System.out.print(str);

    }
}
