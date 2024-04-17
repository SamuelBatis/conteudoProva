package ListaDeExercicios6.revisao;

public class ResolucaoListaRevisao {


    public Object[] copiaDados(ListaLigada  list) {
        Object[] vetor = new Object[100];

        for(int i = 0; i < list.tamanho(); i++) {
            vetor[i] = list.pega(i);
        }

        return vetor;
    }

    public static boolean comparaConteudo(ListaLigada list1, ListaLigada list2) {

        for(int i = 0; i < list1.tamanho(); i++) {
            if(list1.pega(i) != list2.pega(i)) {
                return false;
            }

        }
        return true;
    }

    public static boolean ordemCrescente(ListaLigada list) {
        for(int i = 0; i < list.tamanho(); i++) {

                if(i < list.tamanho() -1 &&(int)list.pega(i) > (int)list.pega(i+1)) {
                    return false;
                }

        }
        return true;
    }



    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        ListaLigada lista2 = new ListaLigada();

        lista1.adiciona(1);
        lista1.adiciona(2);
        lista1.adiciona(3);
        lista1.adiciona(4);

        lista2.adiciona(1);
        lista2.adiciona(2);
        lista2.adiciona(3);
        lista2.adiciona(4);


        System.out.println(comparaConteudo(lista1, lista2));
        System.out.println(ordemCrescente(lista1));

    }
}
