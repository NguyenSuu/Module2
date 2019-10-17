package shape;

public class Shape {
    private Square square;

    private Rectangle rectangle;
    private Circle circle;

    public Shape() {
    }
    public Shape(Square square,Rectangle rectangle,Circle circle){
        this.square=square;
        this.rectangle=rectangle;
        this.circle=circle;
    }
    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Rectangle getRectangle() {
        return this.rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Square getSquare() {
        return this.square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
