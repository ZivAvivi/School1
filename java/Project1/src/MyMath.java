public class MyMath {

    /*
    מקבל: שני מספרים שלמים
    מחזיר: סכום שני המספרים
    * */
    public static int add(int a, int b)
    {
        return a + b;
    }

    /*
     מקבל: שני מספרים שלמים
     מחזיר: הפרש מספר ראשון בשני
    * */
    public static int sub(int a, int b)
    {
        return a - b;
    }

    /*
    מקבל: שני מספרים שלמים
    מחזיר: מכפלתם של שני המספרים
    בהנחה שהמספרים חיוביים
    * */
    public static int mult(int a, int b)
    {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }

    /*
     מקבל: שני מספרים שלמים
     מחזיר: חילוק מספר הראשון בשני כמספר ממשי
    * */
    public static double divide(int a, int b)
    {
        return (double) a / b;
    }

    /*
    מקבל: שני מספרים שלמים
    מחזיר: מנת החלוקה בשיטת חיסור חוזר
    בהנחה שהמספרים חיוביים
   * */
    public static int div(int a, int b)
    {

        int moneah = 0;

        while (a >= b)
        {
            a -= b;
            moneah++;
        }
        return moneah;
    }

    /*
    מקבל: שני מספרים שלמים
    מחזיר: שארית החלוקה
    בהנחה שהמספרים חיוביים
   * */
    public static int mod(int a, int b)
    {

        while (a >= b)
        {
            a -= b;
        }
        return a;
    }
}
