public class NodeUtil2 {
    public static void main(String[] args) {
        int [] arr = {19, 42, 12, 19, -20, 20, 19, 19, 19, 25, 12, 23};
        Node<Integer> lst = NodeUtil.build(arr);
        NodeUtil.show(lst);
        lst = removeUntil(lst, 19, 4);
        NodeUtil.show(lst);

    }

    // removes every node that has the value of the given num
    public static Node<Integer> removeAll(Node<Integer> lst, int num) {
        Node<Integer> dummy = new Node<Integer>(0, lst);
        Node<Integer> prev = dummy;
        Node<Integer> pos = lst;

        while (pos != null) {
            if (pos.getValue() == num) {
                prev.setNext(pos.getNext());
            } else {
                prev = pos;
            }
            pos = pos.getNext();
        }
        return dummy.getNext();
    }

    // removes specific amount of nodes that have the value of the given num
    public static Node<Integer> removeUntil(Node<Integer> lst, int num, int count) {
        Node<Integer> dummy = new Node<Integer>(0, lst); // only here temporarily
        Node<Integer> prev = dummy;
        Node<Integer> pos = lst;
        int deleteCount = 0;

        while (pos != null && deleteCount < count) {
            if (pos.getValue() == num) {
                prev.setNext(pos.getNext());
                deleteCount++;
            } else {
                prev = pos;
            }
            pos = pos.getNext();
        }
        return dummy.getNext();
    }

    // returns the biggest value
    public static int maxValue(Node<Integer> lst) {
        if (!lst.hasNext()) return lst.getValue();
        return Math.max(lst.getValue(), maxValue(lst.getNext()));
    }

    //returns the min value
    public static int minValue(Node<Integer> lst) {
        if (!lst.hasNext()) return lst.getValue();
        return Math.min(lst.getValue(), minValue(lst.getNext()));
    }



}
