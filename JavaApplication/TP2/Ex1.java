package TP2;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x= ");
        double x = scanner.nextDouble();

        System.out.println("La racine carré de " + x + " est " + Math.sqrt(x));

        scanner.close();
    }
}