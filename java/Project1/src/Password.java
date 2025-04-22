import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter password ->");
        String str = input.next();
        if (chkPass(str))
            System.out.println("valid");
        else System.out.println("not valid");

        System.out.println(chkPass("AAAAAAAb1#"));
        System.out.println(chkPass("aaaaaaab1#"));
        System.out.println(chkPass("AAAAAAAB1#"));
        System.out.println(chkPass("AAAAAAAB#"));
        System.out.println(chkPass("AAAAAAAb1#^"));
    }
    // פעולה שבודקצ האם הסיסמה מכילב אות גדולה אות קטנה וסימן נכון ומחזירה אמת
    public static boolean chkPass(String str){
        boolean lower=false, upper=false, number=false, special=false, length=false;
        String badChars = "!%^&*()-_=+.<>?`~:;/'\"[\\]{},";
        if (str.length()>= 10 && str.length() <= 12){length=true;}
        if (str.contains("@") || str.contains("#") || str.contains("$")){special=true;}
        for (int i = 0; i < str.length(); i++) {
            if (Chars.isLower(str.charAt(i))){lower=true;}
            else if (Chars.isUpper(str.charAt(i))){upper=true;}
                else if (Chars.isNumber(str.charAt(i))){number=true;}
            for (int j = 0; j < badChars.length(); j++) {
                if (badChars.charAt(j) == str.charAt(i)){return false;}
            }
        }
        return special&&lower&&upper&&number&&length;
    }

    public static int chkPassArray(String[] passwords){
        int count =0;
        for (int i = 0; i < passwords.length; i++) {
            if(chkPass(passwords[i])){count++;}
        }
        return count;
    }
}