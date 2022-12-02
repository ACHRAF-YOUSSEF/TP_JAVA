package TP5.Ex2;

import java.util.Enumeration;
import java.util.Vector;

public class Magasin {
    private Vector<Article> listArticle;

    public Magasin() {
        listArticle = new Vector<>();
    }

    public void add(Article a) {
        listArticle.add(a);
    }

    public boolean contains(Article a) {
        // for (Article article : listArticle) {
        // if (a.equals(article)) {
        // return true;
        // }
        // }

        // return false;

        // return listArticle.stream().anyMatch(al -> al.equals(a));

        return listArticle.contains(a);
    }

    public void delete(int code) {
        int pos = -1;

        for (int i = 0; i < listArticle.size(); i++) {
            if (listArticle.get(i).getCode() == code) {
                pos = i;
            }
        }

        if (pos != -1) {
            System.out.println("L'article ayant le code " + listArticle.get(pos).getCode() + " a été supprimé");
            listArticle.remove(pos);
        }
    }

    public void tousLesArticles() {
        // for (Article article : listArticle) {
        // System.out.println(article);
        // }

        // for (int i = 0; i < listArticle.size(); i++) {
        // System.out.println(listArticle.get(i));
        // }

        Enumeration<Article> en = listArticle.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

        // listArticle.stream().forEach(System.out::println);

        // listArticle.forEach(System.out::println);
    }
}
