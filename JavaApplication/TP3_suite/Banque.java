package TP3_suite;

public class Banque {
    public static void main(String[] args) {
        Compte c1 = new Compte(0, "achraf", 0);
        Compte c2 = new Compte(1, "amine", 30);

        c1.déposer(300.0);

        System.out.println(c1.toString());

        c2.déposer(200.0);

        System.out.println(c2.toString());

        c1.retirer(100.0);

        System.out.println(c1.toString());

        c2.transferer(80.0, c1);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c2.retirer(70.0);
        System.out.println(c2.toString());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}