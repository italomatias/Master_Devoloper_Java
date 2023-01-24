import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(5,3,4,1,2));
        //NumberComparator comparator = new NumberComparator();
        numbers.sort((o1,o2) -> -o1.compareTo(o2));
        System.out.println(numbers);

    }
}
