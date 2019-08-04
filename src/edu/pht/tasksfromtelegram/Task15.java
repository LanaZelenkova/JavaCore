package edu.pht.tasksfromtelegram;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int[] array1 = new int[getSize()];
        int[] array2 = new int[getSize()];
        fill(array1);
        print(array1);
        fill(array2);
        print(array2);
        getDuplicates(array1, array2);
    }
    private static int getSize() {
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
        return n;
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
    private static void getDuplicates(int[] array1, int[] array2) {
        boolean isDuplicates = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("Duplicate is " + array2[j]);
                    isDuplicates = true;
                }
            }
        }
        if (!isDuplicates) {
            System.out.println("Not found!");
        }
    }
}
