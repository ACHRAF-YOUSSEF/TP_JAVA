package TP2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double rayon;

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le rayon du cercle: ");
        rayon = sc.nextDouble();

        Double surface = Math.PI * rayon * rayon;

        System.out.println("La surface du cercle est : " + surface);

        sc.close();
    }
}