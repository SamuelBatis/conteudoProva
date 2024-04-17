package ListaDeExercicios6.revisaopt2;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        Scanner scanner = new Scanner(System.in);

        // Adiciona alguns elementos para teste
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);

        System.out.println("Lista: " + lista);

        System.out.print("Digite o elemento a ser procurado: ");
        int elementoProcurado = scanner.nextInt();

        if (procurarElemento(lista, elementoProcurado)) {
            System.out.println("O elemento " + elementoProcurado + " está presente na lista.");
        } else {
            System.out.println("O elemento " + elementoProcurado + " não está presente na lista.");
        }
    }

    public static boolean procurarElemento(ListaLigada lista, int elementoProcurado) {
        for (int i = 0; i < lista.tamanho(); i++) {
            int elementoAtual = (int) lista.pega(i);

            if (elementoAtual == elementoProcurado) {
                return true; // Elemento encontrado
            }
        }

        return false; // Elemento não encontrado
    }
}
