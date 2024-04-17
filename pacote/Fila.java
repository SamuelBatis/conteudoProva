package ListaDeExercicios6.pacote;

public class Fila {

    private static ListaLigadaDupla lista = new ListaLigadaDupla();

    public boolean vazia() {
        return lista.tamanho() == 0;
    }

    public void insere(Object elemento) {
        this.lista.adiciona(elemento);
    }

    public void remove() {
        lista.removeDoComeco();
    }

    public Object pega() {
        if(!vazia()) {
            Object elemento = lista.pega(0);
            this.remove();
            return elemento;
        }
        return null;
    }


    public static boolean top() {
        return lista.tamanho() > 0 ? true : false;
    }
}
