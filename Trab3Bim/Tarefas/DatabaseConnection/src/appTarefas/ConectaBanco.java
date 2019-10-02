package appTarefas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBanco {
	private String usuario = "root";
	private String senha = "univille";
	private static ConectaBanco instance;
	
	private ConectaBanco() {}
	
	public static ConectaBanco getInstance() {
		if(instance == null) {
			instance = new ConectaBanco();
		}
		return instance;
	}
	
	public Connection getConnection() {
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AplicativoDeTarefas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					usuario, 
					senha);
			
			return conn;
			}catch(SQLException e){
				throw new RuntimeException(e);
		}
	}
}
