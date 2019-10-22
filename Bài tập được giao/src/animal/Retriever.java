package animal;

public class Retriever extends Dog {
    private Bird bird;
    public Retriever(String name, License license,Bird bird) {
        super(name, license);
        this.bird=bird;
    }
    @Override
    public void speak(){
        super.speak();
    }
    public Bird retrieve(){
       return this.bird;
    }
}
