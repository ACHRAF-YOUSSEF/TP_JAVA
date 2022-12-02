package TP5.Ex2;

public class Fragile extends Article {
    private String emballage;

    public Fragile(String nom, double prixHT) {
        super(nom, prixHT);
    }

    public Fragile(String nom, double prixHT, String emballage) {
        super(nom, prixHT);
        this.emballage = emballage;
    }

    public double prixTransport() {
        return super.prixTransport() * 2.0;
    }

    public String toString() {
        return (emballage != null) ? super.toString().substring(7) + ", emballage = " + emballage : super.toString();
    }
}
