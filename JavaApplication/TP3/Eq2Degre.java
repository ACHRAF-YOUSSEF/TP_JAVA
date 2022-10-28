package TP3;

public class Eq2Degre {
    private double r1;
    private double r2;
    private double delta;
    private double a;
    private double b;
    private double c;

    Eq2Degre(double x1, double x2, double x3) {
        a = x1;
        b = x2;
        c = x3;

        delta = b * b - (4.0 * a * c);
    }

    public void afficheDiscriminant() {
        System.out.println("delta= " + delta);
    }

    public void resoudre() {
        r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
    }

    public void afficheSolutions() {
        System.out.println("R1= " + r1 + "|R2= " + r2);
    }
}