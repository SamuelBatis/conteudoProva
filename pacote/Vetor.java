package ListaDeExercicios6.pacote;

public class Vetor {

    private Object dados[] = new Object[1];
    private StringBuilder builder;
    private int total = 0;

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= total;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < total;
    }
    public boolean vazia(){
        return this.total > 0 ? false : true;
    }

    public Object pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("**Posicao Invalida**");
        }
        return this.dados[posicao];
    }

    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("**Posicao Invalida**");
        }

        for (int i = posicao; i < total - 1 ; i++) {
            this.dados[i] = this.dados[i + 1];

        }
        total--;
    }

    public void adiciona(Object dado) {
        liberaEspaco();
        this.dados[total] = dado;
        total++;
    }

    public void adiciona(int posicao, Object dado) {
        liberaEspaco();
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("**posicao invalida**");
        }
        for (int i = total; i >= posicao; i--) {
            dados[i + 1] = dados[i];
        }
        this.dados[total] = dado;
        total++;
    }

    public int tamanho() {
        return this.total;
    }

    public boolean contem(Object dados) {
        System.out.println("valor de Object: " + dados.toString());
        return builder.indexOf(dados.toString()) >= 0 ? true : false;
    }

    private void liberaEspaco() {
        if (this.total == dados.length) {
            Object novoArray[] = new Object[this.dados.length * 2];
            for (int i = 0; i <= dados.length - 1; i++) {
                novoArray[i] = this.dados[i];
            }
            dados = novoArray;
        }
    }

    public String toString() {
        builder =  new StringBuilder();
        if (this.total == 0) {
            return "[]";
        }

        builder.append("[");
        for (int i = 0; i < this.total - 1; i++) {
            builder.append(this.dados[i]);
            builder.append(", ");
        }
        builder.append(this.dados[this.total - 1]);
        builder.append("]");
        return builder.toString();
    }
}
