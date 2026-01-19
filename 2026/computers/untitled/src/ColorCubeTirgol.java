import java.util.Scanner;

public class ColorCubeTirgol {

    public static void main(String[] args) {
        Node<ColoredCube> lst = buildColorListTEST();
        show(lst);
        show(getListByColor("test", lst));
    }

    public static Scanner input = new Scanner(System.in);

    public static Node<ColoredCube> buildColorListTEST() {
        Node<ColoredCube> lst = new Node<>(null);
        Node<ColoredCube> pos = lst;
        for (int i = 0; i < 4; i++) {
            pos.setNext(new Node<>(new ColoredCube()));
            pos = pos.getNext();
        }
        return lst.getNext();
    }

    public static ColoredCube getColoredCube(int side, String color) {
        return new ColoredCube(color, side);
    }

    public static Node<ColoredCube> buildColorList() {
        int side;
        String color;
        Node<ColoredCube> lst = new Node<>(null);
        Node<ColoredCube> pos = lst;
        for (int i = 0; i < 10; i++) {
            System.out.print("enter side ->");
            side = input.nextInt();
            System.out.print("enter color ->");
            color = input.next();
            pos.setNext(new Node<>(getColoredCube(side, color)));
            pos = pos.getNext();
        }
        return lst.getNext();
    }

    public static void show(Node<ColoredCube> lst) {
        Node<ColoredCube> curr = lst;
        System.out.print("{");
        while (curr != null) {
            System.out.print("("+ curr.getValue().toString() + "), ");
            curr = curr.getNext();
        }
        System.out.println("}");
    }

    public static Node<ColoredCube> getListByColor(String color, Node<ColoredCube> lst) {
        Node<ColoredCube> lst2 = new Node<>(null);
        Node<ColoredCube> pos2 = lst2;
        Node<ColoredCube> pos = lst;
        while (pos != null) {
            if (pos.getValue().getColor().equals(color)) {
                pos2.setNext(new Node<>(pos.getValue()));
                pos2 = pos2.getNext();
            }
            pos = pos.getNext();
        }
        return lst2.getNext();
    }
}
