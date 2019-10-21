package animalandedible.animal;

import animalandedible.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSuond() {
        return "Chicken: cluck-cluck~";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
