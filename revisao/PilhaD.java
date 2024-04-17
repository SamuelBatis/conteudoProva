package ListaDeExercicios6.revisao;


public class PilhaD {
    private ListaLigadaD lista = new ListaLigadaD();
    static int total=0;

    public void empilha(Object elemento) {
        this.lista.adiciona(elemento);
        total++;
    }

    public boolean vazia() {
        return this.lista.tamanho() > 0 ? false : true;
    }

    public Object desempilha() {
        if(!vazia()) {
            Object dados = this.lista.pega(lista.tamanho()-1);
            this.lista.removeDoFim();
            total--;
            return dados;
        }
        return null;
    }

    public boolean top() {
        return total > 0 ? true : false;
    }
}
