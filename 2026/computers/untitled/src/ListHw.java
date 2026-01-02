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

        int[] arr2 = {2, 5, 7, 8, -3, -1, 0, 2, 4, 6, 5, 5, 6, 7, 12};
        Node<Integer> lst2 = NodeTest.build(arr2);
        System.out.println(longestUpSequence(lst2));
        // 6

        int[] sort1 = {1,3, 8, 12};
        int[] sort2 = {3, 9, 12, 14};
        Node<Integer> lst3 = NodeTest.build(sort1);
        Node<Integer> lst4 = NodeTest.build(sort2);
        NodeTest.show(intersection(lst3, lst4));
        
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
            if (pos.getValue() > 0 && pos.hasNext()){
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

    // question 1 - 4
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


    public static int longestUpSequence(Node<Integer> lst) {
        int maxCount = 0;
        int currentCount = 0;

        if (lst.getValue() > 0) {
            currentCount = 1;
            maxCount = 1;
        }

        Node<Integer> prev = lst;
        Node<Integer> pos = lst.getNext();
        while (pos != null) {
            if (pos.getValue() > 0) {
                if (pos.getValue() > prev.getValue())
                    currentCount++;
            } else
                currentCount = 0;

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }

            prev = pos;
            pos = pos.getNext();
        }

        return maxCount;
    }



    public static Node<Integer> intersection(Node<Integer> lst, Node<Integer> lst2) {
        Node<Integer> temp = new Node<>(-1);
        Node<Integer> posTemp = temp;
        Node<Integer> pos = lst;
        Node<Integer> pos2 = lst2;

        while (pos != null && pos2 != null) {
            if (pos.getValue() == pos2.getValue()) {
                posTemp.setNext(new Node<>(pos.getValue()));
                posTemp = posTemp.getNext();
                pos = pos.getNext();
                pos2 = pos2.getNext();
            }
            else if (pos.getValue() < pos2.getValue()) {
                pos = pos.getNext();
            }
            else {
                pos2 = pos2.getNext();
            }
        }
        return temp.getNext();
    }
}
