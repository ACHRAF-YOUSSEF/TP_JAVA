package TP3;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(4.1, 7.5);

        p1.deplacer(7.2, 0);

        System.out.println("la distance de la point p1 = " + p1.disctance());
        System.out.println("la distance de la point p2 = " + p2.disctance());

        System.out.println(p1.ToString());
        System.out.println(p2.ToString());

    }
}