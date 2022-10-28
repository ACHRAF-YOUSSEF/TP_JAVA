package TP1;

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a= ");
        int a = scanner.nextInt();

        System.out.print("b= ");
        int b = scanner.nextInt();

        System.out.format("Avant l'échange: a= %d, b= %d", a, b);

        int temp = a;
        a = b;
        b = temp;

        System.out.format("\nAprés l'échange: a= %d, b= %d", a, b);

        scanner.close();
    }
}