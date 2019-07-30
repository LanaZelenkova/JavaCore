package edu.pht.lessonjavastart;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        double[] array = new double[] {1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0, 99};
        System.out.println(Arrays.toString(divByMaxEachElement(array, findMax(array))));
        System.out.println(printArray(divByMaxEachElement(array, findMax(array))));
    }

    private static double findMax(double[] array) {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return  max;
    }

    private static double[] divByMaxEachElement(double[] array, double max) {
        for (int i = 0; i < array.length; i++) {
            array[i] /= max;
        }
        return array;
    }

    private static String printArray(double[] array) {
        String result = "";
        for (double d : array) {
            result += String.format(" %.2f" , d);
        }
        return result;
    }
}
