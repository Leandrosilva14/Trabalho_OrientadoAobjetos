package appTarefas;

public class GetTask {
	private String Nome_tarefa;
	private int Nivel_Pri;
	private int id;
	private String Responsavel;
	private String Descricao_Pri;

	

	public void setNome_tarefa(String nome_tarefa) {
		Nome_tarefa = nome_tarefa;
	}
	public void setNivel_Pri(int nivel_Pri) {
		Nivel_Pri = nivel_Pri;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setResponsavel(String responsavel) {
		Responsavel = responsavel;
	}
	public void setDescricao_Pri(String descricao_Pri) {
		Descricao_Pri = descricao_Pri;
	}
	public String getNome_tarefa() {
		return Nome_tarefa;
	}
	public int getNivel_Pri() {
		return Nivel_Pri;
	}
	public int getId() {
		return id;
	}
	public String getResponsavel() {
		return Responsavel;
	}
	public String getDescricao_Pri() {
		return Descricao_Pri;
	}
}
