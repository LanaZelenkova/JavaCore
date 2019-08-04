package edu.pht.tasksfromtelegram;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[] {-1, 0, -1001, 99, 2, 3, 4, 77, -88, 99, 99};
        System.out.println(Arrays.toString(array));
        System.out.println(" Max element is " + findMax(array));
        System.out.println(" Min element is " + findMin(array));
    }
    private static int findMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    private static int findMin(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
