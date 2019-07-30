package edu.pht.lessonjavastart;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int bigger = first > second ? first : second;
        int biggest = bigger > third ? bigger : third;
        System.out.println("The biggest number is " + biggest);
    }
}
