package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.UsuarioPessoaFisica;
import jdbc.DBManager;

public class UsuarioPessoaFisicaDAO {
	
	private Connection conexao;
	
	// Cadastrar
	
    public void cadastrar(UsuarioPessoaFisica usuariopf) {
        PreparedStatement stmt = null;
    
        try {
          conexao = DBManager.obterConexao();
          String sql = "INSERT INTO T_CASHPRO_PESSOA_FISICA(ID_CLIENTE, PF_NOME, PF_SOBRENOME, PF_CPF) VALUES (?, ?, ?, ?)";
          stmt = conexao.prepareStatement(sql);
          stmt.setInt(1, usuariopf.getIDCliente());
          stmt.setString(2, usuariopf.getNome());
          stmt.setString(3, usuariopf.getSobrenome());
          stmt.setInt(4, usuariopf.getCpf());
    
          stmt.executeUpdate();
        } catch (SQLException e) {
          e.printStackTrace();
        } finally {
          try {
            stmt.close();
            conexao.close();
          } catch (SQLException e) {
            e.printStackTrace();
          }
        }
      }
    
    // Listar
    
    public List<UsuarioPessoaFisica> getAll() {
        //Cria uma lista de colaboradores
        List<UsuarioPessoaFisica> lista = new ArrayList<UsuarioPessoaFisica>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.obterConexao();
          stmt = conexao.prepareStatement("SELECT * FROM T_CASHPRO_PESSOA_FISICA");
          rs = stmt.executeQuery();
      
	      //Percorre todos os registros encontrados
	      while (rs.next()) {
			    int id_cliente = rs.getInt("ID_CLIENTE");
			    String nome = rs.getString("PF_NOME");
			    String sobrenome = rs.getString("PF_SOBRENOME");
			    int cpf = rs.getInt("PF_CPF");
			    
			    UsuarioPessoaFisica usuariopf = new UsuarioPessoaFisica(id_cliente, nome, sobrenome, cpf);
			    //Adiciona o colaborador na lista
			    lista.add(usuariopf);
	       }
	      
        } catch (SQLException e) {
        	
          e.printStackTrace();
          
        } finally {
        	
          try {
        	  
            stmt.close();
            rs.close();
            conexao.close();
            
          } catch (SQLException e) {
        	  
            e.printStackTrace();
            
          }
        }
        
        return lista;
      }
}
