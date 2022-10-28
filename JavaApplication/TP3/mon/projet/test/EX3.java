package TP3.mon.projet.test;

import java.util.ArrayList;
import java.util.Date;

import TP3.mon.projet.classes.Etudiant;
import TP3.mon.projet.classes.Filiere;

public class EX3 {
    public static void main(String[] args) {
        Filiere filiere1 = new Filiere("4561", "Informatique & Multimédia");
        Filiere filiere2 = new Filiere("0120", "Télécommunication");
        Filiere filiere3 = new Filiere("7854", "SYSTEMES EMBARQUE & IOT");

        Etudiant etudiant1 = new Etudiant("Rashid", "Mohamed", new Date("1995/01/02"), filiere1);
        Etudiant etudiant2 = new Etudiant("Yves", "Chakib", new Date("1992/04/02"), filiere2);
        Etudiant etudiant3 = new Etudiant("Alaoui", "Manal", new Date("2011/03/02"), filiere2);
        Etudiant etudiant4 = new Etudiant("Safi", "Meriem", new Date("2000/11/02"), filiere1);
        Etudiant etudiant5 = new Etudiant("Rami", "Mouad", new Date("2013/01/02"), filiere3);

        ArrayList<Filiere> fArrayList = new ArrayList<Filiere>();
        ArrayList<Etudiant> eArrayList = new ArrayList<Etudiant>();

        fArrayList.add(filiere1);
        fArrayList.add(filiere2);
        fArrayList.add(filiere3);

        eArrayList.add(etudiant1);
        eArrayList.add(etudiant2);
        eArrayList.add(etudiant3);
        eArrayList.add(etudiant4);
        eArrayList.add(etudiant5);

        System.out.println("La liste des filières de notre école :");
        for (int i = 0; i < fArrayList.size(); i++) {
            System.out.println(fArrayList.get(i).toString());
        }

        System.out.println("Liste des étudiants par filière :");
        for (int i = 0; i < fArrayList.size(); i++) {
            Filiere filiere = fArrayList.get(i);
            System.out.println(filiere.toString());

            for (int j = 0; j < eArrayList.size(); j++) {
                Etudiant etudiant = eArrayList.get(j);
                if (etudiant.getFiliere().getLibelle().equals(filiere.getLibelle())) {
                    System.out.println(etudiant.toString());
                }
            }
        }
    }
}