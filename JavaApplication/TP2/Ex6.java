package TP2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        String prenom, nom;
        int age;
        double taille, poids;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine();

        System.out.println("Quel est votre nom ?");
        nom = sc.nextLine();

        System.out.println("Quel age avez vous ?");
        age = sc.nextInt();

        System.out.println("Quel est votre taille (en mètres) ?");
        taille = sc.nextDouble();

        System.out.println("Quel est votre poids (en kg) ?");
        poids = sc.nextDouble();

        System.out.println("Bonjour ! Vous vous applelez " + prenom + " " + nom + " et vous avez " + age + " ans.");
        System.out.println("Votre taille est " + taille + "m et votre poids est " + poids + "kg.");

        sc.close();
    }
}