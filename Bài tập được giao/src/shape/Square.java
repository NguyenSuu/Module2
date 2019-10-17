package shape;

public class Square{
    private static double side;
//    private double side;

    public Square(){
    }
    public  Square(double side){
        this.side=side;
    }

    public static double getSide() {
        return side;
    }

    public static void setSide(double side) {
        Square.side = side;
    }

    public static double getArea(){
        return side*side;
    }
    public static void paint(){
        System.out.println("Illustration");
        for(int i=0;i<side;i++){
            for (int j=0;j<side;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
