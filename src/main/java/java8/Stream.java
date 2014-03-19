package java8;

import java.util.Arrays;

public class Stream {

    public static void main(String[] args) {
        Arrays.asList(args)
                .stream()
                .map(s -> "Hello " + s + "!")
                .forEach(System.out::println);
    }
}
