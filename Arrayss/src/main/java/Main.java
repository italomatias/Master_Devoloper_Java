
import br.com.softblue.commons.io.Console;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite a quantidade de notas : ");
        int qtd = Console.readInt();
        double [] notas = new double [qtd];

        for (int i = 0 ; i < notas.length ; i++) {
            System.out.println("Digite a nota : ");
            notas[i] = Console.readDouble();
        }

        for (double nota : notas) {
            System.out.println(nota);
        }


    }
}

