package edu.htp.tasksfromtelegram;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        Integer[] numbers = {44, 88, 9, -6, 0, -1, -101, -101, 44};
        String[] strings = {"qwerty", "abc", "pqr", "sqr", "sqr ", "", " ", "a", "ab", "abc", "abcd"};
        System.out.println("Before:");
        printArray(numbers);
        printArray(strings);
        sortArray(numbers);
        sortArray(strings);
        System.out.println("After:");
        printArray(numbers);
        printArray(strings);
    }

    private static void sortArray(String... array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareToIgnoreCase(array[i]) < 0) {
                    String tempString = array[i];
                    array[i] = array[j];
                    array[j] = tempString;
                }
            }
        }
    }
    private static void sortArray(Integer... array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    Integer tempInt = array[i];
                    array[i] = array[j];
                    array[j] = tempInt;
                }
            }
        }
    }
    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }
}


