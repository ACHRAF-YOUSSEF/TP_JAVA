package TP3_suite_2.mon.projet.classes;

public class Employe extends Personne {
    protected double salaire;

    public Employe(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public String toString() {
        return "Je suis " + nom + " " + prenom + " mon salaire est: " + salaire + "DT";
    }
}