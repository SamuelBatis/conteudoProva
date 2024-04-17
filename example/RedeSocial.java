package org.example;

import java.util.Scanner;

public class RedeSocial {

  public static void main(String[] args) {

    Scanner scann = new Scanner(System.in);
    ListaLigadaDupla list1 = new ListaLigadaDupla();
    ListaLigadaDupla list2 = new ListaLigadaDupla();
    int sair = 0;
    while(sair != 1) {
      System.out.println("numero de perfis ");
      int interact = Integer.parseInt(scann.nextLine());
      for(int i = 0; i < interact; i++) {
        System.out.println("# Criar perfil");
        String nome = scann.nextLine();
        int idade = Integer.parseInt(scann.nextLine());
        String cidade = scann.nextLine();
        Perfil perfil = new Perfil(nome, idade, cidade);
        list1.adiciona(perfil);
      }
      System.out.println("numero de amigos ");
      int interact2 = Integer.parseInt(scann.nextLine());
      for(int i = 0; i < interact2; i++) {
        System.out.println("# Adicionar amigo");
        String nome1 = scann.nextLine();
        String nome2 = scann.nextLine();
        String toSave = "(" + nome1 + ", " + nome2 + ")";
        list2.adiciona(toSave);
      }
      System.out.println(list2);
      System.out.println("sair? y or n");
      String response = scann.nextLine();
      if(response.equals("y")) {
        sair = 1;
      }
    }
  }
}
