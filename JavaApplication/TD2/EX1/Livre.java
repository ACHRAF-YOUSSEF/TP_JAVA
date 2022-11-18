package TD2.EX1;

public class Livre extends Document {
    private String auteur;
    private int nbPage;

    public Livre(String titre, String auteur, int nbPage) {
        super(titre);
        this.auteur = auteur;
        this.nbPage = nbPage;
    }

    public String toString() {
        return "Livre: " + super.toString().substring(10) + " son auteur est " + auteur
                + " et le nombre de pages est egale à "
                + nbPage;
    }
}
