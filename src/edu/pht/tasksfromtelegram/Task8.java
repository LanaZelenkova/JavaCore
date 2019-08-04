package edu.pht.tasksfromtelegram;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] arrayCopy = new int[n];
        fill(array);
        print(array);
        copy(array, arrayCopy);
        print(arrayCopy);
    }
    private static void fill(int[] array) {
        int max = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ++max);
        }
    }
    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
    private static void copy(int[] src, int[] dest) {
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
    }
}
