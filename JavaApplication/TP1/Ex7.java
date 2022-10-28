package TP1;

import java.util.*;;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x= ");
        int x = scanner.nextInt();

        System.out.println("La racine carré de " + x + " est " + Math.sqrt(x));

        scanner.close();
    }
}