package TP4.mon.projet;

import TP4.mon.projet.bean.*;

public class EX2 {
    public static void main(String[] args) {
        Manager manager = new Manager("LACHAR", "Mohamed", "", "", 3000, "Informatique");

        manager.afficher();

        Developpeur developpeur = new Developpeur("SALIM", "Karim", "", "", 1000, "PHP");

        System.out.println(developpeur.afficher());

        // Personne personne = new Personne("YOUSSEF", "Achraf", "", "", 1500);
        // on ne peut pas instancier un objet à partir d'une classe abstraite
    }
}
