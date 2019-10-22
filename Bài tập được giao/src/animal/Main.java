package animal;

public class Main {
    public static void main(String[] args) {
        Pet[] pets=new Pet[3];
        pets[0]=new Dog("pug",new License(false));
        pets[1]=new Cat("Tom");
        pets[2]=new Retriever("becgie dog",new License(true),new Bird("stork"));

        for(Pet pet:pets) {
            System.out.print(pet.getName()+" ");
            pet.speak();
            if(pet instanceof Retriever){
                System.out.print("and it is retriever: ");
                System.out.println( ((Retriever) pet).retrieve().getName());

            }
        }


    }
}
