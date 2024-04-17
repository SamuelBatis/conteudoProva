package ListaDeExercicios6.revisao;

/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) - (Univap)
 * Curso: Engenharia da Computacao - Data de Entrega: 05/04/2024
 * Autor: Prof. Wagner dos Santos Clementino de Jesus
 *
 * Turma: 8UNA Disciplina: Algoritmos Estrutura de Dados - II
 * Exercicio Resolvido em aula pelo professor
 * Observacao: Algoritmo de Estrutura de Fila Simples com dados Inteiros
 *
 * Filasimples.java
 * ***************************************************************************************/
class Filasimples 
{
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
