package TD2;

public class EtudiantDoctorat extends Etudiant {
    public EtudiantDoctorat(String nom, String adresse, int numero) {
        super(nom, adresse, numero);
    }

    @Override
    public void afficher() {
        super.afficher();
    }

    @Override
    public void afficherProfil() {
        System.out.println("Etudiants en Doctorat ");
    }
}
