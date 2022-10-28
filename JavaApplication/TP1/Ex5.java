package TP1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le premier nombre: ");
        int n1 = scanner.nextInt();

        System.out.print("Entrer le deuxième nombre: ");
        int n2 = scanner.nextInt();

        System.out.print("Entrer le troisième nombre: ");
        int n3 = scanner.nextInt();

        System.out.format("La moyenne est %d", (n1 + n2 + n3) / 3);

        scanner.close();
    }
}