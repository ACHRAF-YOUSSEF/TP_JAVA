package TD2;

public class EtudiantLicence extends Etudiant {
    private String parcours;

    public EtudiantLicence(String nom, String adresse, int numero, String parcours) {
        super(nom, adresse, numero);
        this.parcours = parcours;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("parcours: " + parcours);
    }

    @Override
    public void afficherProfil() {
        System.out.println("Etudiants en Licence ");
    }

    public String getParcours() {
        return parcours;
    }

    public void setParcours(String parcours) {
        this.parcours = parcours;
    }
}
