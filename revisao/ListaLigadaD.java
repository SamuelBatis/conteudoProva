package ListaDeExercicios6.revisao;

public class ListaLigadaD {
    private CelulaD primeira;
    private CelulaD ultima;
    private int total;

    public int tamanho() {
        return total;
    }

    public void adiciona(Object elemento) {
        if(this.total == 0) {
            this.adicionaNoComeco(elemento);
        } else {
            CelulaD nova = new CelulaD(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            total = total + 1;
        }
    }

    public void adicionaNoComeco(Object elemento) {
        if(total == 0) {
            CelulaD nova = new CelulaD(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            CelulaD nova = new CelulaD(primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
            total = total + 1;
        }

    }
    public void adiciona(int posicao,Object elemento) {
        if( posicao == 0) {
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.total) {
            this.adiciona(elemento);
        } else {
            CelulaD anterior = this.pegaCelula(posicao-1);
            CelulaD nova = new CelulaD(anterior.getProxima(),elemento);
            anterior.setProxima(nova);
            this.total = this.total + 1;
        }
    }

    private CelulaD pegaCelula(int posicao) {
        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        CelulaD atual = primeira;
        for(int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }
    public void removeDoComeco() {
        if(!posicaoOcupada(0)) throw new IllegalArgumentException("Posição não existe");

        primeira = primeira.getProxima();
        total = total - 1;
        if( total == 0) ultima = null;
    }

    public Object pega(int posicao) {
        return pegaCelula(posicao).getElemento();
    }
    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.total;
    }

    public void removeDoFim() {
        if(!posicaoOcupada(total-1)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        if(total == 1) {
            this.removeDoComeco();
        } else  {
            CelulaD penultima = this.ultima.getAnterior();
            this.ultima = penultima;
            total = total-1;
        }
    }

    public void remove(int posicao) {
        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        
        if( posicao == 0) {
            removeDoComeco();
        } else {
            CelulaD anterior = pegaCelula(posicao-1);
            CelulaD atual = anterior.getProxima();
            CelulaD proxima = atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            total = total - 1;
        }
    }

    public String toString() {
        if(total == 0)
            return "[]";

        StringBuilder builder = new StringBuilder("[");
        CelulaD atual = primeira;

        for(int i = 0; i < total - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }

        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
}
