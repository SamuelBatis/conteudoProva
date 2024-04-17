package ListaDeExercicios6.pacote;

public class Main {
    public void inverterFila(FilaA fila, Pilha pilha) {

        Object element = fila.remover();
        while (element != null) {
            element = fila.remover();
            pilha.empilha(element);
        }


        while (pilha.top()) {
            Object elemento = pilha.desempilha();
            fila.insere(elemento);
        }
    }

    public static void main(String[] args) {

    }
}