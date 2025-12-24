public class ListHw {

    public static void main(String[] args) {
        int [] arr = {2, 5, 1, 7, -4, 6, -1, 12, 3, 9, 11, 4, 7, -2, 11, -2};
        Node<Integer> lst = NodeTest.build(arr);
        NodeTest.show(lst);

        System.out.println(sequenceCount(lst));
        System.out.println(longestSequence(lst));

        NodeTest.show(getSequenceList(lst));
        NodeTest.show(getSequenceSumList(lst));

        /*
        [ 2,  5,  1,  7,  -4,  6,  -1,  12,  3,  9,  11,  4,  7,  -2,  11,  -2]
        4
        6
        [ 4,  1,  6,  1]
        [ 15,  6,  46,  11]
        * */
    }

    // question 1 - 1
    public static int sequenceCount(Node<Integer> lst){
        int count = 0;
        boolean sequence = true;
        Node<Integer> pos = lst;
        while (pos != null)
        {
            if (pos.getValue() < 0 && sequence){
                count++;
                sequence = false;
            } else sequence = true;
            pos = pos.getNext();
        }
        return count;
    }

    // question 1 - 2
    public static int longestSequence(Node<Integer> lst){
        int count = 0;
        int longestSequence = 0;
        Node<Integer> pos = lst;
        while (pos != null)
        {
            if (pos.getValue() > 0){
                count++;
            } else {
                if (count > longestSequence)
                    longestSequence = count;
                count = 0;
            }
            pos = pos.getNext();
        }
        return longestSequence;
    }

    // question 1 - 3
    public static Node<Integer> getSequenceList(Node<Integer> lst){
        int count = 0;
        Node<Integer> temp = new Node<>(-1);
        Node<Integer> pos2 = temp;
        Node<Integer> pos = lst;
        while (pos != null)
        {
            if (pos.getValue() > 0){
                count++;
            } else {
                pos2.setNext(new Node<>(count));
                pos2 = pos2.getNext();
                count = 0;
            }
            pos = pos.getNext();
        }
        return temp.getNext();
    }

    public static Node<Integer> getSequenceSumList(Node<Integer> lst){
        int count = 0;
        Node<Integer> temp = new Node<>(-1);
        Node<Integer> pos2 = temp;
        Node<Integer> pos = lst;
        while (pos != null)
        {
            if (pos.getValue() > 0){
                count+= pos.getValue();
            } else {
                pos2.setNext(new Node<>(count));
                pos2 = pos2.getNext();
                count = 0;
            }
            pos = pos.getNext();
        }
        return temp.getNext();
    }



}
