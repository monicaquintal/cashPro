package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	public static Connection obterConexao() {
		
		Connection conexao = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "login", "senha");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}
	
	public static void main(String[] args) {
	      try {
	        //Registra o Driver
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	  
	        //Abre uma conexão
	        Connection conexao = DriverManager.getConnection(
	            "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM97647", "291291");
	        
	        System.out.println("Conectado!");
	        
	        //Fecha a conexão
	        conexao.close();
	        
	      //Tratamento de erro 
	      } catch (SQLException e) {
	        System.err.println("Não foi possível conectar no Banco de Dados");
	        e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	        System.err.println("O Driver JDBC não foi encontrado!");
	        e.printStackTrace();
	      }
	    }
	
}
	
