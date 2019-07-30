package edu.pht.lessonjavastart;

public class Task15 {
    public static void main(String[] args) {
        System.out.println(goFor());
        System.out.println(goWhile());
        System.out.println(goDoWhile());
    }
    private static String goFor() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100 ; i++) {
            sb.append(i + " ");
        }
        return  sb.toString();
    }
    private static String goWhile() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i <= 100) {
            sb.append(i + " ");
            i++;
        }
        return  sb.toString();
    }
    private static String goDoWhile() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        do {
            sb.append(i + " ");
            i++;
        } while (i <= 100);
        return  sb.toString();
    }
}
