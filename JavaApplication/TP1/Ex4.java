package TP1;

import java.util.*;

public class Ex4 {
    static void tabMult(int n) {
        System.out.println("table de multiplication de " + n);

        for (int i = 0; i < 11; i++) {
            System.out.format("%d x %d= %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n= ");
        int n = scanner.nextInt();

        tabMult(n);

        scanner.close();
    }
}