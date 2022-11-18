package TP4.mon.projet.bean;

import TP4.mon.projet.Personne;

public class Manager extends Personne {
    private String service;

    public Manager(String nom, String prenom, String mail, String telephone, double salaire, String service) {
        super(nom, prenom, mail, telephone, salaire);
        this.service = service;
    }

    public double calculerSalaire() {
        return salaire + (35 * salaire) / 100;
    }

    public void afficher() {
        System.out.println("Le salaire du manager " + nom + " " + prenom + " est: " + calculerSalaire()
                + " dt, son service:" + service);
    }

}
