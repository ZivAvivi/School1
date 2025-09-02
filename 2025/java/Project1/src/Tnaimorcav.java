import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;


public class Tnaimorcav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // targil 1
        int num;
        System.out.print("enter 1 digit whole number ->");
        num = input.nextInt();

        if (num> 0 && num <10){
            if (num %2 == 0 || num%3 ==0){
                System.out.println("המספר מתחלק ב2 או ב3");
            }else
                System.out.println("המספר לא מתחלק ב2 או ב3");
        } else
            System.out.println("error");


        // targil 2
        System.out.print("enter your age ->");
        num = input.nextInt();
        if (num> 0 && num <120){
            System.out.println("reasonable age");
        }else System.out.println("not a reasonable age");

        //targil 3
        int num2;
        System.out.print("enter whole number ->");
        num = input.nextInt();
        System.out.print("enter another whole number ->");
        num2 = input.nextInt();

        if (num > 0 && num > 0){ // כדי שהמספרים יהיו שלילים יש להפוך את הסימן ששני המספרים יהיו קטנים מ0
            if (num+1==num2 || num-1 ==num2){ // אפשר לעשות את התרגיל גם ללא תנאי מורכב Math.abs(num-num2) == 1
                System.out.println("successors");
            }else
                System.out.println("not successors");
        } else
            System.out.println("error");

        //targil 4
        int boy1, boy2, girl1, girl2;
        System.out.print("enter how many boys in class1 ->");
        boy1 = input.nextInt();
        System.out.print("enter how many girls in class1 ->");
        girl1 = input.nextInt();
        System.out.print("enter how many boys in class2 ->");
        boy2 = input.nextInt();
        System.out.print("enter how many girls in class2 ->");
        girl2 = input.nextInt();
        if (boy1 != girl1)
            if (boy1> girl1)
                System.out.println("more boys then girls in class 1");
            else
                System.out.println("more girls then boys in class1");
        else
            System.out.println("class1 is balanced");

        //class 2
        if (boy2 != girl2)
            if (boy2> girl2)
                System.out.println("more boys then girls in class 2");
            else
                System.out.println("more girls then boys in class2");
        else
            System.out.println("class2 is balanced");

        if (boy1 > girl1 && boy2<girl2)
            System.out.println("balanced");
        else
            if (girl2> boy2 && girl1 > boy1)
                System.out.println("more girls then boys");
            else
                System.out.println("more boys then girls");


        //targil 5
        double dnum1, dnum2, dnum3; //dnum = doubleNum
        System.out.print("enter num1 ->");
        dnum1 = input.nextDouble();
        System.out.print("enter num2 ->");
        dnum2 = input.nextDouble();
        System.out.print("enter num3 ->");
        dnum3 = input.nextDouble();
        if (dnum1 == dnum2 && dnum2 == dnum3)
            System.out.println("they are equal");
        if (dnum1 == dnum2 || dnum2 == dnum3 || dnum1 == dnum3)
            System.out.println("there are at least 2 equal numbers");
        if ((dnum1 == dnum2 && dnum2!=dnum3) || (dnum3==dnum2 && dnum2!=dnum1) || (dnum1==dnum3 && dnum3!=dnum2))
            System.out.println("there are only 2 equal number");
        if (dnum1!=dnum2 && dnum2!=dnum3 && dnum1!=dnum3)
                System.out.println("there arent any equal numbers");
            
        // targil 6
        System.out.print("enter the degree ->");
        num = input.nextInt();
        if (num>0 && num < 90)
            System.out.println("sharp angle");
        else
            if (num == 90)
                System.out.println("straight angle");
            else
                if (num > 90 && num <180)
                    System.out.println("dull angle");

        //targil 7
        int a, b, c;
        System.out.print("enter a ->");
        a = input.nextInt();
        System.out.print("enter b ->");
        b = input.nextInt();
        System.out.print("enter c ->");
        c = input.nextInt();
        if (a < b && a >c || a>b && a<c)
            System.out.println(a +" in between" + b + "and" + c);
        else System.out.println(a + "is not between them");

        //targil 8
        int d1,d10;
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

        //targil 9
        int age, expirance;
        String name;
        System.out.print("enter age ->");
        age = input.nextInt();
        System.out.print("enter expirance ->");
        expirance = input.nextInt();
        System.out.print("enter name ->");
        name = input.next();
        if (age >= 25 && age <=40 && expirance >= 3)
            System.out.println(name + "you goy hired");
        else System.out.println("sorry" + name + "you didnt get hired");
    }
}
/*
*enter 1 digit whole number ->7
המספר לא מתחלק ב2 או ב3
enter your age ->28
reasonable age
enter whole number ->6
enter another whole number ->9
not successors
enter how many boys in class1 ->17
enter how many girls in class1 ->13
enter how many boys in class2 ->9775
enter how many girls in class2 ->2
more boys then girls in class 1
more boys then girls in class 2
more boys then girls
enter num1 ->1
enter num2 ->2
enter num3 ->4
there arent any equal numbers
enter the degree ->50
sharp angle
enter a ->7
enter b ->77
enter c ->9
7 is not between them
enter 2digit number ->30
52
enter age ->40
enter expirance ->7
enter name ->motkale
motkaleyou goy hired
*
*
* */
