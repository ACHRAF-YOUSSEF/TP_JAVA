package TD2;

public class EtudiantMaster extends Etudiant {
    private String specialite;

    public EtudiantMaster(String nom, String adresse, int numero, String specialite) {
        super(nom, adresse, numero);
        this.specialite = specialite;
    }

    public void afficher() {
        super.afficher();
        System.out.println("specialite: " + specialite);
    }

    public void afficherProfil() {
        System.out.println("Etudiants en Master ");
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
