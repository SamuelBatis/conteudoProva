package org.revisaoprova;
class Dadospessoais {
  String nome;
  private int idade;
  private char sexo;

  public Dadospessoais(String nome, int idade, char sexo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public char getSexo() {
    return sexo;
  }
}
