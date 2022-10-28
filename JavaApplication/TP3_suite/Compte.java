package TP3_suite;

public class Compte {
    private int numCompte;
    private String propriétaire;
    private double solde;
    private int numOpération;

    public Compte(int numCompte, String propriétaire, double solde) {
        this.numCompte = numCompte;
        this.propriétaire = propriétaire;

        if (solde >= 0) {
            this.solde = solde;
        }

        this.numOpération = 0;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public String getPropriétaire() {
        return propriétaire;
    }

    public void setPropriétaire(String propriétaire) {
        this.propriétaire = propriétaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getNumOpération() {
        return numOpération;
    }

    public void setNumOpération(int numOpération) {
        this.numOpération = numOpération;
    }

    public void déposer(Double montant) {
        if (montant > 0) {
            solde += montant;
            numOpération++;
        }
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            numOpération++;
        } else {
            System.out.println("Votre solde est insuffisant");
        }
    }

    public void transferer(double montant, Compte compte) {
        this.retirer(montant);
        compte.déposer(montant);
    }

    @Override
    public String toString() {
        return "Compte [numCompte=" + numCompte + ", propriétaire=" + propriétaire + ", solde=" + solde
                + ", numOpération=" + numOpération + "]";
    }

}