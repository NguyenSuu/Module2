package pointandmoveablepoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setSpeed(5, 6);
        moveablePoint.setX(5);
        moveablePoint.setY(7);
        System.out.println(moveablePoint);

        Point point = new Point();
        point.setXY(4, 5);
        System.out.println(point);
    }
}
