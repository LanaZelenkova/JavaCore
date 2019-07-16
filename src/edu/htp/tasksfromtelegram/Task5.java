package edu.htp.tasksfromtelegram;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        fill(array);
        print(array);
        sort(array);
        print(array);
        System.out.println("Enter a value to search: ");
        int value = sc.nextInt();
        int result = search(array, value);
        if (result != -1) {
            System.out.println("Yes, element with index " + result);
        } else {
            System.out.println("No, try again... ");
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
    private static void sort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    private static int search(int[] array, int value) {
        int index = -1;
        int indexLeft = 0;
        int indexRight = array.length - 1;
        int indexMiddle = (indexLeft + indexRight) / 2;
        while (indexLeft <= indexRight) {
            if (array[indexMiddle] > value) {
                indexRight = indexMiddle - 1;
            } else if (array[indexMiddle] < value) {
                indexLeft = indexMiddle + 1;
            } else {
                index = indexMiddle;
                return index;
            }
            indexMiddle = (indexLeft + indexRight) / 2;
        }
        return index;
    }
}
