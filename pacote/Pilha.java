package ListaDeExercicios6.pacote;

public class Pilha {
    private ListaLigadaDupla lista = new ListaLigadaDupla();

    public void empilha(Object elemento) {
        this.lista.adiciona(elemento);
    }

    public boolean vazia() {
        return this.lista.tamanho() > 0 ? false : true;
    }

    public Object desempilha() {
        if(!vazia()) {
            Object dados = this.lista.pega(lista.tamanho()-1);
            this.lista.removeDoFim();
            return dados;
        }
        return null;
    }

    public boolean top() {
        return this.lista.tamanho() > 0 ? true : false;
    }
}
