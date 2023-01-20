package collections.set;

import java.util.Objects;

public class Mes implements Comparable <Mes> {

    private String nome;
    private int numero;

    public String getNome() { return nome; }

    public int getNumero() { return numero; }

    public void setNome(String nome) { this.nome = nome; }

    public void setNumero(int numero) { this.numero = numero; }


    public Mes(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero + " - " + nome ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mes mes = (Mes) o;
        return numero == mes.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public int compareTo(Mes o) {
        if(this.numero < o.numero){
            return -1;
        }else if (this.numero > o.numero){
            return 1;
        }
        return 0;
    }
}
