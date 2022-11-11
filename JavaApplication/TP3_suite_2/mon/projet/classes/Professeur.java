package TP3_suite_2.mon.projet.classes;

public class Professeur extends Employe {
    private String specialite;

    public Professeur(String nom, String prenom, double salaire, String specialite) {
        super(nom, prenom, salaire);
        this.specialite = specialite;
    }

    public String toString() {
        return "Je suis " + nom + " " + prenom + " mon salaire est: " + salaire + " DT ma spécialité est: "
                + specialite;
    }
}
