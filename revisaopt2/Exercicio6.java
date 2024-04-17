package ListaDeExercicios6.revisaopt2;

public class Exercicio6 {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        // Adiciona alguns elementos para teste
        lista.adiciona(1);
        lista.adiciona(3);
        lista.adiciona(5);
        lista.adiciona(7);

        System.out.println("A lista está em ordem crescente? " + estaOrdenadaCrescente(lista));
    }

    public static boolean estaOrdenadaCrescente(ListaDuplamenteEncadeada lista) {
        if (lista.tamanho() <= 1) {
            // Se a lista tiver 0 ou 1 elemento, está automaticamente ordenada
            return true;
        }

        for (int i = 0; i < lista.tamanho() - 1; i++) {
            int elementoAtual = (int) lista.pega(i);
            int proximoElemento = (int) lista.pega(i + 1);

            if (elementoAtual > proximoElemento) {
                return false; // Se o atual for maior que o próximo, não está em ordem crescente
            }
        }

        return true; // Se chegou até aqui, a lista está em ordem crescente
    }
}
