package numeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaNumero {
    private final List<Integer> listanumeros;

    public ListaNumero() {
        this.listanumeros = new ArrayList<>();
    }
    public ListaNumero(Integer...numero){
        this.listanumeros = new ArrayList<>(Arrays.asList(numero));
        System.out.println(listanumeros.getClass().getName());
    }

    public void adicionarNumero(int numero){
        this.listanumeros.add(numero);
    }
    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : this.listanumeros)
            soma += numero;

        return soma;
    }
    public int encontraMaiorNumero() {
        int maior = this.listanumeros.getFirst();
        for (Integer numero : this.listanumeros){
            if (numero > maior)
                maior = numero;
        }
        return maior;
    }
    public int encontraMenorNumero() {
        int menor = this.listanumeros.getFirst();
        for (Integer numero : this.listanumeros){
            if (numero < menor)
                menor = numero;
        }
        return menor;
    }
    public List<Integer> exibirNumeros() {
        return Collections.unmodifiableList(this.listanumeros);
    }
}
