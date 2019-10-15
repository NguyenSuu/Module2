import java.util.Scanner;

public class SumTheNumbersInAGivenColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter cow");
        int cow = scanner.nextInt();
        System.out.println("Enter column");
        int column = scanner.nextInt();

        double[][] arr = new double[cow][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "]= ");
                arr[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Enter the column you want to sum(fisrt column is 0)");
        int num = scanner.nextInt();
        try {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][num];
            }
            System.out.println("Sum of column " + num + " is " + sum);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Index exceeds the limit of the array");
        }
    }
}
