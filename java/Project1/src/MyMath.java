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

    /*
    מקבל: מספר שלם חיובי
    מחזיר: אם מספר הוא ראשוני
    * */
    public static boolean isPrime(int num)
    {
        double sq = Math.sqrt(num);
        for (int i = 2; i <= sq; i++)
        {
            if (num%i ==0)
                return false;
        }
        return true;
    }

    /*
    מקבל: מספר חיובי
    מחזיר: קירוב לשורש של 3 ספרות אחרי הנקודה
    * */
    public static double squreRoot(int num)
    {
        double x = 1;
        double y = num/x;
        while (Math.abs(y-x) > 0.001)
        {
            x = (x+y)/2;
            y = num/x;
        }
        return x;
    }

    /*

    * */
    public static void fiboSmallerNum(int num)
    {
        int a = 0, b = 1, c = 0;
        do {
            c = a+b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        } while (c < num);
        System.out.println();
    }

    // מדפיס את ה10 ספרות הראשונות בסדרת פיבונצי
    public static void fibonacci()
    {
        System.out.print("0, 1, ");
        int a = 0, b = 1, c = 0;
        for (int i = 3; i <= 10 ; i++)
        {
            c = a+b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
        System.out.println();
    }


    /*
    מקבלת: שני מספרים שלמים וחיובים
    מחזירה: את המספר הכי גדול שמתחלק בניהם
    * */
    public static int mmg(int num1, int num2)
    {
        while (num1!=num2)
        {
            if (num1>num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num1;
    }

}
