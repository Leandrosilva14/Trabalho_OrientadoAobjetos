package appTarefas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TarefasDAO extends BaseDAO {
	public void insert (Tarefas tarefa, int prioridadeId, Usuario user) {
		String sql = "insert into Tarefas (Nome_tarefa, FK_Pri, FK_Resp, Tarefa_status) values "
				+ "(?, (select id from prioridade where Nivel_pri = ?), (select id from usuario where Nome = ?"
				+ " and Sobrenome = ?), ?)";
		try {
			try (Connection conn = getConnection(); 
					PreparedStatement p = conn.prepareStatement(sql)){
				p.setString(1, tarefa.getNomeTarefa());
				p.setInt(2, prioridadeId);
				p.setString(3, user.getNome());
				p.setString(4, user.getSobrenome());
				p.setInt(5, tarefa.getTarefaStatus());
				p.execute();
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update (Tarefas tarefa, int prioridadeId, Usuario user) {
		String sql = "update Tarefas set Nome_tarefa = ?, FK_Pri = ?, FK_Resp = (select id from usuario where"
				+ " Nome = ? and Sobrenome = ?), Tarefa_status = ? where id = ?";
		try {
			try (Connection conn = getConnection();
					PreparedStatement p = conn.prepareStatement(sql)){
				p.setString(1, tarefa.getNomeTarefa());
				p.setInt(2, prioridadeId);
				p.setString(3, user.getNome());
				p.setString(4, user.getSobrenome());
				p.setInt(5, tarefa.getTarefaStatus());
				p.setInt(6, tarefa.getId());
				
				p.execute();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void delete (int id) {
		String sql = "delete from Tarefas where id = ?";
		try {
			try(Connection conn = getConnection();
					PreparedStatement p = conn.prepareStatement(sql)){
				p.setInt(1, id);
				
				p.execute();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public GetTask getById(int id) {
		String sql = "select task.id, task.Nome_tarefa, pri.Nivel_pri, pri.Descricao_Pri, "
				+ "concat(usu.Nome, concat(' ', usu.Sobrenome)) as Responsavel "
				+ "from tarefas as task "
				+ "inner join prioridade as pri "
				+ "on task.FK_pri = pri.id "
				+ "inner join usuario as usu "
				+ "on task.FK_Resp = usu.id "
				+ "where task.id = ?";
		GetTask tarefa = null;
		try {
			try(Connection conn = getConnection();
					PreparedStatement p = conn.prepareStatement(sql)){
				p.setInt(1, id);
				
				ResultSet result = p.executeQuery();
				if(result.next()) {
					tarefa = new GetTask();
					tarefa.setId(result.getInt(1));
					tarefa.setNome_tarefa(result.getString(2));
					tarefa.setNivel_Pri(result.getInt(3));
					tarefa.setDescricao_Pri(result.getString(4));
					tarefa.setResponsavel(result.getString(5));
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return tarefa;
	}
	public List<GetTask> getAll(){
		String sql = "select task.id, task.Nome_tarefa, pri.Nivel_pri, pri.Descricao_Pri, "
				+ "concat(usu.Nome, concat(' ', usu.Sobrenome)) as Responsavel "
				+ "from tarefas as task "
				+ "inner join prioridade as pri "
				+ "on task.FK_pri = pri.id "
				+ "inner join usuario as usu "
				+ "on task.FK_Resp = usu.id";
		GetTask tarefa = null;
		List<GetTask> list = new ArrayList<GetTask>();
		try {
			try (Connection conn = getConnection();
					PreparedStatement p = conn.prepareStatement(sql)){
				ResultSet result = p.executeQuery();
				while(result.next()) {
					tarefa = new GetTask();
					tarefa.setId(result.getInt(1));
					tarefa.setNome_tarefa(result.getString(2));
					tarefa.setNivel_Pri(result.getInt(3));
					tarefa.setDescricao_Pri(result.getString(4));
					tarefa.setResponsavel(result.getString(5));
					list.add(tarefa);
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
