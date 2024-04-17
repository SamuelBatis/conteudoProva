package ListaDeExercicios6.revisaopt2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos na lista: ");
        int numeroElementos = scanner.nextInt();
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            int elemento = scanner.nextInt();
            lista.adiciona(elemento);
        }

        System.out.print("Digite o elemento a ser removido: ");
        int elementoRemover = scanner.nextInt();

        removeElemento(lista, elementoRemover);

        System.out.println("Lista após remoção: " + lista.toString());
    }

    public static void removeElemento(ListaDuplamenteEncadeada lista, int elemento) {
        int posicao = 0;
        while (posicao < lista.tamanho()) {
            int elementoAtual = (int) lista.pega(posicao);
            if (elementoAtual == elemento) {
                lista.remove(posicao);
            } else {
                posicao++;
            }
        }
    }
}
