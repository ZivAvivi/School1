import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number ->");
        int a = input.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("five");
            case 6:
                System.out.println("six");
                break;
            default:
                System.out.println("bigger then six");
        }
    }
}
