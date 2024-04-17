package ListaDeExercicios6.revisaopt2;

public class ListaDuplamenteEncadeada {

    private Celula primeira;
    private Celula ultima;
     int total = 0;

    public void adicionaNoComeco(Object elemento) {
        if (total == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.total++;

    }

    public void adiciona(Object elemento) {
        if (total == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            total = total + 1;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) {
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.total) {
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(anterior.getProxima(), elemento);
            anterior.setProxima(nova);
            this.total = this.total + 1;
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

    public void removeDoFim() {
        if (!posicaoOcupada(total-1)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (total == 1) {
            this.removeDoComeco();
        } else {
            Celula penultima = this.ultima.getAnterior();
            this.ultima = penultima;
            total = total - 1;
        }

    }

    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (posicao == 0) {
            removeDoComeco();
        } else {
            Celula anterior = pegaCelula(posicao - 1);
            Celula atual = anterior.getProxima();
            Celula proxima = atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            total = total - 1;
        }


    }

    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.total;
    }

    Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        Celula atual = primeira;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }

    Object pega(int posicao) {
        return (pegaCelula(posicao).getElemento());
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