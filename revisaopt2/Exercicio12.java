package ListaDeExercicios6.revisaopt2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro de pessoas: ");
        int numeroInteiro = scanner.nextInt();
        for (int i = 0; i < numeroInteiro; i++) {
            DadosPessoais dadosPessoais = new DadosPessoais();
            System.out.print("Digite o nome: ");
            String nome = scanner.next();
            dadosPessoais.setNome(nome);
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            dadosPessoais.setIdade(idade);
            System.out.print("Digite o sexo (M ou F): ");
            char sexo = scanner.next().charAt(0);
            dadosPessoais.setSexo(sexo);
            lista.adiciona(dadosPessoais);
            
        }
        int idadeMaisVelha = Integer.MIN_VALUE;
        String nomeMaisVelha = "";
        int idadeMaisNova = Integer.MAX_VALUE;
        String nomeMaisNova = "";
        int totalHomens = 0;
        int totalMulheres = 0;
        int mulheresMaisVinteAnos = 0;

        for (int i = 0; i < lista.tamanho(); i++) {
            DadosPessoais pessoa = (DadosPessoais) lista.pega(i);

            // Verificar idade mais velha
            if (pessoa.getIdade() > idadeMaisVelha) {
                idadeMaisVelha = pessoa.getIdade();
                nomeMaisVelha = pessoa.getNome();
            }

            // Verificar idade mais nova
            if (pessoa.getIdade() < idadeMaisNova) {
                idadeMaisNova = pessoa.getIdade();
                nomeMaisNova = pessoa.getNome();
            }

            // Contar homens e mulheres
            if (pessoa.getSexo() == 'M') {
                totalHomens++;
            } else if (pessoa.getSexo() == 'F') {
                totalMulheres++;
                // Verificar mulheres com mais de vinte anos
                if (pessoa.getIdade() > 20) {
                    mulheresMaisVinteAnos++;
                }
            }
        }
        double percentualMulheresMaisVinteAnos = totalMulheres == 0 ? 0 : (double) mulheresMaisVinteAnos / totalMulheres * 100;

        System.out.println("\nResultados:");
        System.out.println("Nome da pessoa mais velha: " + nomeMaisVelha + " - Idade: " + idadeMaisVelha);
        System.out.println("Nome da pessoa mais nova: " + nomeMaisNova + " - Idade: " + idadeMaisNova);
        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
        System.out.println("Percentual de mulheres com mais de vinte anos: " + percentualMulheresMaisVinteAnos + "%");

    }
}
