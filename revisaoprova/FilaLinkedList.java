package org.revisaoprova;

import org.example.ListaLigadaDupla;

public class FilaLinkedList {

  ListaLigadaDupla lista = new ListaLigadaDupla();

  public boolean vazia() {
    return lista.tamanho() == 0;
  }

  public void insere(Object elemento) {
    this.lista.adiciona(elemento);
  }

  private void remove() {
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
}
