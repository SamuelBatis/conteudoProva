package org.example;

public class Dados {
  private String nome;
  private double media;


  public Dados(String nome, double media) {
    this.nome = nome;
    this.media = media;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getMedia() {
    return media;
  }

  @Override
  public String toString() {
    return "{" +
        "nome='" + nome + '\'' +
        ", media=" + media +
        '}';
  }

  public void setMedia(double media) {
    this.media = media;
  }
}
