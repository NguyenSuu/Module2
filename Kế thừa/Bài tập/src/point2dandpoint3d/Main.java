package point2dandpoint3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(2.2,6.6);
        System.out.println(point2D);

        Point3D point3D= new Point3D();
        point3D.setXYZ(5,9,45);
        System.out.println(point3D);
    }
}
