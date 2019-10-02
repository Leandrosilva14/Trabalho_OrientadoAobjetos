package appTarefas;
import java.sql.Connection;

public abstract class BaseDAO {
	public Connection getConnection() {
		return ConectaBanco.getInstance().getConnection();
	}
}
