package org.example;

import java.util.Scanner;

public class Numero {
  public static void main(String[] args) {
    ListaLigada listaFatoriais = new ListaLigada();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Digite um número (ou -1 para sair): ");
      int numero = scanner.nextInt();
      if (numero == -1) {
        break;
      }

      int[] fatorial = calcularFatorial(numero);
      Fatorial fatorialObj = new Fatorial(numero, fatorial);
      listaFatoriais.adiciona(fatorialObj);
    }

    System.out.println("Resultados dos fatoriais:");
    System.out.println(listaFatoriais);
  }

  public static int[] calcularFatorial(int n) {
    int maxDigit = 5000; // máximo de dígitos para representar o fatorial
    int[] fatorial = new int[maxDigit];
    fatorial[0] = 1;
    int tamanhoFatorial = 1;

    for (int i = 2; i <= n; i++) {
      int carry = 0;
      for (int j = 0; j < tamanhoFatorial; j++) {
        int produto = fatorial[j] * i + carry;
        fatorial[j] = produto % 10;
        carry = produto / 10;
      }

      while (carry > 0) {
        fatorial[tamanhoFatorial] = carry % 10;
        carry /= 10;
        tamanhoFatorial++;
      }
    }

    int[] resultado = new int[tamanhoFatorial];
    for (int i = 0; i < tamanhoFatorial; i++) {
      resultado[i] = fatorial[tamanhoFatorial - i - 1];
    }
    return resultado;
  }
}
