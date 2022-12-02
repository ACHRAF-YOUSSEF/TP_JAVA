package TP5.Ex2;

public class Article implements Exportable {
    private int code;
    protected String nom;
    protected double prixHT;
    private static int id;

    public Article(String nom, double prixHT) {
        this.nom = nom;
        this.prixHT = prixHT;
        code = ++id;
    }

    public double prixTransport() {
        return 0.05 * prixHT;
    }

    public String toString() {
        return getCode() + " " + nom;
    }

    public int getCode() {
        return code;
    }

    public double droitDouans() {
        return 0.18 * prixHT;
    }

    public String paysDestination() {
        return "France";
    }
}
