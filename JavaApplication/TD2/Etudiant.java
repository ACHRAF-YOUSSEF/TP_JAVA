package TD2;

public abstract class Etudiant {
    private String nom;
    private String adresse;
    private int numero;

    public Etudiant(String nom, String adresse, int numero) {
        this.nom = nom;
        this.adresse = adresse;
        this.numero = numero;
    }

    public abstract void afficherProfil();

    public void afficher() {
        System.out.println("Nom: " + nom + "\nAdresse: " + adresse + "\nNuméro: " + numero);
    }

    public void afficher(boolean compact) {
        if (compact = false) {
            afficher();
        } else {
            System.out.println("[" + nom + "," + adresse + "," + numero + "]");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
