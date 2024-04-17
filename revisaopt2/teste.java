
public class teste {
    public static void main(String[] args) throws Exception {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adiciona(1);
        System.out.println(lista);
        lista.adicionaNoComeco(2);
        System.out.println(lista);
        System.out.println(lista.tamanho());
    }
}