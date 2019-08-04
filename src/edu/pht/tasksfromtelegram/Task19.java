package edu.pht.tasksfromtelegram;

public class Task19 {
    public static void main(String[] args) {
        int n = 5, m = 7;
        int[][] matrixFirst = new int[n][m];
        int[][] matrixSecond = new int[n][m];
        fillMatrix(matrixFirst);
        fillMatrix(matrixSecond);
        printMatrix(matrixFirst);
        printMatrix(matrixSecond);
        printMatrix(addMatrix(matrixFirst, matrixSecond));
    }
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    private static void fillMatrix(int[][] matrix) {
        int max = 100;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * ++max);
            }
        }
    }
    private static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
