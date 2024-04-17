package org.example;

public class Fatorial {
  private int numero;
  private int[] fatorial;

  public Fatorial(int numero, int[] fatorial) {
    this.numero = numero;
    this.fatorial = fatorial;
  }

  public int getNumero() {
    return numero;
  }

  public int[] getFatorial() {
    return fatorial;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int digit : fatorial) {
      result.append(digit);
    }
    return numero + " = " + result.toString();
  }
}
