package edu.pht.lessonjavastart;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double percent;
        do {
            System.out.println("Enter percent as positive number: ");
            while (!sc.hasNextDouble()) {
                System.out.println("This is not a number!");
                sc.next();
            }
            percent = sc.nextInt();
        } while (percent <= 0);
        double[] array = new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 0};
        System.out.println(Arrays.toString(increaseArray(percent, array)));
    }
    private static double[] increaseArray(double percent, double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += arr[i] * percent/100;
        }
        return arr;
    }
}
