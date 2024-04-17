package ListaDeExercicios6.pacote;

public class SistemaOperacional {
    public static void main(String[] args) {
        FilaA filaProcessos = new FilaA();

        filaProcessos.insere(new Processo(1, 10));
        filaProcessos.insere(new Processo(2, 5));
        filaProcessos.insere(new Processo(3, 8));

        imprimirListaProcessos(filaProcessos);

        Processo processoRetirado = (Processo) filaProcessos.remover();
        System.out.println("ListaDeExercicios6.pacote.Processo retirado: ID " + processoRetirado.getId());

        imprimirListaProcessos(filaProcessos);
    }

    public static void imprimirListaProcessos(FilaA filaProcessos) {
        FilaA temp = new FilaA();

        System.out.println("Lista de Processos:");
        Object obj = filaProcessos.remover();
        while (obj != null) {
            Processo p = (Processo)  obj;
            System.out.println("ID: " + p.getId() + ", Tempo de Espera: " + p.getTempoEspera());
            temp.insere(p);
            obj = filaProcessos.remover();

        }
        Object obj2 = temp.remover();
        while (obj2 != null) {
            filaProcessos.insere(obj2);
            obj2 = temp.remover();
        }
    }
}

