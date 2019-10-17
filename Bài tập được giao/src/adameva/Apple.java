package adameva;

public class Apple {
    private static double weight;
    public Apple(){
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Apple.weight = weight;
    }
    public static void isAte(){
        Apple.weight--;
    }
    @Override
    public String toString(){
        return "weight also "+weight;
    }
}
