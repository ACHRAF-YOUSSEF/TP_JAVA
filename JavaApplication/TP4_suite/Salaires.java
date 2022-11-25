package TP4_suite;

import java.util.*;

abstract class Employe {
    protected String nom;
    protected String prenom;
    protected int age;
    protected String date;

    public Employe(String nom, String prenom, int age, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }

    public abstract double CalculerSalaire();

    public String getNom() {
        return "L'employé " + nom + prenom;
    }

    public String toString() {
        return " gagne " + CalculerSalaire() + " euros.";
    }
}

class Commercial extends Employe {
    protected double chiffre_affaire;

    public Commercial(String nom, String prenom, int age, String date, double chiffre_affaire) {
        super(nom, prenom, age, date);
        this.chiffre_affaire = chiffre_affaire;
    }

    public String getNom() {
        return "Commercial " + nom + prenom;
    }

    public double CalculerSalaire() {
        return 0;
    }

    public double getChiffre_affaire() {
        return chiffre_affaire;
    }
}

class Vendeur extends Commercial {
    public Vendeur(String nom, String prenom, int age, String date, double chiffre_affaire) {
        super(nom, prenom, age, date, chiffre_affaire);
    }

    public String getNom() {
        return "Le vendeur " + nom + prenom;
    }

    public double CalculerSalaire() {
        return getChiffre_affaire() * 0.2 + 400;
    }
}

class Representant extends Commercial {
    public Representant(String nom, String prenom, int age, String date, double chiffre_affaire) {
        super(nom, prenom, age, date, chiffre_affaire);
    }

    public String getNom() {
        return "Le representant " + nom + prenom;
    }

    public double CalculerSalaire() {
        return getChiffre_affaire() * 0.2 + 800;
    }
}

class Maintantionnaire extends Employe {
    protected double nbHeure;

    public Maintantionnaire(String nom, String prenom, int age, String date, double nbHeure) {
        super(nom, prenom, age, date);
        this.nbHeure = nbHeure;
    }

    public String getNom() {
        return "Le maintantionnaire " + nom + prenom;
    }

    public double CalculerSalaire() {
        return nbHeure * 65;
    }
}

class Technicien extends Employe {
    protected int nbUnites;

    public Technicien(String nom, String prenom, int age, String date, int nbUnites) {
        super(nom, prenom, age, date);
        this.nbUnites = nbUnites;
    }

    public String getNom() {
        return "Le technicien " + nom + prenom;
    }

    public double CalculerSalaire() {
        return (double) (nbUnites * 5);
    }
}

class TechnicienArisque extends Technicien implements Arisque {
    public TechnicienArisque(String nom, String prenom, int age, String date, int nbUnites) {
        super(nom, prenom, age, date, nbUnites);
    }

    public String getNom() {
        return "Le technicien a risque " + nom + prenom;
    }

    public double CalculerSalaire() {
        return super.CalculerSalaire() + primeRisque;
    }
}

class MaintantionnaireArisque extends Maintantionnaire implements Arisque {
    public MaintantionnaireArisque(String nom, String prenom, int age, String date, double nbHeure) {
        super(nom, prenom, age, date, nbHeure);
    }

    public String getNom() {
        return "Le maintantionnaire a risque " + nom + prenom;
    }

    public double CalculerSalaire() {
        return super.CalculerSalaire() + primeRisque;
    }
}

interface Arisque {
    final int primeRisque = 200;
}

class Personnel {
    private ArrayList<Employe> arrayListEmployes;

    public Personnel() {
        arrayListEmployes = new ArrayList<Employe>();
    }

    public void ajouterEmploye(Employe e) {
        arrayListEmployes.add(e);
    }

    public void afficherSalaires() {
        for (int i = 0; i < arrayListEmployes.size(); i++) {
            System.out.println(arrayListEmployes.get(i).getNom() + arrayListEmployes.get(i).toString());
        }
    }

    public double sailaireMoyen() {
        double sum = 0;
        int taille = arrayListEmployes.size();

        for (int i = 0; i < taille; i++) {
            sum += arrayListEmployes.get(i).CalculerSalaire();
        }

        return sum / taille;
    }
}

public class Salaires {
    public static void main(String[] args) {
        Personnel p = new Personnel();

        p.ajouterEmploye(new Vendeur("Pierre", "Buiness", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
        p.ajouterEmploye(new Maintantionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnicienArisque("Jean", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new MaintantionnaireArisque("Al", "Abordage", 30, "2001", 45));

        p.afficherSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est de " + p.sailaireMoyen() + " euros.");
    }
}
