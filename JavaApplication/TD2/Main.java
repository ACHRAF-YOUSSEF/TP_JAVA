package TD2;

public class Main {
    public static void main(String[] args) {
        EtudiantDoctorat etudiant1 = new EtudiantDoctorat("achraf youssef", "sousse", 1, "");
        EtudiantMaster etudiant2 = new EtudiantMaster("amine hattab", "sousse", 5, "");
        EtudiantLicence etudiant3 = new EtudiantLicence("islam rabhi", "sousse", 6, "info");

        System.out.println("les etudiants:\n");
        etudiant1.afficherProfil();
        etudiant1.afficher();

        System.out.println();

        etudiant2.afficherProfil();
        etudiant2.afficher();

        System.out.println();

        etudiant3.afficherProfil();
        etudiant3.afficher();
    }
}
