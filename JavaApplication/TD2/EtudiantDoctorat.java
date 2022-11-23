package TD2;

public class EtudiantDoctorat extends Etudiant {
    private String directeurDeRecherche;

    public EtudiantDoctorat(String nom, String adresse, int numero, String directeurDeRecherche) {
        super(nom, adresse, numero);
        this.directeurDeRecherche = directeurDeRecherche;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("directeur de recherche:" + directeurDeRecherche);
    }

    @Override
    public void afficherProfil() {
        System.out.println("Etudiants en Doctorat ");
    }

    public String getDirecteurDeRecherche() {
        return directeurDeRecherche;
    }

    public void setDirecteurDeRecherche(String directeurDeRecherche) {
        this.directeurDeRecherche = directeurDeRecherche;
    }
}
