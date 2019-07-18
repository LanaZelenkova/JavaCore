package edu.htp.tasksfromtelegram;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter array size as positive integer: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a number!");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        int[] array = new int[n];
        fill(array);
        print(array);
        System.out.println("The second largest element is " + getSecondLargestItem(array));
    }
    private static void fill(int[] array) {
        int max = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ++max);
        }
    }
    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }
    private static int getSecondLargestItem(int[] array) {
        int item = array[0];
        int n = array.length;
        sort(array);
        if (array[n - 2] != array[n - 1]) {
            item = array[n - 2];
        } else {
            for (int i = n - 3; i >= 0; i--) {
                if (array[i] != array[n - 1]) {
                    item = array[i];
                    break;
                }
            }
        }
        return item;
    }
    private static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        print(array);
    }
}
