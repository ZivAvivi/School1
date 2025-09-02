import java.util.Scanner;

public class Str {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter you password -> ");
        String pw = input.next();
        System.out.println(isValid(pw));


    }

    public static boolean isValid(String pw) {
        boolean hasUpperCase = false, hasLowerCase = false, hasNumber = false;
        int length = pw.length();
        if (pw.length() >= 8) {
            for (int i = 0; i < length; i++) {
                if (Chars.isUpper(pw.charAt(i)))
                    hasUpperCase = true;
                else if (Chars.isLower(pw.charAt(i)))
                    hasLowerCase = true;
                else if (Chars.isNumber(pw.charAt(i)))
                    hasNumber = true;
                else return false;
            }
            return (hasNumber && hasLowerCase && hasUpperCase);
        }
        return false;
    }
}
