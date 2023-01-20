package collections.newdataapi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        String dataNasc = "26/08/1994 10:35:00";

        LocalDateTime ltd = LocalDateTime.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        LocalDateTime now = LocalDateTime.now();

        Duration d = Duration.between(ltd , now);
        System.out.println("HORAS: "+ d.toHours());
        System.out.println("DIAS: "+ d.toDays());

        System.out.println(ltd);

    }

}
