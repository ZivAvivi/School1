import java.util.Scanner;

public class Chars {

    public static Scanner input = new Scanner(System.in);

    // checks if the given letter is capitalized and returns a boolean
    public static boolean isUpper(char ch)
    {
        if ((int)ch >= 65 && (int)ch < 90)
            return true;
        return false;
    }

    // checks if the given letter is not capitalized and returns a boolean
    public static boolean isLower(char ch)
    {
        if ((int)ch >= 97 && (int)ch <= 122)
            return true;
        return false;
    }

    // checks if the given letter is a number and returns a boolean
    public static boolean isNumber(char ch)
    {
        if ((int)ch >= 48 && (int)ch <= 57)
            return true;
        return false;
    }

    // takes a uncapitalized letter and returns it capitalized
    public static char toUpper(char ch)
    {
        return (char)((int)ch - 32);
    }

    // takes a capitalized letter and returns it uncapitalized
    public static char toLower(char ch)
    {
        return (char)((int)ch + 32);
    }

    // returns the char as its number in the table
    public static int charToNum(char ch)
    {
        return (int)ch;
    }

    // takes a char and returns the next one in table
    public static char nextChar(char ch)
    {
        return (char)((int)ch + 1);
    }

    // takes a char and returns the prev one in table
    public static char prevChar(char ch)
    {
        return (char)((int)ch - 1);
    }

    // takes a char and returns the next letter in table in a circle
    public static char nextLetter(char ch)
    {
        if (ch == 'z')
            return 'a';
        else if(ch == 'Z')
            return 'A';
        return (char)((int)ch + 1);
    }

    // takes a char and returns the prev letter in table in a circle
    public static char prevLetter(char ch)
    {
        if (ch == 'a')
            return 'z';
        else if(ch == 'A')
            return 'Z';
        return (char)((int)ch - 1);
    }

    public static void main(String[] args) {
        System.out.println(nextLetter(input.next().charAt(0)));

    }

}
