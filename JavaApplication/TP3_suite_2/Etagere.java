package TP3_suite_2;

import java.util.Arrays;

public class Etagere {
    private final static int taille = 20;
    private int nbLivres;
    private Livre[] tabLivres;

    public Etagere() {
        tabLivres = new Livre[taille];
        nbLivres = 0;
    }

    public int getNbLivres() {
        return nbLivres;
    }

    public void ajouter(Livre l) {
        if (nbLivres == taille) {
            System.out.println("L'etagère est déja pleine");
        } else {
            tabLivres[nbLivres] = l;
            nbLivres++;
        }
    }

    public int[] chercherLivres(String titre, String auteur) {
        int nbP = 0;
        int[] livre_0 = new int[20];

        for (int i = 0; i < nbLivres; i++) {
            if ((titre.equals(tabLivres[i].getTitre())) && (auteur.equals(tabLivres[i].getAuteur()))) {
                livre_0[nbP] = i + 1;
                nbP++;
            }
        }

        int[] livre = new int[nbP];

        System.arraycopy(livre_0, 0, livre, 0, nbP);

        return livre;
    }

    public Livre[] chercherAuteur(String auteur) {
        int nbP = 0;
        Livre[] livre_0 = new Livre[20];

        for (int i = 0; i < nbLivres; i++) {
            if (auteur.equals(tabLivres[i].getAuteur())) {
                livre_0[nbP] = tabLivres[i];
                nbP++;
            }
        }

        Livre[] livre = new Livre[nbP];

        System.arraycopy(livre_0, 0, livre, 0, nbP);

        return livre;
    }

    public int chercher(String titre, String auteur) {
        for (int i = 0; i < nbLivres; i++) {
            if ((titre.equals(tabLivres[i].getTitre())) && (auteur.equals(tabLivres[i].getAuteur()))) {
                return i + 1;
            }
        }

        return 0;
    }

    public Livre getLivre(int p) {
        if (p != 0) {
            return tabLivres[p - 1];
        } else {
            return null;
        }
    }

    public String toString() {
        return Arrays.toString(tabLivres);
    }

    public static void main(String[] args) {
        Livre l1 = new Livre("a1", "t1");
        l1.setNbPages(200);
        l1.setPrix(239.50);

        Livre l2 = new Livre("a2", "t2");
        l2.setNbPages(250);
        l2.setPrix(140);

        Livre l3 = new Livre("a3", "t3");
        l1.setNbPages(300);
        l1.setPrix(159.50);

        Livre l4 = new Livre("a1", "t4");
        Livre l5 = new Livre("a1", "t1");
        Livre l6 = new Livre("a2", "t5");

        Etagere etagere1 = new Etagere();
        Etagere etagere2 = new Etagere();

        etagere1.ajouter(l1);
        etagere1.ajouter(l2);
        etagere1.ajouter(l3);
        etagere2.ajouter(l1);
        etagere2.ajouter(l4);
        etagere2.ajouter(l5);

        System.out.println(etagere1);
        System.out.println(etagere2);

        // Recherche (vous pouvez passer l'auteur et le titre en paramÃ¨tre de la
        // commande java)
        String auteur, titre;

        // if (args.length == 2) {
        // auteur = args[0];
        // titre = args[1];
        // } else {
        // auteur = "a1";
        // titre = "t2";
        // }

        auteur = "a1";
        titre = "t1";

        int position = etagere1.chercher(titre, auteur);

        if (position != 0) {
            System.out.println("Livre d'auteur " + auteur
                    + " et de titre " + titre + " trouvée"
                    + " en position " + position + " sur l'étagère");
            System.out.println("Vérification ; le livre est : " + "\n"
                    + etagere1.getLivre(position));
            System.out.println("L'étagère avant d'avoir enlevée ce livre : \n"
                    + etagere1);
            // DÃ©commenter si vous avez Ã©crit la suppression d'un livre
            /*
             * Livre livreEnleve = etagere1.enlever(titre, auteur);
             * System.out.println("L'Ã©tagÃ¨re aprÃ¨s avoir enlevÃ© ce livre : \n"
             * + etagere1);
             * System.out.println("Pour vÃ©rification :\n"
             * + "Le livre enlevÃ© est :\n"
             * + livreEnleve);
             */
        } else {
            System.out.println("Livre d'auteur " + auteur
                    + " et de titre " + titre + " pas trouvée");
        }

        System.out.println("tab de position de [" + auteur + "|" + titre + "] sur l'etagere 1 = "
                + Arrays.toString(etagere1.chercherLivres(titre, auteur)));
        System.out.println("tab de position de [" + auteur + "|" + titre + "] sur l'etagere 2 = "
                + Arrays.toString(etagere2.chercherLivres(titre, auteur)));

        System.out.println(Arrays.toString(etagere1.chercherAuteur(auteur)));
        System.out.println(Arrays.toString(etagere2.chercherAuteur(auteur)));
    }
}