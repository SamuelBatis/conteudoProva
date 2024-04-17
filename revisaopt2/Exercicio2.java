package ListaDeExercicios6.revisaopt2;

public class Exercicio2 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona(10);
        lista.adiciona(5);
        lista.adiciona(15);
        lista.adiciona(3);
        lista.adiciona(-2);

        // Encontra o conteúdo mínimo na lista
        Object minimo = encontraMinimo(lista);

        System.out.println("O conteúdo mínimo na lista é: " + minimo);
    }

    // Função para encontrar o conteúdo mínimo na ListaLigada
    public static Object encontraMinimo(ListaLigada lista) {
        if (lista.tamanho() == 0) {
            throw new IllegalStateException("Lista vazia");
        }

        Object minimo = lista.pega(0); // Assume o primeiro elemento como mínimo
        for (int i = 1; i < lista.tamanho(); i++) {
            int elementoAtual = (int) lista.pega(i);
            minimo = elementoAtual >= (int) minimo ? minimo : elementoAtual;
        }

        return minimo;
    }
}
