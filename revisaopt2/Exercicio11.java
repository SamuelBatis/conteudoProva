package ListaDeExercicios6.revisaopt2;

public class Exercicio11 {
    static int lista[] = new int[100];
    static int topo=0;
    static int total=0; 
    public static void push(int elemento){
           lista[topo++] = elemento;   
           total++;
    }

     public static int pop(){
            int dado = lista[0];
            remover(0);
            return dado;
     }

     private static void remover(int posicao){
         for(int i = posicao; i < total - 1; i++)   
              lista[i] = lista[i + 1];
                total--;
     }
        
     public static boolean top() {
           return total > 0 ? true : false;
    }
}
