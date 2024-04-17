package ListaDeExercicios6.pacote;

public class FilaDePilhas {
    public static void main(String[] args) {
        FilaDePilha filaDePilha = new FilaDePilha();

        filaDePilha.enfileirar("A");
        filaDePilha.enfileirar("B");
        filaDePilha.enfileirar("C");

        System.out.println(filaDePilha.desenfileirar()); // Deve imprimir "A"
        System.out.println(filaDePilha.desenfileirar()); // Deve imprimir "B"
        System.out.println(filaDePilha.desenfileirar()); // Deve imprimir "C"
    }
}

class FilaDePilha {
    private Pilhas pilhaPrincipal = new Pilhas();
    private Pilhas pilhaAuxiliar = new Pilhas();

    public void enfileirar(String elemento) {
        pilhaPrincipal.push(elemento);
    }

    public String desenfileirar() {

        if (pilhaAuxiliar.top() == false) {
            while (pilhaPrincipal.top()) {
                String elemento =  pilhaPrincipal.pop();
                pilhaAuxiliar.push(elemento);
            }
        }
        return (String) pilhaAuxiliar.pop();
    }
}
