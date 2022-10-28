package TP3_suite;

public class Equipe {
    private String nom;
    private int rang;
    private int nbPoint;
    private int nbMatchs;

    public Equipe(String nom, int nbPoint, int nbMatchs) {
        this.nom = nom;
        this.nbPoint = nbPoint;
        this.nbMatchs = nbMatchs;
        rang = 1;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public int getNbPoint() {
        return nbPoint;
    }

    public void setNbPoint(int nbPoint) {
        this.nbPoint = nbPoint;
    }

    public int getNbMatchs() {
        return nbMatchs;
    }

    public void setNbMatchs(int nbMatchs) {
        this.nbMatchs = nbMatchs;
    }

    public void Gagner() {
        nbPoint += 3;
        nbMatchs += 1;
        rang++;
    }

    public void Null() {
        nbPoint += 1;
        nbMatchs += 1;
    }

    public void Perdre() {
        rang--;
        nbMatchs += 1;
    }

    @Override
    public String toString() {
        return "Equipe [nom=" + nom + ", rang=" + rang + ", nbPoint=" + nbPoint + ", nbMatchs=" + nbMatchs + "]";
    }
}