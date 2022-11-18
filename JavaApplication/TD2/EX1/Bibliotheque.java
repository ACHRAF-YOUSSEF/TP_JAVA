package TD2.EX1;

public class Bibliotheque {
    public static void main(String[] args) {
        Document document1 = new Document("document1");

        System.out.println(document1.toString());

        Livre livre1 = new Livre("titre1", "auteur1", 50);

        System.out.println(livre1.toString());

        Dictionnaire dictionnaire1 = new Dictionnaire("titre2", "français", 5);

        System.out.println(dictionnaire1.toString());
    }
}
