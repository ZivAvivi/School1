import java.util.Scanner;

public class Grades {

    public static Scanner input = new Scanner(System.in);

    // מחשב את ממוצע הציונים של תלמיד
    public static double calcAvg()
    {
        int sum = 0,
            count = 0;
        int grade = validGrade();
        while (grade!=-1)
        {
            sum+=grade;
            count++;
            grade = validGrade();
        }
        double avg = (double) sum/count;
        if (count!=0)
            return avg;
        else return 0;
    }

    // קולטת ציון חוקי מהמשתמש
    public static int validGrade()
    {
        int grade = 0;
        do {
            System.out.print("enter a grade between 1 and 100 (-1 to stop) ->");
            grade = input.nextInt();
        }while (grade > 100 || grade < -1);
        return grade;
    }

    // תוכנית זו קולטת מספר תלמידים בכיתה, ואת הציונים של כל תלמיד ומחשבת את הממוצע של כל תלמיד וממוצע כתתי
    public static void main(String[] args) {
        double sumAvg = 0;
        double avg = 0;
        System.out.print("How many kids are there? ->");
        int numKids = input.nextInt();
        for (int i = 0; i < numKids; i++) {
            System.out.print("whats your name? ->");
            String name = input.next();
            avg = calcAvg();
            System.out.println("the kid "+ name + "has the avg grade of "+ avg);
            sumAvg+=avg;
        }
        sumAvg = (double) sumAvg/numKids;
        System.out.println("the class has the avg grade of " + sumAvg);
    }
}
/*

How many kids are there? ->3
whats your name? ->ziv
enter a grade between 1 and 100 (-1 to stop) ->100
enter a grade between 1 and 100 (-1 to stop) ->100
enter a grade between 1 and 100 (-1 to stop) ->97
enter a grade between 1 and 100 (-1 to stop) ->-1
the kid zivhas the avg grade of 99.0
whats your name? ->or
enter a grade between 1 and 100 (-1 to stop) ->69
enter a grade between 1 and 100 (-1 to stop) ->69
enter a grade between 1 and 100 (-1 to stop) ->420
enter a grade between 1 and 100 (-1 to stop) ->6
enter a grade between 1 and 100 (-1 to stop) ->-1
the kid orhas the avg grade of 48.0
whats your name? ->uri
enter a grade between 1 and 100 (-1 to stop) ->5
enter a grade between 1 and 100 (-1 to stop) ->56
enter a grade between 1 and 100 (-1 to stop) ->-1
the kid urihas the avg grade of 30.5
the class has the avg grade of 59.166666666666664

* */