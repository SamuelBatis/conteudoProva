package org.revisaoprova;

public class Main {

  public static void contarVogaisConsoantes(FilaLinkedList fila) {
    int totalCaracteres = 0;
    int totalVogais = 0;
    int totalConsoantes = 0;

    while (!fila.vazia()) {
      Object elemento = fila.pega();
      if (elemento instanceof Character) {
        char caractere = (char) elemento;
        if (Character.isLetter(caractere)) {
          totalCaracteres++;
          caractere = Character.toLowerCase(caractere);
          if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
            totalVogais++;
          } else {
            totalConsoantes++;
          }
        }
      }
    }

    System.out.println("Total de vogais: " + totalVogais);
    System.out.println("Total de consoantes: " + totalConsoantes);

    double percentualVogais = (double) totalVogais / totalCaracteres * 100;
    double percentualConsoantes = (double) totalConsoantes / totalCaracteres * 100;
    System.out.println("Percentual de vogais: " + percentualVogais + "%");
    System.out.println("Percentual de consoantes: " + percentualConsoantes + "%");
  }

  public static void main(String[] args) {
    FilaLinkedList fila = new FilaLinkedList();
    String palavra = "Revisaoprova";

    for (int i = 0; i < palavra.length(); i++) {
      fila.insere(palavra.charAt(i));
    }

    contarVogaisConsoantes(fila);
  }


}

