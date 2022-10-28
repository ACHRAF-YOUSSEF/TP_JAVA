package TP2_suite;

import java.util.Arrays;

public class EX4 {
    static int[][] trasposee(int[][] A) {
        int[][] B = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[j][i] = A[i][j];
            }
        }

        return B;
    }

    static void afficheMat(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(A[i]));
        }
    }

    public static void main(String[] args) {
        int[][] matrice = { { 1, 5, 6 }, { 8, 5, 4 } };

        afficheMat(matrice);

        System.out.println();

        afficheMat(trasposee(matrice));
    }
}