package edu.htp.tasksfromtelegram;

import java.util.Scanner;

public class Task12 {
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
        getDuplicates(array);
    }
    private static void fill(int[] array) {
        int max = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ++max);
        }
    }
    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void getDuplicates(int[] array) {
        boolean isDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    System.out.println("Duplicate is " + array[j] + " with index " + j);
                    isDuplicates = true;
                }
            }
        }
        if (!isDuplicates) {
            System.out.println("Not found!");
        }
    }
}
