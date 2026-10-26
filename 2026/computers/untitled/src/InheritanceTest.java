public class InheritanceTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(p2);
        ColoredPoint cp1 = new ColoredPoint(5, 6, "red");
        ColoredPoint cp2 = new ColoredPoint(cp1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(cp1);
        System.out.println(cp2);


        Circle plain = new Circle(new Point(1, 2), 5);
        Circle colored = new Circle(cp1, 3);
        Cone cone = new Cone(new Point(0, 0), 3, 4);
        Cylinder cyl = new Cylinder(new Point(0, 0), 3, 4);

        System.out.println("Plain circle:   area " + plain.area() + ", perimeter " + plain.perimeter());
        System.out.println("Colored circle: area " + colored.area() + ", perimeter " + colored.perimeter());
        System.out.println("Cone:           area " + cone.area() + ", perimeter " + cone.perimeter() + ", surface " + cone.surfaceArea() + ", lateral " + cone.lateralArea() + ", volume " + cone.volume());
        System.out.println("Cylinder:       area " + cyl.area() + ", perimeter " + cyl.perimeter() + ", surface " + cyl.surfaceArea() + ", lateral " + cyl.lateralArea() + ", volume " + cyl.volume());
    }

}

/*
(0, 0)
(3, 4)
(3, 4)
(5, 6) color: red
(5, 6) color: red
Plain circle:   area 78.53981633974483, perimeter 31.41592653589793
Colored circle: area 28.274333882308138, perimeter 18.84955592153876
Cone:           area 28.274333882308138, perimeter 18.84955592153876, surface 75.39822368615503, lateral 47.12388980384689, volume 37.69911184307752
Cylinder:       area 28.274333882308138, perimeter 18.84955592153876, surface 131.94689145077132, lateral 75.39822368615503, volume 113.09733552923255
* */
