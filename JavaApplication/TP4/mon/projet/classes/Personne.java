package TP4.mon.projet.classes;

public class Personne {
    protected static int id = 0;
    protected String nom;
    protected String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        id++;
    }

    public String toString() {
        return "Je suis " + nom + " " + prenom;
    }
}