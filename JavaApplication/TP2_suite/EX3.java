package TP2_suite;

import java.util.*;

public class EX3 {
    static void affiche(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " | ");
        }
    }

    static int[] reverse(int[] tab) {
        int[] tab_rev = new int[tab.length];

        for (int i = tab_rev.length - 1, j = 0; i > -1 && j < tab_rev.length; i--, j++) {
            tab_rev[j] = tab[i];
        }

        return tab_rev;
    }

    public static void main(String[] args) {
        int[] l = { 2, 15, 45, 62, 6, 5, 4 };

        System.out.println("avant invertion");
        Arrays.sort(l);
        affiche(l);

        System.out.println("\naprés invertion");
        l = reverse(l);
        affiche(l);

        // System.out.println("\ntab = " + Arrays.toString(l));
    }
}