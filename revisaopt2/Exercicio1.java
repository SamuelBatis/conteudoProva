package ListaDeExercicios6.revisaopt2;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        ListaLigada listasimples = new ListaLigada();
        for(int i = 0; i < 5; i++){
            listasimples.adiciona(i);
        }
        System.out.println("Lista 1: " + listasimples);

        int[] vetor = new int[5]; // Criando o vetor aqui
        for(int j = 0; j < listasimples.tamanho(); j++){
            //System.out.println(j);

            //System.out.println(listasimples.pega(j));
             int aux = (int) listasimples.pega(j);
             vetor[j] = aux; // Adicionando o elemento da lista no vetor
        }
        // Imprimindo o vetor de outra forma
        System.out.print("Vetor: [");
        for(int k = 0; k < vetor.length; k++) {
            System.out.print(vetor[k]);
            if(k < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
