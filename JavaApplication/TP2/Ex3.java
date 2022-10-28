package TP2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // int[] tab = { 1, 2, 5, 4, 1, 6, 5, 1, 1 };
        int[] tab1 = new int[4];
        int occ = 0, n;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tab1.length; i++) {
            System.out.print("tab1[" + (i + 1) + "]= ");
            tab1[i] = sc.nextInt();
        }

        System.out.print("n= ");
        n = sc.nextInt();

        for (int i = 0; i < tab1.length; i++) {
            if (n == tab1[i]) {
                occ++;
            }
        }

        System.out.println("le nombre d'occurence de " + n + " est égale à " + occ);

        sc.close();
    }
}