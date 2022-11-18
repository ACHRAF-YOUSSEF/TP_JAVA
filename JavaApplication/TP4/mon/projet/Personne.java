package TP4.mon.projet;

public abstract class Personne {
    protected static int id = 0;
    protected String nom;
    protected String prenom;
    protected String mail;
    protected String telephone;
    protected double salaire;

    public Personne(String nom, String prenom, String mail, String telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
        id++;
    }

    public abstract double calculerSalaire();
}
