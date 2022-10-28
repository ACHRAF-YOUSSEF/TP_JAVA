package TP3;

class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double abs, double ord) {
        x = abs;
        y = ord;
    }

    public double disctance() {
        return Math.sqrt((x * x) + (y * y));
    }

    public void deplacer(double abs, double ord) {
        x = abs;
        y = ord;
    }

    public String ToString() {
        return "Point (" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public double gety() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

public class EX1 {
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