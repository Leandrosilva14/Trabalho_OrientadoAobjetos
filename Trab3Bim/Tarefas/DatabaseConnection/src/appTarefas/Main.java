package appTarefas;


public class Main {

	public static void main(String[] args) {
		TarefasDAO tarefaDAO = new TarefasDAO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		PrioridadesDAO prioridadeDAO = new PrioridadesDAO();

		Tarefas tarefa = new Tarefas();
		tarefa.setNomeTarefa("Treino de perna em 5 horas");
		Usuario user = new Usuario();
		user.setNome("Ricardo");
		user.setSobrenome("de Souza");
		tarefa.setTarefaStatus(1);

		usuarioDAO.Insert(user);
		tarefaDAO.insert(tarefa, prioridadeDAO.getById(1).getId(), usuarioDAO.getById(1));

		for(Usuario usuario : usuarioDAO.getAll()) {
			System.out.println(usuario.getNome() + " " + usuario.getSobrenome());
		}
		System.out.println();
		System.out.println(usuarioDAO.getById(1).getNome());
		System.out.println();
		System.out.println("ID" + "" + "Descricao da Tarefa     " + "NIvel de prioridade" + " "+ "Descricao Prioridade" + "   Reponsavel  ");
		for(GetTask tarefas : tarefaDAO.getAll()) {
			System.out.println(tarefas.getId() + " " + tarefas.getNome_tarefa() + "         " + tarefas.getNivel_Pri() + "               " + tarefas.getDescricao_Pri() + "       "  + tarefas.getResponsavel());
		}

		tarefaDAO.delete(1);

		System.out.println();
		for(Usuario usuario : usuarioDAO.getAll()) {
			System.out.println(usuario.getNome() + " " + usuario.getSobrenome());
		}
		System.out.println();
		System.out.println("ID" + "" + "Descricao da Tarefa     " + "NIvel de prioridade" + " "+ "Descricao Prioridade" + "   Reponsavel  ");
		for(GetTask tarefas : tarefaDAO.getAll()) {
			System.out.println(tarefas.getId() + " " + tarefas.getNome_tarefa() + "         " + tarefas.getNivel_Pri() + "                " + tarefas.getDescricao_Pri() + "      "  + tarefas.getResponsavel());
		}

		tarefa.setNomeTarefa("Limpar piscina em 8 horas");
		user.setNome("Luis");
		user.setSobrenome("de Souza");
		tarefa.setTarefaStatus(2);

		usuarioDAO.Insert(user);
		tarefaDAO.insert(tarefa, prioridadeDAO.getById(3).getId(), usuarioDAO.getById(2));


		for(Usuario usuario : usuarioDAO.getAll()) {
			System.out.println(usuario.getNome() + " " + usuario.getSobrenome());
		}
		System.out.println();
		System.out.println(usuarioDAO.getById(2).getNome());
		System.out.println();
		System.out.println("ID" + "" + "Descricao da Tarefa     " + "NIvel de prioridade" + " "+ "Descricao Prioridade" + "   Reponsavel  ");
		for(GetTask tarefas : tarefaDAO.getAll()) {
			System.out.println(tarefas.getId() + " " + tarefas.getNome_tarefa() + "        " + tarefas.getNivel_Pri() + "                 " + tarefas.getDescricao_Pri() + "       "  + tarefas.getResponsavel());
		}

		user.setId(usuarioDAO.getById(2).getId());
		user.setNome("Joao");
		usuarioDAO.update(user);
		tarefa.setId(tarefaDAO.getById(2).getId());
		tarefa.setTarefaStatus(0);
		tarefaDAO.update(tarefa, prioridadeDAO.getById(3).getId(), user);

		System.out.println();
		for(Usuario usuario : usuarioDAO.getAll()) {
			System.out.println(usuario.getNome() + " " + usuario.getSobrenome());
		}
		System.out.println();
		System.out.println("ID" + "" + "Descricao da Tarefa     " + "NIvel de prioridade" + " "+ "Descricao Prioridade" + "  Reponsavel  ");
		for(GetTask tarefas : tarefaDAO.getAll()) {
			System.out.println(tarefas.getId() + " " + tarefas.getNome_tarefa() + "         " + tarefas.getNivel_Pri() + "               " + tarefas.getDescricao_Pri() + "       "  + tarefas.getResponsavel());
		}

	}

}