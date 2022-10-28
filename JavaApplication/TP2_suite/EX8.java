package TP2_suite;

import java.util.Scanner;

public class EX8 {
    static int factoriel(int N) {
        int f = 1;

        for (int i = 1; i < N + 1; i++) {
            f *= i;
        }

        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n= ");
        int n = sc.nextInt();

        System.out.println("factoriel(" + n + ")= " + factoriel(n));

        sc.close();
    }
}