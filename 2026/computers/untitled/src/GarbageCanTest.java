public class GarbageCanTest {

    public static void main(String[] args) {
        Node<GarbageCan> list = new Node<>(new GarbageCan(6, 100, 90, "City"));
        list.setNext(new Node<>(new GarbageCan(7, 100, 20, "City")));
        list.getNext().setNext(new Node<>(new GarbageCan(9, 100, 50, "Village")));

        System.out.println("list:");
        show(list);
        System.out.println();

        System.out.println("need to be empty:");
        show(howManyNeedToEmpty(list));
        System.out.println();

        System.out.println("Biggest Hood: " + getBiggestNeighborhood(list));
        System.out.println();

        emptyAll(list);
        System.out.println("need to be empty:");
        show(howManyNeedToEmpty(list));
    }


    public static void show(Node<GarbageCan> lst) {
        Node<GarbageCan> curr = lst;
        System.out.print("{");
        while (curr != null) {
            System.out.print("("+ curr.getValue().toString() + "), ");
            curr = curr.getNext();
        }
        System.out.println("}");
    }

    public static Node<GarbageCan> howManyNeedToEmpty(Node<GarbageCan> lst) {
        Node<GarbageCan> pos = lst;
        Node<GarbageCan> lst2 = new Node<>(null);
        Node<GarbageCan> pos2 = lst2;
        while (pos != null) {
            if (pos.getValue().getQuantity() / pos.getValue().getCapacity()  > 0.8 ){
                pos2.setNext(new Node<>(pos.getValue()));
                pos2 = pos2.getNext();
            }
            pos = pos.getNext();
        }
        return lst2.getNext();
    }

    public static void emptyAll(Node<GarbageCan> lst) {
        Node<GarbageCan> pos = lst;
        while (pos != null) {
            pos.getValue().empty();
            pos = pos.getNext();
        }
    }

    public static Node<GarbageCan> howManyInNeighborhood(Node<GarbageCan> lst, String neighborhood) {
        Node<GarbageCan> pos = lst;
        Node<GarbageCan> lst2 = new Node<>(null);
        Node<GarbageCan> pos2 = lst2;
        while (pos != null) {
            if (pos.getValue().getNeighborhood().equals(neighborhood)) {
                pos2.setNext(new Node<>(pos.getValue()));
                pos2 = pos2.getNext();
            }
            pos = pos.getNext();
        }
        return lst2.getNext();
    }

    public static int howManyInNeighborhoodLength(Node<GarbageCan> lst, String neighborhood) {
        Node<GarbageCan> lst2 = howManyInNeighborhood(lst, neighborhood);
        int count = 0;
        Node<GarbageCan> pos = lst2;
        while (pos != null) {
            count++;
            pos = pos.getNext();
        }
        return count;
    }

    public static String getBiggestNeighborhood(Node<GarbageCan> lst) {
        Node<GarbageCan> pos = lst;
        String neighborhood = "";
        int biggestNumber = 0;
        while (pos != null) {
            if (howManyInNeighborhoodLength(lst, pos.getValue().getNeighborhood()) > biggestNumber){
                neighborhood = pos.getValue().getNeighborhood();
                biggestNumber = howManyInNeighborhoodLength(lst, neighborhood);
            }
            pos = pos.getNext();
        }
        return neighborhood;
    }

}
