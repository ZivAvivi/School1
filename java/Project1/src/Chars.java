import java.util.Scanner;

public class Chars {

    public static Scanner input = new Scanner(System.in);

    // checks if the given letter is capitalized and returns a boolean
    public static boolean isUpper(char ch)
    {
        return(ch >= 'A' && ch <= 'Z');
    }

    // checks if the given letter is not capitalized and returns a boolean
    public static boolean isLower(char ch)
    {
        return (ch >= 'a' && ch <= 'z');
    }

    // checks if the given letter is a number and returns a boolean
    public static boolean isNumber(char ch)
    {
        return (ch >= '0' && ch <= '9');
    }

    // takes a uncapitalized letter and returns it capitalized
    public static char toUpper(char ch)
    {
        return (char)(ch - 32);
    }

    // takes a capitalized letter and returns it uncapitalized
    public static char toLower(char ch)
    {
        return (char)(ch + 32);
    }

    // returns the char as its number in the table
    public static int charToNum(char ch)
    {
        return ch-48;
    }

    // takes a char and returns the next one in table
    public static char nextChar(char ch)
    {
        return (char)(ch + 1);
    }

    // takes a char and returns the prev one in table
    public static char prevChar(char ch)
    {
        return (char)(ch - 1);
    }

    // takes a char and returns the next letter in table in a circle
    public static char nextLetter(char ch)
    {
        if (ch == 'z')
            return 'a';
        else if(ch == 'Z')
            return 'A';
        return (char)(ch + 1);
    }

    // takes a char and returns the prev letter in table in a circle
    public static char prevLetter(char ch)
    {
        if (ch == 'a')
            return 'z';
        else if(ch == 'A')
            return 'Z';
        return (char)(ch - 1);
    }

}
