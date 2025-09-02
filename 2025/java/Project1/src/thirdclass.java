import java.util.Scanner;

public class thirdclass {
    public static void main(String[] args) {
        double salary;
        Scanner input = new Scanner(System.in);
        System.out.print("enter your monthly salary ->");
        salary = input.nextDouble();
        salary = salary * 0.85;
        salary -= salary/3;
        salary = salary/30;
        System.out.println("your daily expence is "+ salary);
    }

}
