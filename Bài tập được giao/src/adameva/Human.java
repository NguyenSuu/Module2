package adameva;

public class Human {
    private String name;
    private double weight;
    private Apple apple;

    public String getName() {
        return name;
    }
    public Human(Apple apple){
        this.apple=apple;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Human(){

    }
    public void getEat(){
        apple.isAte();
        weight++;
    }
    @Override
    public String toString(){
        return "weight of"+name+" = "+weight+" kg";
    }
}
