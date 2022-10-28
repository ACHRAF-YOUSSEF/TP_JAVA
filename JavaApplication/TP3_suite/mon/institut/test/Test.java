package TP3_suite.mon.institut.test;

import TP3_suite.mon.institut.Professeur;
import TP3_suite.mon.institut.Spécialité;

public class Test {
    public static void main(String[] args) {
        Spécialité[] tabDesSpécialités = new Spécialité[5];
        Professeur[] tabDesProfesseurs = new Professeur[4];

        Spécialité spécialité1 = new Spécialité("1", "JAVA/JEE");
        Spécialité spécialité2 = new Spécialité("2", ".net");
        Spécialité spécialité3 = new Spécialité("3", "Gestion de projet");
        Spécialité spécialité4 = new Spécialité("4", "CISCO");
        Spécialité spécialité5 = new Spécialité("5", "PHP");

        tabDesSpécialités[0] = spécialité1;
        tabDesSpécialités[1] = spécialité2;
        tabDesSpécialités[2] = spécialité3;
        tabDesSpécialités[3] = spécialité4;
        tabDesSpécialités[4] = spécialité5;

        Professeur professeur1 = new Professeur("SAFI", "Amal", "", "safi@gmail.com", spécialité1);
        Professeur professeur2 = new Professeur("ALAMI", "Said", "", "alami@yahoo.fr", spécialité1);
        Professeur professeur3 = new Professeur("ALAOUI", "Reda", "", "alaoui@yahoo.fr", spécialité4);
        Professeur professeur4 = new Professeur("KAMALI", "Imane", "", "i.Kamali@gmail.com", spécialité4);

        tabDesProfesseurs[0] = professeur1;
        tabDesProfesseurs[1] = professeur2;
        tabDesProfesseurs[2] = professeur3;
        tabDesProfesseurs[3] = professeur4;

        boolean b;

        System.out.println("Professeur par spécialité :");
        for (int i = 0; i < tabDesSpécialités.length; i++) {
            tabDesSpécialités[i].ToString();
            b = false;

            for (int j = 0; j < tabDesProfesseurs.length; j++) {
                if (tabDesProfesseurs[j].getSpécialité().getLibelle().equals(tabDesSpécialités[i].getLibelle())) {
                    tabDesProfesseurs[j].ToString();
                    b = true;
                }
            }

            if (!b) {
                System.out.println("Aucun Professeur dans cette spécialité ");
            }
        }
    }
}