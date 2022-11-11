package TP3_suite_2;

public class Livre {
    private String titre, auteur;
    private int nbPages;
    private double prix;

    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    public double getPrix() {
        return prix;
    }

    public void setAuteur(String unAuteur) {
        auteur = unAuteur;
    }

    public void setTitre(String unTitre) {
        titre = unTitre;
    }

    public void setNbPages(int n) {
        if (n > 0) {
            nbPages = n;
        } else {
            System.err.println("Erreur : nombre de pages négatif !");
        }
    }

    public void setPrix(double unPrix) {
        if (unPrix >= 0.0) {
            prix = unPrix;
        } else {
            System.err.println("Erreur : prix négatif !");
        }
    }

    public String toString() {
        return "Livre{titre " + titre + ", auteur "
                + auteur + ", nb pages " + nbPages + ", prix "
                + prix + "}";
    }
}