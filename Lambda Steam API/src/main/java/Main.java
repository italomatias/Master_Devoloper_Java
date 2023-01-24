import java.sql.SQLOutput;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> words = List.of("CARLOS" , "JOSÉ" , "JOÃO" , "JOANA" , "MARIA" , "CELSO");

        words.stream()
                .filter(w -> w.startsWith("J"))
                //.map(w -> w.toLowerCase())
                .map(String::toLowerCase)
                //.forEach(w -> System.out.println(w));
                .forEach(System.out::println);
//
//       filteredWords.forEach(w -> System.out.println(w));


    }
}
