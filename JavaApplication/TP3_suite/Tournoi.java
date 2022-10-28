package TP3_suite;

public class Tournoi {
    public static void main(String[] args) {
        Equipe equipe1 = new Equipe("ESS", 0, 0);
        Equipe equipe2 = new Equipe("CA", 0, 0);
        Equipe equipe3 = new Equipe("EST", 0, 0);

        equipe1.Gagner();
        equipe2.Perdre();

        equipe2.Null();
        equipe1.Null();

        equipe3.Perdre();
        equipe1.Gagner();

        System.out.println(equipe1.toString());
        System.out.println(equipe2.toString());
        System.out.println(equipe3.toString());
    }
}