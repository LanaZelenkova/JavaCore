package edu.pht.lessonjavastart;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int number = inputNumber();
        System.out.println("Is your number a palindrome? " + isPalindrome(number));
    }
    private static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a positive number: ");
            while (!sc.hasNextDouble()) {
                System.out.println("This is not a number!");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        return number;
    }
    private static boolean isPalindrome(int number) {
        int count = 0;
        int data = number;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = data % 10;
            data = data / 10;
        }
        int middleElement = count / 2;
        if (count % 2 == 0) {
            for (int i = middleElement, j = middleElement - 1; i < count; i++, j--) {
                if (numbers[i] !=  numbers[j]) {
                    return false;
                }
            }
        }
        if (count % 2 != 0) {
            for (int i = middleElement + 1, j = middleElement - 1; i < count; i++, j--) {
                if (numbers[i] !=  numbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
