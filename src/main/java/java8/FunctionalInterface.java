package java8;

public class FunctionalInterface {

    @java.lang.FunctionalInterface
    public interface Hello {

        String hello();
    }

    public static void main(String[] args) {
        Hello hello = () -> "Hello World!";
        System.out.println(hello.hello());

        System.out.println(((Hello) () -> "Hello World!").hello());
    }
}
