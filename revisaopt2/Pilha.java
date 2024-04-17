package ListaDeExercicios6.revisaopt2;

public class Pilha {

    ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

    public boolean vazia() {
        return this.lista.tamanho() > 0 ? false : true;
    }

    public void empilha(Object elemento) {
        this.lista.adiciona(elemento);
    }

    public Object desempilha() {
        if (!vazia()) {
            Object dados = this.lista.pega(lista.tamanho() - 1);
            this.lista.removeDoFim();
            return dados;
        }
        return null;
    }

    public boolean top() {
        return lista.total > 0 ? true : false;
    }
}
