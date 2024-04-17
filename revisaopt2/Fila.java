package ListaDeExercicios6.revisaopt2;

public class Fila {
    ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

    public boolean vazia() {
        return lista.tamanho() == 0;
    }

    private void remove() {
        lista.removeDoComeco();
    }

    public void insere(Object elemento) {
        this.lista.adiciona(elemento);
    }

    public Object pega() {
        if (!vazia()) {
            Object elemento = lista.pega(0);
            this.remove();
            return elemento;
        }
        return null;
    }

    public boolean top() {
        return lista.total > 0 ? true : false;
    }

}
