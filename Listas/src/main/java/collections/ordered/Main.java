package collections.ordered;

import collections.set.Mes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Character> alfabeto = new TreeSet<>();
        alfabeto.add('F');
        alfabeto.add('E');
        alfabeto.add('A');
        alfabeto.add('C');
        alfabeto.add('B');
        alfabeto.add('D');

        System.out.println(alfabeto);

        Mes m1 = new collections.set.Mes("Janeiro", 1);
        Mes m2 = new collections.set.Mes("Fevereiro", 2);
        Mes m3 = new collections.set.Mes("Março", 3);
        Mes m4 = new Mes("Abril", 4);

        Set<Mes> meses = new TreeSet<>();
        meses.add(m1);
        meses.add(m2);
        meses.add(m3);
        meses.add(m4);

        System.out.println(meses);


    }
}
