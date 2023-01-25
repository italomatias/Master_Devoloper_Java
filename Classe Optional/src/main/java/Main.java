import java.util.Map;
import java.util.Optional;

public class Main {

    public static  final Map<String,Integer> PEOPLE = Map.of("pedro",15,"maria",20,"paulo",25,"jorge",10);

    public static void main(String[] args) {

        Optional<Integer> opt = get("pedro");

        //int age = opt.orElse(0);

        int age = opt.orElseThrow(IllegalArgumentException::new);

        //opt.ifPresent(i -> System.out.println("A idade :" + i + "foi encontrada"));


        opt.ifPresentOrElse(i -> System.out.println("A idade :" + i + " foi encontrada"),()-> System.out.println("Não foi encontrado"));

        //System.out.println(age);



    }

    private static Optional<Integer> get(String name ){
        return Optional.ofNullable(PEOPLE.get(name));
    }

}
