package edu.htp.tasksfromtelegram;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        fill(array);
        print(array);
        System.out.println(average(array));
    }
    private static void fill(int[] array) {
        int max = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ++max);
        }
    }
    private static void print(int[] array) {
        for (int i : array) {
            System.out.println(" " + i);
        }
    }
    private static double average(int[] array) {
        double avg = 0;
        for (int i : array) {
            avg += i;
        }
        return avg / array.length;
    }
}