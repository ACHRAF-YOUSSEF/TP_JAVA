package TD2.EX1;

public class Document {
    private static int numero = -1;
    private String titre;

    public Document(String titre) {
        this.titre = titre;
        numero++;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public static int getNumero() {
        return numero;
    }

    public String toString() {
        return "Document: numero N°" + getNumero() + " son titre est " + titre;
    }
}
