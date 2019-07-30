package edu.pht.lessonjavastart;

public class Task9 {
    public static void main(String[] args) {
        int numberOne = 1;
        int numberTwo = 2;
        int temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;
        System.out.println("numberOne " + numberOne + ", numberTwo " + numberTwo);
    }
}
