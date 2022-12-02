package TP5.Ex2;

public class Test {
    public static void main(String[] args) {
        Article tv = new Article("LG", 7000.00);
        Article machinealaver = new Fragile("Beko", 6500.00);
        Article refregerateur = new Fragile("Samsung", 5800.00);
        Article microondes = new Fragile("WHIRPOOL", 1800.00);

        Magasin magasin = new Magasin();

        magasin.add(tv);
        magasin.add(machinealaver);
        magasin.add(refregerateur);
        magasin.add(microondes);

        System.out.println("\nLe prix de transport de l'article " + tv.nom + " est : " + tv.prixHT);
        System.out.println("\n*********** Liste de tous les articles : ***********");

        magasin.tousLesArticles();

        System.out.println("\nTest si un article est dans le magasin ou pas : " + magasin.contains(refregerateur));

        magasin.delete(1);

        System.out.println("\n********** Liste des articles restants : ***********");

        magasin.tousLesArticles();
    }
}
