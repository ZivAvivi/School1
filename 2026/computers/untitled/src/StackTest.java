import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stkInt = buildIntStack();

        System.out.println(stkInt.toString());
        System.out.println("sum stack " + sumStk(stkInt));
        System.out.println("stk size "+ size(stkInt));

        Stack<Character> stkCh = buildChStack();
        System.out.println("is a in stk " + exist(stkCh, 'a'));
        Stack<Item> stkItem = intStkToItem(stkCh);
        System.out.println(stkItem.toString());
    }

    public static Stack<Character> buildChStack(){
        Stack<Character> stk = new Stack<Character>();
        System.out.print ("Enter a sequence of characters: ");
        Scanner in = new Scanner (System.in);
        in.useDelimiter ("");
        char ch = in.next().charAt(0);
        while (ch != '\n')
        {
            stk.push(ch);
            ch = in.next().charAt(0);
        }
        return stk;
    }

    public static Stack<Integer> buildIntStack(){
        Stack<Integer> stk = new Stack<Integer>();
        System.out.print ("Enter a sequence of numbers: ");
        Scanner in = new Scanner (System.in);
        in.useDelimiter ("");
        char ch = in.next().charAt(0);
        while (ch != '\n')
        {
            stk.push(Character.getNumericValue(ch));
            ch = in.next().charAt(0);
        }
        return stk;
    }

    // sums the values of the stack
    public static int sumStk(Stack<Integer> stk) {
        int sum = 0, x;
        Stack<Integer> sTemp = new Stack<Integer>();
        while (!stk.isEmpty()) {
            x = stk.pop();
            sum += x;
            sTemp.push(x);
        }
        while (!sTemp.isEmpty()) {
            stk.push(sTemp.pop());
        }
        return sum;
    }

    public static int size(Stack<Integer> stk) {
        int counter = 0;
        Stack<Integer> sTemp = new Stack<>();
        while (!stk.isEmpty()) {
            sTemp.push(stk.pop());
            counter++;
        }
        while (!sTemp.isEmpty()) {
            stk.push(sTemp.pop());
        }
        return counter;
    }

    public static boolean exist(Stack<Character> stk, char x) {
        Stack<Character> sTemp = new Stack<>();
        boolean found = false;
        while (!stk.isEmpty() && stk.top() != x) {
            sTemp.push(stk.pop());
        }
        if (!stk.isEmpty()) {
            found = true;
        }
        while (!sTemp.isEmpty()) {
            stk.push(sTemp.pop());
        }
        return found;
    }

    public static void popChar(Stack<Character> stk, char x) {
        Stack<Character> sTemp = new Stack<>();
        while (!stk.isEmpty() && stk.top() != x) {
            sTemp.push(stk.pop());
        }
        if (!stk.isEmpty()) {
            stk.pop();
        }
        while (!sTemp.isEmpty()) {
            stk.push(sTemp.pop());
        }
    }

    public static Stack<Integer> clone(Stack<Integer> stk)
    {
        Stack<Integer> sTemp = new Stack<>();
        while (!stk.isEmpty())
            sTemp.push(stk.pop());

        Stack<Integer> sCopy = new Stack<>();
        while (!sTemp.isEmpty())
        {
            sCopy.push(sTemp.top());
            stk.push(sTemp.pop());
        }
        return sCopy;
    }

    public static Stack<Item> intStkToItem(Stack<Character> stk) {
        Stack<Item> sTemp = new Stack<>();
        int counter = 0;
        while (!stk.isEmpty()) {
            counter = 0;
            char top = stk.top();
            while (exist(stk, top)) {
                popChar(stk, top);
                counter++;
            }
            sTemp.push(new Item(top, counter));
        }
        return sTemp;
    }

}



/*
Enter a sequence of numbers: 324623
[3, 2, 6, 4, 2, 3]
sum stack 20
stk size 6
Enter a sequence of characters: abdcdasda
[(b, 1), (c, 1), (s, 1), (d, 3), (a, 3)]
* */