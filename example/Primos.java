package org.example;

import java.util.Scanner;

public class Primos {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    ListaLigada listaPrimos = new ListaLigada();


    for (int i = 2; i <= numero; i++) {
      if (ehPrimo(i)) {
        listaPrimos.adiciona(i);
      }
    }

    System.out.println("Números primos até " + numero + ":");
    System.out.println(listaPrimos);
  }

  public static boolean ehPrimo(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

