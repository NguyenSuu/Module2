package adameva;

public class Eva {
    private double weight;
    private Apple apple;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public Eva(){

    }
    public void getEat(){
        Apple.isAte();
        weight++;
    }
    @Override
    public String toString(){
        return "weight= "+weight+Apple.getWeight();
    }
}
