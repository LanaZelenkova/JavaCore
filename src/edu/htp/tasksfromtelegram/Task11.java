package edu.htp.tasksfromtelegram;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        print(array);
        reverse(array);
        print(array);
    }
    private static void reverse(int[] array) {
        int tmp;
        for(int i = 0, j = array.length - 1; i < j; i++, j--) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
    private static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
