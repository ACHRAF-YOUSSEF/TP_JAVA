package TP1;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n1= ");
        int n1 = scanner.nextInt();

        System.out.print("n2= ");
        int n2 = scanner.nextInt();

        System.out.format("La somme de %d et %d est %d", n1, n2, n1 + n2);

        scanner.close();
    }
}