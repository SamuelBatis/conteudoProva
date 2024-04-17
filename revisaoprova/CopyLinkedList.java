package org.revisaoprova;

import org.example.ListaLigadaDupla;

public class CopyLinkedList {

  public static void copyLinkedListToArray(ListaLigadaDupla list, int[] array) {
    int index = 0;
    for(int i = 0; i < list.tamanho(); i++) {
      array[i] = (int) list.pega(i);
    }
  }

  public static void main(String[] args) {
    ListaLigadaDupla lista = new ListaLigadaDupla();
    int[] arrDeResposta = new int[100];
    for(int i = 0; i < 10; i++) {
      lista.adiciona(i);
    }

    for(int i = 0; i < lista.tamanho(); i++) {
      arrDeResposta[i] = (int) lista.pega(i);
    }

  }
}
