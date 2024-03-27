package aula02;

public class AgendamentoDeTarefas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tarefa = "";

		
		tarefa = tarefa + cadastrarTarefa("001", "Estudar Java", 10, 11);
		tarefa += cadastrarTarefa("002", "Fazer compras", 11, 12);
		tarefa += cadastrarTarefa("003", "Limpar a casa", 12, 13);
		cadastrarTarefa("004", "Beber uma", 14, 16);
		exibirTarefas(tarefa);
		

	}
  private static void exibirTarefas(String tarefa) {
	System.out.println("Codigo - Tarefa - Inicio - Fim - Duração");
	System.out.println(tarefa);	
    }

private static String cadastrarTarefa(String codigo, String descricao, int inicio, int fim) {
	int duracao =  fim - inicio;
	int tempoDisponivel = 8
	int tempoRestante = tempoDisponivel - duracao;
	return String.format("%s - %s - %d - %d - %d - %d\n", codigo, descricao, inicio, fim, duracao, tempoRestante);
	tempoDisponivel -= tempoDisponivel;
  }


}
