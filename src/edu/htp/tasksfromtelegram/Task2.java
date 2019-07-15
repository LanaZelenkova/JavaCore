package edu.htp.tasksfromtelegram;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(array);
        print(addAll(array));
    }
    private static int addAll(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }
    private static void print(int... array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
