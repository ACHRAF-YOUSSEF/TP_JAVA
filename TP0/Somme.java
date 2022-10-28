public class Somme {
    int s = 0, i;

    void sum() {
        for (i = 1; i < 101; i++) {
            s += i;
        }

        System.out.println("somme= " + s);
    }

    public static void main(String[] args) {
        Somme somme = new Somme();

        somme.sum();
    }
}