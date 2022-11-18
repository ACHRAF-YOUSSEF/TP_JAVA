package TD2.EX1;

public class Dictionnaire extends Document {
    private String langue;
    private int nbTomes;

    public Dictionnaire(String titre, String langue, int nbTomes) {
        super(titre);
        this.langue = langue;
        this.nbTomes = nbTomes;
    }

    public String toString() {
        return "Dictionnaire: " + super.toString().substring(10) + " sa langue est " + langue
                + " et le nombre de tomes = " + nbTomes;
    }
}
