package argsPack;

public class HelloWorldWithMethod {
    void Hello() {
        System.out.println("You're Welcome!");
    }

    public static void main(String[] args) {
        HelloWorldWithMethod helloWorldWithMethod = new HelloWorldWithMethod();

        helloWorldWithMethod.Hello();
    }
}