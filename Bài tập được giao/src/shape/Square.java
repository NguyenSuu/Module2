package shape;

public class Square{
    private double side;

    public Square(){
    }
    public  Square(double side){
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }
    public void paint(){
        System.out.println("Illustration");
        for(int i=0;i<side;i++){
            for (int j=0;j<side;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
