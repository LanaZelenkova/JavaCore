package edu.pht.tasksfromtelegram;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[] {99, 99, 100, 4, 6, 99, 99, 0, 9, 7, 6, 99};
        print(array);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to delete: ");
        int value = sc.nextInt();
        print(deleteValuesFromArray(array, value));
    }
    private static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    private static int[] deleteValuesFromArray(int[] array, int value) {
        int[] temp;
        int i = 0;
        while ( i < array.length) {
            if (array[i] == value) {
                int len = array.length - 1;
                temp = new int[len];
                for (int j = 0; j < i; j++) {
                    temp[j] = array[j];
                }
                for (int j = i; j < len; j++) {
                    temp[j] = array[j + 1];
                }
                array = temp;
                i--;
            }
            i++;
        }
        return array;
    }
}
