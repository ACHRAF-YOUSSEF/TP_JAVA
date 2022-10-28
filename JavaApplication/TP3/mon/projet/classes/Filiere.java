package TP3.mon.projet.classes;

public class Filiere {
    private int id;
    private String code;
    private String libelle;
    private static int count;

    public Filiere(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;

        id = count + 1;
    }

    public String toString() {
        return "Filière :" + libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Filiere.count = count;
    }

}