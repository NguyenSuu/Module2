package shape;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Shape();
        Square.setSide(5);
        Square.paint();
        Rectangle.setHeight(5);
        Rectangle.setWidth(9);
        Rectangle.paint();
    }
}
