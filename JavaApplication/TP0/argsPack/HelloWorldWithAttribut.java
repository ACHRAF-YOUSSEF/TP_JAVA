package argsPack;

public class HelloWorldWithAttribut {
    String maChaine;

    void Hello() {
        System.out.println(this.maChaine);
    }

    public static void main(String[] args) {
        HelloWorldWithAttribut s = new HelloWorldWithAttribut();
        s.maChaine = "Salut";
        s.Hello();
    }
}