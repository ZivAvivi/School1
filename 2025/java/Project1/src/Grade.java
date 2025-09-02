import java.util.Scanner;

public class Grade {
    // לוקח את הציון שלך ומדפיס הודעה בהתאם
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade ->");
        int grade = input.nextInt();
        int g = (grade+5)/10;
        System.out.print(grade +" ");
        switch (g)
        {
            case 10: System.out.println("מעולה"); break;
            case 9: System.out.println("טוב מאוד"); break;
            case 8: System.out.println("טוב"); break;
            case 7: System.out.println("כמעט טוב"); break;
            case 6: System.out.println("מספיק"); break;
            default: System.out.println("לא מספיק"); break;
        }
    }
}
/*
Enter grade ->67
67 כמעט טוב

Enter grade ->70
70 כמעט טוב

Enter grade ->24
24 לא מספיק

 */