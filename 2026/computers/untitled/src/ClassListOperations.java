import java.util.Scanner;

public class ClassListOperations {
    public static void main(String[] args) {
        show(createCardList());
    }

    public static Scanner input = new Scanner(System.in);

    public static Node<Point> createCardList() {
        Node<Point> lst = new Node<Point>(null);
        System.out.print("x: ");
        int x = input.nextInt();
        int y;
        Node<Point> curr = lst;

        while (x != -1){
            System.out.print("y: ");
            y = input.nextInt();
            curr.setNext(new Node<>(new Point(x, y)));
            curr = curr.getNext();
            System.out.print("x: ");
            x = input.nextInt();
        }

        return lst.getNext();
    }

    public static void show(Node<Point> lst) {
        Node<Point> curr = lst;
        System.out.print("{");
        while (curr != null) {
            System.out.print(curr.getValue().toString() + ", ");
            curr = curr.getNext();
        }
        System.out.print("}");
    }
}
