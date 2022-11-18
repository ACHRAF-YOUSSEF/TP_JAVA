package TP4.mon.projet.bean;

import TP4.mon.projet.Personne;

public class Developpeur extends Personne {
    private String specialite;

    public Developpeur(String nom, String prenom, String mail, String telephone, double salaire, String specialite) {
        super(nom, prenom, mail, telephone, salaire);
        this.specialite = specialite;
    }

    public double calculerSalaire() {
        return salaire + (20 * salaire) / 100;
    }

    public String afficher() {
        return "Le salaire du développeur " + nom + " " + prenom + " est: " + calculerSalaire() + " dt, sa spécialité:"
                + specialite;
    }

}
