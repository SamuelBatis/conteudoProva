package ListaDeExercicios6.revisao;

public class Pilha {
        static Object lista[] = new Object[100];
        static int topo=0;
        static int total=0;

         public boolean vazia() {
            return total > 0 ? false : true;
        }
        public static void push(Object elemento){
            lista[topo++] = elemento;
            total++;
        }

        public static Object pop(){
            if(total==0)
                return -1;
            total--;
            return lista[--topo];
        }

        public static boolean top() {
            return total > 0 ? true : false;
        }



}
