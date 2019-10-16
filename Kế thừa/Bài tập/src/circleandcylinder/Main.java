package circleandcylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("***************************");

        circle = new Circle(5.0, "red");
        System.out.println(circle);
        System.out.print("Area: ");
        System.out.println(circle.getArea());
        System.out.println("***************************");

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        System.out.println("***************************");

        cylinder = new Cylinder(5.0, "blue", 3);
        System.out.println(cylinder);
        System.out.print("Volume: ");
        System.out.println(cylinder.getVolume());

    }


}
