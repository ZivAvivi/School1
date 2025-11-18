public class NodeTest {

    public static void main (String[] args)
    {
        int [] arr = { 4, 7, 3, 5 };
        Node<Integer> lst1 = build(arr);
        show (lst1);
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

}
