package ListaDeExercicios6.revisaopt2;

public class Exercicio3 {
    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        lista1.adiciona("A");
        lista1.adiciona("B");
        lista1.adiciona("C");

        ListaLigada lista2 = new ListaLigada();
        lista2.adiciona("A");
        lista2.adiciona("B");
        lista2.adiciona("C");

        ListaLigada lista3 = new ListaLigada();
        lista3.adiciona("X");
        lista3.adiciona("Y");
        lista3.adiciona("Z");

        System.out.println(saoListasIguais(lista1, lista2));  // true
        System.out.println(saoListasIguais(lista1, lista3));  // false
    }
    public static boolean saoListasIguais(ListaLigada lista1, ListaLigada lista2) {
        if (lista1 == null || lista2 == null) {
            return false;
        }

        if (lista1.tamanho() != lista2.tamanho()) {
            return false;
        }

        for (int i = 0; i < lista1.tamanho(); i++) {
            if (!lista1.pega(i).equals(lista2.pega(i))) {
                return false;
            }
        }

        return true;
    }

}
