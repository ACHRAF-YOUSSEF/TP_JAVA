package TP2;

import java.util.Scanner;

public class Ex2 {
    static boolean isPair(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n= ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println(n + " est negative");
        } else {
            if (n > 0) {
                System.out.println(n + " est positive");
            } else {
                System.out.println(n + " est égale à 0");
            }
        }

        if (isPair(n)) {
            System.out.println(n + "est pair");
        } else {
            System.out.println(n + " est impair");
        }

        sc.close();
    }
}