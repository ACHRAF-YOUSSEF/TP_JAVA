package TP3.mon.projet.classes;

import java.util.Date;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Filiere filiere;
    private static int count;

    public Etudiant(String nom, String prenom, Date date, Filiere filiere) {
        this.nom = nom;
        this.prenom = prenom;
        dateNaissance = date;
        this.filiere = filiere;

        id = count + 1;
    }

    public String toString() {
        return "Je suis l'étudiant " + nom + " " + prenom + " ma date de naissance est :" + dateNaissance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Etudiant.count = count;
    }

    public Filiere getFiliere() {
        return filiere;
    }
}