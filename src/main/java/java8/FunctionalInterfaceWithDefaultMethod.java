package java8;

public class FunctionalInterfaceWithDefaultMethod {

    @java.lang.FunctionalInterface
    public interface Hello {

        String world();

        default String hello() {
            return "Hello " + world() + "!";
        }
    }

    public static void main(String[] args) {
        Hello hello = () -> "World!";
        System.out.println(hello.hello());

        System.out.println(((Hello) () -> "World!").hello());
    }
}
