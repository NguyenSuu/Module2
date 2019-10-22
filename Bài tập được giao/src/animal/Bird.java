package animal;

public class Bird implements ISpeaking {
    private String name;
    public Bird(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("sing");
    }
}
