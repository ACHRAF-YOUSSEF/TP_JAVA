package TP4.mon.projet.test;

import TP4.mon.projet.classes.*;

public class Application {
    public static void main(String[] args) {
        Employe e1 = new Employe("DOUK", "Rachid ", 1000.0);
        Employe e2 = new Employe("BNE SALEH", "Ali ", 855.0);

        Etudiant et1 = new Etudiant("FRAJ", "Med", "65678754");
        Etudiant et2 = new Etudiant("AMEUR", "Meriem", "87543543");

        Professeur p1 = new Professeur("ALAOUI", "Haythem", 2700.0, "JAVA/JEE");
        Professeur p2 = new Professeur("BEN CHEICK", "Hana", 3200.0, "Mathématique");

        System.out.println("La liste des employés :");
        System.out.println(e1.toString());
        System.out.println(e2.toString());

        System.out.println("La liste des étudiants :");
        System.out.println(et1.toString());
        System.out.println(et2.toString());

        System.out.println("La liste des professeurs :");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}