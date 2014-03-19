package java8;

public class InterfaceDefaultMethod {

    public interface Hello {

        default void hello() {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        Hello hello = new Hello() {
            //
        };
        hello.hello();
    }
}
