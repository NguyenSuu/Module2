import java.util.Scanner;

public class AddElementToArray {
    public static int[] AddElementToArray(int[] arr, int index, int value) {

        for (int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {10, 4, 6, 7, 8, 0, 0, 5, 0, 7};
        System.out.println(" The original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr[" + i + "] = " + arr[i]);
        }

        System.out.println("Enter the value you want to insert");
        int value = scanner.nextInt();

        System.out.println("Enter the location you want to insert");
        int index = scanner.nextInt();
        if(index <=1 || index>=arr.length-1){
            System.out.println("Not find");
        }else{
            int[] newArr = AddElementToArray(arr, index, value);

            System.out.println("The array after being changed");
            for (int i = 0; i < newArr.length; i++) {
                System.out.println("Arr[" + i + "] = " + newArr[i]);
            }
        }


    }
}
