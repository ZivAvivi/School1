import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //targil 8
        Scanner input = new Scanner(System.in);
        int d1,d10, num;
        System.out.print("enter 2digit number ->");
        num = input.nextInt();
        if (num>=10 && num <=99){
            d1 = num%10 +2;
            d10 = num/10 +2;
            if (d1 >= 10){
                d1 = d1/10 + d1%10;
            }
            if (d10 >= 10){
                d10 = d10/10 + d10%10;
            }
            System.out.println(d1 + d10*10);
        } else System.out.println("THIS IS NOT 2DIGIT NUM");
    }
}
