package TP1;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("c= ");
        // char c = scanner.nextLine().charAt(0);

        char c = 'B';
        System.out.format("La valeur ASCII de %c est %d", c, (int) c);

        scanner.close();
    }
}