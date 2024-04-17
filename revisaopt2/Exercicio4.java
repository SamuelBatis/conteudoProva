package ListaDeExercicios6.revisaopt2;

public class Exercicio4 {
    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        lista1.adiciona(2);
        lista1.adiciona(4);
        lista1.adiciona(3);

        ListaLigada lista2 = new ListaLigada();
        lista2.adiciona(1);
        lista2.adiciona(2);
        lista2.adiciona(10);

        System.out.println(estaOrdenadaCrescente(lista1));  // true
        System.out.println(estaOrdenadaCrescente(lista2));  // false
    }

    public static boolean estaOrdenadaCrescente(ListaLigada lista) {
        if (lista == null || lista.tamanho() <= 1) {
            return true;
        }

        for (int i = 0; i < lista.tamanho() - 1; i++) {
            if ((int) lista.pega(i) > (int) lista.pega(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
