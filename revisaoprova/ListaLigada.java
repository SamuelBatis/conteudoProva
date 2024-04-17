package org.revisaoprova;

import org.example.Celula;

public class ListaLigada {
  private Celula primeira;
  private Celula ultima;
  private int total = 0;
  public void adiciona(Object elemento) {
    if(total == 0) {
      adicionaNoComeco(elemento);
    } else {
      Celula nova = new Celula(elemento);
      ultima.setProxima(nova);
      ultima = nova;
      total++;
    }
  }
  public void adicionaNoComeco(Object elemento) {
    Celula nova = new Celula(this.primeira, elemento);
    primeira = nova;
    if(total == 0) {
      ultima = primeira;
    }
    this.total++;

  }

  public boolean posicaoOcupada(int posicao) {
    return posicao >= 0 && posicao < this.total;
  }

  public Object pega(int posicao) {
    return (pegaCelula(posicao).getElemento());
  }
  private Celula pegaCelula(int posicao) {
    if(!posicaoOcupada(posicao)) throw new IllegalArgumentException("posição não existe");
    Celula atual = primeira;
    for(int i = 0; i < posicao - 1; i++) {
      atual = atual.getProxima();
    }
    return atual;
  }

  public void removeDoComeco() {
    if(!posicaoOcupada(0))  throw new IllegalArgumentException("posição não existe");
    primeira = primeira.getProxima();
    total = total - 1;
    if(total == 0) ultima = null;
  }
  public int tamanho() {
    return total;
  }

  @Override
  public String toString() {
    if(total == 0) {
      return "[]";
    }
    StringBuilder builder = new StringBuilder("[");
    Celula atual = primeira;

    for(int i = 0; i < total-1; i++) {
      builder.append(atual.getElemento());
      builder.append(", ");
      atual = atual.getProxima();
    }

    builder.append(atual.getElemento());
    builder.append("]");
    return builder.toString();
  }
}
