package shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10.4);
        shapes[1] = new Rectangle(6, 8);
        shapes[2] = new Square(9);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                Resizeable resizeable = (Circle) shape;
                resizeable.resize(Math.random() * 100 + 1);
            } else if (shape instanceof Rectangle) {
                Resizeable resizeable = (Rectangle) shape;
                resizeable.resize(Math.random() * 100 + 1);
            }
        }
        System.out.println("********************************");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

    }
}
