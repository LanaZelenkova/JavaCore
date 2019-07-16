package edu.htp.tasksfromtelegram;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        fill(array);
        print(array);
        System.out.println("Enter the value whose index you want to find: ");
        int value = sc.nextInt();
        int index = findIndex(array, value);
        if (index != -1) {
            System.out.println("Index of the value " + value + " is " + index);
        } else {
            System.out.println("Value not found!");
        }
    }
    private static void fill(int[] array) {
        int max = 100;
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
    private static int findIndex(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }
}
