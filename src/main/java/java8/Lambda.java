package java8;

public class Lambda {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello Lambda!");
        runnable.run();
    }
}
