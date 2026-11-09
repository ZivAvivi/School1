public class Testt {

    public static void main(String[] args) {

        Circle[] arr = new Circle[4];

        arr[0] = new Circle(new Point(1, 2), 3);
        arr[1] = new Cylinder(new Point(0, 0), 2, 5);
        arr[2] = new Cone(new Point(3, 4), 1.5, 4);
        arr[3] = arr[0];   // another reference to the same circle

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Type: " + arr[i].getClass().getName());
            System.out.println(arr[i]);
            System.out.println();
        }
    }
}
/*
Shape 1
Type: Circle
center: (1, 2), radius: 3.0
Area: 28.27
Perimeter: 18.85

Shape 2
Type: Cylinder
Cylinder: center: (0, 0), radius: 2.0, height: 5.0
Area: 12.57
Perimeter: 12.57
Surface area: 87.96
Lateral area: 62.83

Shape 3
Type: Cone
Cone: center: (3, 4), radius: 1.5, height: 4.0
Area: 7.07
Perimeter: 9.42
Surface area: 27.2
Lateral area: 20.13

Shape 4
Type: Circle
center: (1, 2), radius: 3.0
Area: 28.27
Perimeter: 18.85
* */