package org.example;

import java.util.Scanner;

public class Aparelhos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantos Valores: ");
    int quantosValores = scanner.nextInt();
    System.out.println("Valores:");

    ListaLigadaDupla lista = new ListaLigadaDupla();

    for (int i = 0; i < quantosValores; i++) {
      int n = scanner.nextInt();
      int resultado = calcularNumeroAparelhos(n);
      lista.adiciona(resultado);
    }

    System.out.println("Saída:");
    System.out.println(lista);
  }

  public static int calcularNumeroAparelhos(int n) {
    return (n * (n + 1)) / 2;
  }
}
