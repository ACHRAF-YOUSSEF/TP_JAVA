package TP2_suite;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("base= ");
        double base = sc.nextDouble();

        System.out.print("hauteur= ");
        double hauteur = sc.nextDouble();

        double surface = (base * hauteur) / 2;

        System.out.println("Surface = " + surface);

        sc.close();
    }
}