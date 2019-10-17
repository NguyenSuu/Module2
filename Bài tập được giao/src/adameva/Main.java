package adameva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human adam = new Human();
        adam.setWeight(50);
        System.out.println("Weight of Adam is: "+adam.getWeight());
        Human eva = new Human();
        eva.setWeight(40);
        System.out.println("Weight of Eva is: "+eva.getWeight());
        System.out.println("Enter weight of apple");
        try {
            int weightApple = scanner.nextInt();
            adam.getApple().setWeight(weightApple);

            while (adam.getApple().getWeight() > 0) {
                System.out.println("Choose until the apple has been ate: ");
                System.out.println("1.Adam eat apple");
                System.out.println("2.Eva eat apple");
                System.out.println("What is your choose ?");
                int choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        adam.getEat();
                        break;
                    case 2:
                        eva.getEat();
                        break;
                }
            }

        }catch (Exception e){
            System.out.println("Invalid data");
        }
        System.out.println("After they have ate the apple");
        System.out.println(adam);
        System.out.println(eva);
        System.out.println("Weight of apple also: "+adam.getApple().getWeight());

    }
}
