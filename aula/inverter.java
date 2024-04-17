package org.aula;
/*objetivo do problema é checar se uma string é um palindromo*/

import java.util.Scanner;

public class inverter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pilhas pilha = new Pilhas();
    System.out.println("digite a palavra: ");
    String palavra = scanner.nextLine();
    char[] formart = palavra.toCharArray();
    for (char i : formart) {
      Dados dado = new Dados();
      dado.setLetra(i);
      pilha.push(dado);
    }

    char[] toCompare = new char[formart.length];
    int index = 0;
    while (pilha.top()) {
      Dados obj = (Dados) pilha.pop();
      toCompare[index] = obj.getLetra();
      index++;
    }

    String mString = String.valueOf(toCompare);
    if (mString.equals(palavra)) {
      System.out.print(palavra + " ");
      System.out.println("é palindromo");
    } else {
      System.out.println("não é palindromo ");
    }

  }
}
