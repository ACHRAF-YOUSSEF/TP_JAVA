package TP3_suite.mon.institut;

public class Spécialité {
    private static int id = 0;
    private String code;
    private String libelle;

    public Spécialité(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;

        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Spécialité.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void ToString() {
        System.out.println(" libelle = " + libelle);
    }
}