public class NodeTest {

    public static void main (String[] args)
    {
        int [] arr = { 4, 7, 3, 5 };
        Node<Integer> lst1 = build(arr);
        Node<Integer> lst2 = buildToNum(8);
        show (lst1);
        show(lst2);
        System.out.println(isSorted(lst1));
        System.out.println(isSortedReq(lst1));
    }
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

    public static void show (Node<Integer> lst)
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

    public static int sumList(Node<Integer> lst){
        int sum = 0;
        while (lst != null)
        {
            sum += lst.getValue();
            lst = lst.getNext();
        }

        return sum;
    }

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

    public static boolean isNumberInList(int num, Node<Integer> lst){
        while (lst != null)
        {
            if (lst.getValue() == num)
                return true;
            lst = lst.getNext();
        }

        return false;
    }

    public static boolean isNumberInListReq(int num, Node<Integer> lst){
        if (lst == null) return false;
        if (lst.getValue() == num) return true;

        return isNumberInListReq(num, lst.getNext());
    }

    public static boolean isSorted(Node<Integer> lst){
        while (lst.getNext() != null)
        {
            if (lst.getValue() > lst.getNext().getValue())
                return false;

            lst = lst.getNext();
        }
        return true;
    }

    public static boolean isSortedReq(Node<Integer> lst){
        if (lst.getNext() == null) return true;
        return (lst.getValue() < lst.getNext().getValue() && isSortedReq(lst.getNext()));
    }
}
