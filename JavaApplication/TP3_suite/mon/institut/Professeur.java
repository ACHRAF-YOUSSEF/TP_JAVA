package TP3_suite.mon.institut;

public class Professeur {
    private static int id = 0;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private Spécialité spécialité;

    public Professeur(String nom, String prenom, String telephone, String email, Spécialité spécialité) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.spécialité = spécialité;

        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Professeur.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Spécialité getSpécialité() {
        return spécialité;
    }

    public void setSpécialité(Spécialité spécialité) {
        this.spécialité = spécialité;
    }

    public void ToString() {
        System.out.println("-nom = " + nom.toUpperCase() + " prenom = " + prenom.substring(0, 1).toUpperCase()
                + prenom.substring(1) + " email = " + email);
    }
}
