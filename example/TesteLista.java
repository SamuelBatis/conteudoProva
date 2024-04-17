package org.example;

import java.util.Scanner;

public class TesteLista {



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ListaLigada listaLigada = new ListaLigada();
    System.out.println("quantas vezes? ");
    int a = Integer.parseInt(scanner.nextLine());

    for(int i = 0; i < a; i++) {
      System.out.println("digite a pessoa: ");
      String pessoa = scanner.nextLine();
      listaLigada.adiciona(pessoa);
    }


  }
}
