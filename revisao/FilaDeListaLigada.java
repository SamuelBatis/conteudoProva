package ListaDeExercicios6.revisao;

public class FilaDeListaLigada {
    ListaLigadaD lista = new ListaLigadaD();
    static int total=0;

    public void insere(Object elemento) {
        this.lista.adiciona(elemento);
        total++;
    }
    private void remove() {
        this.lista.removeDoComeco();
        total--;
    }
    public Object pega(){
        if(!vazia()) {
            Object elemento = lista.pega(0);
            this.remove();
            return elemento;
        }
        return null;
    }
    public boolean vazia() {
        return lista.tamanho() == 0;
    }

    public static boolean top() {
        return total > 0 ? true : false;
    }
}
