package ListaDeExercicios6.revisao;/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) - (Univap)
 * Curso: Engenharia da Computacao - Data de Entrega: 05/04/2024
 * Autor: Prof. Wagner dos Santos Clementino de Jesus
 *
 * Turma: 8UNA Disciplina: Algoritmos Estrutura de Dados - II
 * Exercicio Resolvido em aula pelo professor
 * Observacao: Tarefa - 3 (Exercicio - 3)
 *
 * FilaPilha.java
 * ***************************************************************************************/

public class FilaPilha
{
	private Pilha entrada = new Pilha();
	private Pilha saida = new Pilha();

	public void enfileirar(Object item) {
        entrada.push(item);
    }

   public Object desenfileirar() {
        if (saida.vazia()) {
            while (!entrada.vazia()) 
                saida.push(entrada.pop());
            
        }
        return saida.pop();
    }

	public boolean vazia() {
	    return entrada.vazia() && saida.vazia();
	}


}