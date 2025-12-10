import java.util.Scanner;

public class NodeTest {

    public static void main (String[] args)
    {
        int [] arr = {1, 0, 1, 1, 1, 0, 1 ,0};
        Node<Integer> lst = build(arr);
        System.out.println(sequense(lst));

    }
    public static Scanner input = new Scanner(System.in);



    //--- בניית שרשרת מההתחלה לסוף ---
    public static Node<Integer> build (int [] arr)
    {
        Node<Integer> lst = new
                Node<Integer>(arr[0]);
        Node<Integer> pos = lst;

        for (int i = 1 ; i < arr.length ; i++)
        {
            pos.setNext (new Node<Integer> (arr[i]));
            pos = pos.getNext();
        }
        return lst;
    }

    public static Node<Integer> buildInput ()
    {
        System.out.print("enter value -> ");
        int value = input.nextInt();
        Node<Integer> lst = new Node<Integer>(0);
        Node<Integer> pos = lst;

        while (value != 0){
            pos.setNext(new Node<>(value));
            pos = pos.getNext();

            System.out.print("enter value -> ");
            value = input.nextInt();
        }
        return lst.getNext();
    }

    // prints list
    public static void show(Node<Integer> lst)
    {
        System.out.print("[");
        while (lst != null)
        {
            System.out.print(lst.toString());
            if (lst.hasNext())
                System.out.print(", ");
            lst = lst.getNext();
        }
        System.out.println("]");
    }

    // returns the sum of the list
    public static int sumList(Node<Integer> lst){
        int sum = 0;
        while (lst != null)
        {
            sum += lst.getValue();
            lst = lst.getNext();
        }

        return sum;
    }

    // build a list with num amount of nodes
    public static Node<Integer> buildToNum (int num)
    {
            Node<Integer> lst = new Node<Integer>(0);
            Node<Integer> pos = lst;

            for (int i = 1 ; i < num ; i++)
            {
                pos.setNext (new Node<Integer> (i));
                pos = pos.getNext();
            }
            return lst;
    }

    // checks if a given num is in the list
    public static boolean isNumberInList(int num, Node<Integer> lst){
        while (lst != null)
        {
            if (lst.getValue() == num)
                return true;
            lst = lst.getNext();
        }
        return false;
    }

    // checks if a given num is in the list but with recursion
    public static boolean isNumberInListReq(int num, Node<Integer> lst){
        if (lst == null) return false;
        if (lst.getValue() == num) return true;

        return isNumberInListReq(num, lst.getNext());
    }

    // checks if the list is sorted
    public static boolean isSorted(Node<Integer> lst){
        while (lst.getNext() != null)
        {
            if (lst.getValue() > lst.getNext().getValue())
                return false;

            lst = lst.getNext();
        }
        return true;
    }

    // checks if the array is sorted with recursion
    public static boolean isSortedReq(Node<Integer> lst){
        if (lst.getNext() == null) return true;
        return (lst.getValue() < lst.getNext().getValue() && isSortedReq(lst.getNext()));
    }


    // removes a value in the list
    public static <T> Node<T> remove(Node<T> lst, Node<T> pos)
    {
        if(pos == lst) // if the pos == the first node in list
            return lst.getNext();

        Node<T> prev = lst;

        while(prev.getNext() != pos)
            prev = prev.getNext();

        prev.setNext(pos.getNext());
        return lst;
    }

    //adds a new value in list
    public static <T> Node<T> insert(Node<T> lst, Node<T> pos , T x)
    {
        if(pos == null)
            lst = new Node<T>(x,lst);
        else
        {
            Node<T> temp = new Node<T>(x, pos.getNext());
            pos.setNext(temp);
        }
        return lst;
    }

    // list length
    public static <T> int numOfItemsInList(Node<T> first)
    {
        int count=0;
        Node<T> p = first;
        while (p != null)
        {
            count++;
            p = p.getNext();
        }
        return count;
    }

    public static Node<Integer> addMikum(Node<Integer> lst)
    {
        int x = 2;
        Node<Integer> temp, pos = lst;
        temp = new Node<Integer>(1);
        temp.setNext(lst);
        lst = temp;

        while (pos.getNext() != null)
        {
            temp = new Node<Integer>(x);
            temp.setNext(pos.getNext());
            pos.setNext(temp);
            x++;
            pos = pos.getNext();
            pos = pos.getNext();
        }

        return lst;
    }

    /**
     * Inserts a new node between every pair of consecutive nodes,
     * where the new node's value is the sum of its two neighbors.
     */
    public static void sumTwo(Node<Integer> lst)
    {
        Node<Integer>temp, pos = lst;
        while(pos!=null)
        {
            temp = new Node<Integer>(pos.getValue() + pos.getNext().getValue());

            pos = pos.getNext();
            temp.setNext(pos.getNext());
            pos.setNext(temp);
            pos = temp.getNext();
        }
    }

    /**
     * Reverses the order of the nodes in the linked list by iteratively
     * moving the subsequent node to the head of the list.
     */
    public static Node<Integer> reverse (Node<Integer> lst)
    {
        if (lst == null)
            return lst;

        int x;
        Node<Integer> pos = lst, p;
        while (pos.hasNext())
        {
            p = pos.getNext();
            x = p.getValue();
            pos.setNext (p.getNext());
            lst = new Node<Integer>(x, lst);
        }
        return lst;
    }

    public static Node<Integer> sumAndAddDigits(Node<Integer> lst) {
        Node<Integer> prevInsert = null;
        Node<Integer> pos = lst;

        while (pos != null) {
            lst = insert(lst, prevInsert, pos.getValue() + pos.getNext().getValue());

            if (prevInsert == null) {
                prevInsert = lst.getNext().getNext();
            } else {
                prevInsert = prevInsert.getNext().getNext().getNext();
            }
            pos = pos.getNext().getNext();
        }

        return lst;
    }

    public static Node<Integer> removeAllEvenDigits(Node<Integer> lst){
        Node<Integer> pos = lst;
        while (pos != null){
            if (pos.getValue() %2 == 0)
                lst = remove(lst, pos);
            pos = pos.getNext();
        }
        return lst;
    }

    public static int sequense(Node<Integer> lst){
        int sum = 0;
        while (lst.getNext() != null && lst.getNext().getNext() != null)
        {
            if (lst.getValue() == 1 && lst.getNext().getValue() == 0 && lst.getNext().getNext().getValue() == 1)
                sum++;
            lst = lst.getNext();
        }

        return sum;
    }

}
/*
פלט
[ 3,  2,  4,  5,  3,  1]
[ 3,  5,  3,  1]
[ 8,  3,  5,  4,  3,  1]
* */
