package adameva;

public class Apple {
    private  static int weight;
    public Apple(){
    }

    public  static int getWeight() {
        return weight;
    }

    public  static void setWeight(int weight) {
        Apple.weight = weight;
    }
    public static void isAte(){
        Apple.weight--;
    }

}
