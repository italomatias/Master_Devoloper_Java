package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaMercado = new ArrayList<>();

        listaMercado.add("macarrão");
        listaMercado.add("feijão");
        listaMercado.add("ovo");
        listaMercado.add("sal");

        Collections.sort(listaMercado);

        System.out.println(listaMercado);

        for (String item : listaMercado){
            System.out.println("Item: " + item);
        }

        listaMercado.remove(0);

        listaMercado.remove("ovo");

        for (String item : listaMercado){
            System.out.println("Item: " + item);
        }

        System.out.println(listaMercado.contains("sal"));
        System.out.println(listaMercado.contains("farinha"));

        int posSal = listaMercado.indexOf("sal");

        System.out.println("A posição do são é : " + posSal);

    }
}
