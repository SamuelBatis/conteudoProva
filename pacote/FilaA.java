package ListaDeExercicios6.pacote;

public class FilaA {
    static int topo=0;
    static int total=0;
    Vetor lista = new Vetor();

    public void insere(Object object){
        lista.adiciona(object);
        total++;
    }

    private boolean fEmpty(){
        return lista.vazia();
    }

    public Object remover(){
        if (!fEmpty()) {
            Object objeto = lista.pega(0);
            lista.remove(0);
            total--;
            return objeto;
        }
        return null;
    }

    public static boolean top() {
        return total > 0 ? true : false;
    }

    public Object mostra(){
        return lista;
    }
}

