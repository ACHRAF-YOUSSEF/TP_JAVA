package TP3;

public class Point {
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