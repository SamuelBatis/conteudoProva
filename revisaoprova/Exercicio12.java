package org.revisaoprova;
import org.example.ListaLigadaDupla;


public class Exercicio12 {

  public static void main(String[] args) {
    ListaLigadaDupla lista = new ListaLigadaDupla();

    lista.adiciona(new Dadospessoais("João", 25, 'M'));
    lista.adiciona(new Dadospessoais("Maria", 30, 'F'));
    lista.adiciona(new Dadospessoais("Pedro", 18, 'M'));
    lista.adiciona(new Dadospessoais("Ana", 35, 'F'));

    Dadospessoais maisVelha = encontrarMaisVelha(lista);
    System.out.println("Pessoa mais velha: " + maisVelha.getNome() + ", " + maisVelha.getIdade() + " anos");

    Dadospessoais maisNova = encontrarMaisNova(lista);
    System.out.println("Pessoa mais nova: " + maisNova.getNome() + ", " + maisNova.getIdade() + " anos");

    int totalMulheres = contarSexo(lista, 'F');
    int totalHomens = contarSexo(lista, 'M');
    System.out.println("Total de mulheres: " + totalMulheres);
    System.out.println("Total de homens: " + totalHomens);

    double percentualMulheresMaisVinte = percentualMulheresMaisVinte(lista);
    System.out.println("Percentual de mulheres com mais de vinte anos: " + percentualMulheresMaisVinte + "%");
  }

  public static Dadospessoais encontrarMaisVelha(ListaLigadaDupla lista) {
    Dadospessoais maisVelha = (Dadospessoais) lista.pega(0);
    for (int i = 1; i < lista.tamanho(); i++) {
      Dadospessoais pessoa = (Dadospessoais) lista.pega(i);
      if (pessoa.getIdade() > maisVelha.getIdade()) {
        maisVelha = pessoa;
      }
    }
    return maisVelha;
  }

  public static Dadospessoais encontrarMaisNova(ListaLigadaDupla lista) {
    Dadospessoais maisNova = (Dadospessoais) lista.pega(0);
    for (int i = 1; i < lista.tamanho(); i++) {
      Dadospessoais pessoa = (Dadospessoais) lista.pega(i);
      if (pessoa.getIdade() < maisNova.getIdade()) {
        maisNova = pessoa;
      }
    }
    return maisNova;
  }

  public static int contarSexo(ListaLigadaDupla lista, char sexo) {
    int total = 0;
    for (int i = 0; i < lista.tamanho(); i++) {
      Dadospessoais pessoa = (Dadospessoais) lista.pega(i);
      if (pessoa.getSexo() == sexo) {
        total++;
      }
    }
    return total;
  }

  public static double percentualMulheresMaisVinte(ListaLigadaDupla lista) {
    int totalMulheres = contarSexo(lista, 'F');
    int mulheresMaisVinte = 0;
    for (int i = 0; i < lista.tamanho(); i++) {
      Dadospessoais pessoa = (Dadospessoais) lista.pega(i);
      if (pessoa.getSexo() == 'F' && pessoa.getIdade() > 20) {
        mulheresMaisVinte++;
      }
    }
    return (double) mulheresMaisVinte / totalMulheres * 100;
  }
}
