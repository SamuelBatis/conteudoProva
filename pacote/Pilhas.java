package ListaDeExercicios6.pacote;

public class Pilhas {
    static String lista[] = new String[100];
    static int topo=0;
    static int total=0;
    public static void push(String elemento){
        lista[topo++] = elemento;
        total++;
    }

    public static String pop(){
        if(total==0)
            return null;
        total--;
        return lista[--topo];
    }

    public static boolean top() {
        return total > 0 ? true : false;
    }


}
