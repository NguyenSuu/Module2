package shape;

public class Rectangle {
    private static double width;
    private static double height;
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        Rectangle.width = width;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Rectangle.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public static void paint(){
        System.out.println("Illustration");
        for(int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
