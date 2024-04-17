package ListaDeExercicios6.revisaopt2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Adiciona cada caractere da palavra na lista
        for (char c : palavra.toCharArray()) {
            fila.insere(c);
        }
        // char[] vogais = {'a','e','i','o','u'};
        int vogais = 0;
        int consoantes = 0;
        while (fila.top()) {
            char elemento = (char) fila.pega();

            if (elemento >= 'a' && elemento <= 'z') {
                if (elemento == 'a' || elemento == 'e' || elemento == 'i' || elemento == 'o' || elemento == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }
        int totalCaracteres = vogais + consoantes;
        double percentualVogais = (double) vogais / totalCaracteres * 100;
        double percentualConsoantes = (double) consoantes / totalCaracteres * 100;

        System.out.println("Número de vogais: " + vogais);
        System.out.println("Número de consoantes: " + consoantes);
        System.out.println("Percentual de vogais: " + percentualVogais + "%");
        System.out.println("Percentual de consoantes: " + percentualConsoantes + "%");
    }

}
