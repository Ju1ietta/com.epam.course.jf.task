package task05;

import java.util.Scanner;

/**
 * Created by Julia on 26.02.2016.
 */
public final class Task05 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите размерность матрицы m*n: ");
            Scanner in = new Scanner(System.in);
            int m = in.nextInt();
            int n = in.nextInt();
            int[][] matrix = new int[m][n];
            createMatrix(m,n,matrix);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введите размерность матрицы в виде натуральных чисел");
        }
    }
    /**
     * Create matrix
     * @param m
     * @param n
     * @param matrix
     */
    public static void createMatrix(int m, int n, int[][] matrix){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ((i == j || n - i == j + 1) ? 1 : 0);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
