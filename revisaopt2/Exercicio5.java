package ListaDeExercicios6.revisaopt2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Adiciona cada caractere da palavra na lista
        for (char c : palavra.toCharArray()) {
            lista.adiciona(c);
        }

        System.out.print("Digite uma letra para ser contada: ");
        char letra = scanner.next().charAt(0);

        int ocorrencias = contarOcorrencias(lista, letra);
        System.out.println("A palavra '" + palavra + "' tem " + ocorrencias + " vezes o caractere '" + letra + "'.");

    }
    public static int contarOcorrencias(ListaLigada lista, char caractere) {
        int ocorrencias = 0;

        // Percorre a lista
        for (int i = 0; i < lista.tamanho(); i++) {
            char elemento = (char) lista.pega(i);

            // Verifica se o elemento é o caractere desejado
            if (elemento == caractere) {
                ocorrencias++;
            }
        }

        return ocorrencias;
    }
}
