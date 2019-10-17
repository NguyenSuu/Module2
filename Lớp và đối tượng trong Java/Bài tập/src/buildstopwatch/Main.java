package buildstopwatch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers element of array ");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.print("The array original: ");
        System.out.println(Arrays.toString(arr));
        StopWatch stopWatch = new StopWatch();
        int min, tempt;
        stopWatch.start();

        for (int i = 0; i < num - 1; i++) {
            min = i;
            for (int j = i + 1; j < num; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                tempt = arr[i];
                arr[i] = arr[min];
                arr[min] = tempt;
            }
        }
        stopWatch.stop();
        System.out.print("The array new: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Total time after change: " + stopWatch.getElapsedTime() + " ms");

    }
}
