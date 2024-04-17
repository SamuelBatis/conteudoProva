package ListaDeExercicios6.revisaopt2;

public class ListaLigada {

    private Celula primeira;
    private Celula ultima;
    private int total = 0;

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(this.primeira, elemento);
        primeira = nova;
        if (total == 0) {
            // caso especial da lista vazia
            ultima = primeira;
        }
        this.total++;
    }

    public void adiciona(Object elemento) {
        if (total == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            ultima.setProxima(nova);
            ultima = nova;
            total = total + 1;
        }
    }

    public void removeDoComeco() {
        if (!posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        primeira = primeira.getProxima();
        total = total - 1;
        if (total == 0) {
            ultima = null;
        }

    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.total;
    }

    private Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }

    public Object pega(int posicao) {
        return (this.pegaCelula(posicao).getElemento());
    }

    public int tamanho() {
        return this.total;
    }

    public String toString() {
        if (total == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.total - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
}