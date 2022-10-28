package TP2;

import java.util.Scanner;

public class Ex8 {
    static boolean estPremier(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x= ");
        int x = scanner.nextInt();

        if (estPremier(x)) {
            System.out.println(x + " est premier");
        } else {
            System.out.println(x + " n'est pas premier");
        }

        scanner.close();
    }
}