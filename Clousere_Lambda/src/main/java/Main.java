import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        final int mult = 2 ;

        IntStream.range(1,21)
                .map(i -> i * mult )
                .forEach(System.out::println);

    }
}