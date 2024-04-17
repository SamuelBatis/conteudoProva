package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ListaLigada listaDadoss = new ListaLigada();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos Alunos na sala: ");
    int numDadoss = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer
    double somaMedias = 0;
    for (int i = 0; i < numDadoss; i++) {
      System.out.print("Nome do Aluno " + (i + 1) + ": ");
      String nome = scanner.nextLine();
      double somaNotas = 0;
      for (int j = 1; j <= 2; j++) {
        System.out.print("Nota " + j + " do Aluno " + (i + 1) + ": ");
        somaNotas += scanner.nextDouble();
      }
      scanner.nextLine(); // Limpar o buffer
      double media = somaNotas / 2;
      Dados Dados = new Dados(nome, media);
      listaDadoss.adiciona(Dados);
      somaMedias += media;
    }
    double mediaGeralSala = somaMedias / numDadoss;
    System.out.println("Médias dos Alunos:");
    System.out.println(listaDadoss);
    System.out.println("Média geral da sala: " + mediaGeralSala);
  }
}
