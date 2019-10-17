package shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(new Square(),new Rectangle(),new Circle());

        shape.getSquare().setSide(8);
        System.out.print("The square has side= "+shape.getSquare().getSide());
        System.out.println(" and area= "+shape.getSquare().getArea());
        shape.getSquare().paint();
        System.out.println("///////////////////////////////////////");

        shape.getRectangle().setWidth(5);
        shape.getRectangle().setHeight(8);
        System.out.print("The rectangle has width= "
                +shape.getRectangle().getWidth()
                +" and height= "
                +shape.getRectangle().getHeight());
        System.out.println(" and area= "+shape.getRectangle().getArea());
        shape.getRectangle().paint();
        System.out.println("///////////////////////////////////////");

        shape.getCircle().setRadius(6);
        System.out.print("The circle has radius= "+shape.getCircle().getRadius());
        System.out.println(" and area= "+shape.getCircle().getArea());
        shape.getCircle().paint();





    }
}
