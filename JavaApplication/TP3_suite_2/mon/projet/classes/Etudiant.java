package TP3_suite_2.mon.projet.classes;

public class Etudiant extends Personne {
    private String cne;

    public Etudiant(String nom, String prenom, String cne) {
        super(nom, prenom);
        this.cne = cne;
    }

    public String toString() {
        return "Je suis " + nom + " " + prenom + " mon CNE est: " + cne;
    }
}