import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] array = List.of(3,2,5,9,10).stream().mapToInt(Integer::intValue).toArray();
        System.out.println(multiply(array));
        System.out.println(max(array));

    }

    private static int multiply (int [] array){
        return  Arrays.stream(array).reduce((x,y)-> x * y).orElse(0);
    }

    private static int max (int [] array){
        return  Arrays.stream(array).reduce((x,y)-> x > y ? x : y).orElse(0);
    }


}
