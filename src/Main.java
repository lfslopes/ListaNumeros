import numeros.ListaNumero;

public class Main {
    public static void main(String[] args) {
        ListaNumero listaNumero = new ListaNumero(4, 6, 8, 1, 10, 3, 17, 5, 1024, 33, 37);

        listaNumero.adicionarNumero(51);

        System.out.println("Soma de todos os números da lista: " + listaNumero.calcularSoma() );
        System.out.println("Maior número da lista: " + listaNumero.encontraMaiorNumero());
        System.out.println("Menor número da lista: " + listaNumero.encontraMenorNumero());

        listaNumero.exibirNumeros().iterator().forEachRemaining(n -> System.out.print(n + " "));
    }
}
