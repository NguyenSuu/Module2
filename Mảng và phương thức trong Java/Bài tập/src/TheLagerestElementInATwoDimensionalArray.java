import java.util.Scanner;

public class TheLagerestElementInATwoDimensionalArray {
   public static double[][] CreateArr(int cow, int column) {
        Scanner input = new Scanner(System.in);

        double[][] arr = new double[cow][column];
        for (int i = 0; i <= cow - 1; i++) {
            for (int j = 0; j <= column - 1; j++) {

                System.out.print("Arr[" + i + "][" + j + "]= ");
                arr[i][j] = input.nextDouble();
            }
            System.out.println();
        }
        return arr;
    }

    public static void TheLagerestElementInATwoDimensionalArray(double[][] arr) {
        double max = arr[0][0];
        int indexI = 0, indexJ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("The value of the largest element is " + max + ",  is located at Arr[" + indexI + "][" + indexJ + "]");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter cow of array");
        int cow = input.nextInt();

        System.out.println("Enter column of array");
        int column = input.nextInt();

        double[][] arr = CreateArr(cow, column);
        TheLagerestElementInATwoDimensionalArray(arr);

    }
}
