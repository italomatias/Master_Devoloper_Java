import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("BMW",120000) , new Car("Renault",85000 ) , new Car("VW",70000) );

        cars.stream()
                .sorted((c1,c2) -> Double.valueOf(c1.getPrice()).compareTo(c2.getPrice()))
                .map(c -> new Car(c.getBrand().toLowerCase(),c.getPrice()))
                .peek(Car::addTax)
                .forEach(System.out::println);
    }

}
