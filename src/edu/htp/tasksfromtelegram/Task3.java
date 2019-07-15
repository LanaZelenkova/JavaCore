package edu.htp.tasksfromtelegram;

public class Task3 {
    public static void main(String[] args) {
        final int n = 40;
        draw(n, " *  ", "  * ");

    }
    private static void draw(int n, String sFirst, String sLast) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(sFirst);
                } else {
                    System.out.print(sLast);
                }
            }
            if (i % 2 == 0) {
                System.out.println("\n");
            } else {
                System.out.println();
            }
        }
    }
}
