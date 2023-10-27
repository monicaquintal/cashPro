package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Usuario;
import jdbc.DBManager;

public class UsuarioDAO {
	
	private Connection conexao;
	
	// Cadastrar
	
    public void cadastrar(Usuario usuario) {
        PreparedStatement stmt = null;
    
        try {
          conexao = DBManager.obterConexao();
          String sql = "INSERT INTO T_CASHPRO_CLIENTES(ID_CLIENTE, DS_EMAIL, DS_LOGIN, DS_SENHA) VALUES (SQ_CLIENTE.NEXTVAL, ?, ?, ?)";
          stmt = conexao.prepareStatement(sql);
          stmt.setString(1, usuario.getEmail());
          stmt.setString(2, usuario.getLogin());
          stmt.setString(3, usuario.getSenha());
    
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
    
    public List<Usuario> getAll() {
        //Cria uma lista de colaboradores
        List<Usuario> lista = new ArrayList<Usuario>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.obterConexao();
          stmt = conexao.prepareStatement("SELECT * FROM T_CASHPRO_CLIENTES");
          rs = stmt.executeQuery();
      
	      //Percorre todos os registros encontrados
	      while (rs.next()) {
			    int id_cliente = rs.getInt("ID_CLIENTE");
			    String email = rs.getString("DS_EMAIL");
			    String login = rs.getString("DS_LOGIN");
			    String senha = rs.getString("DS_SENHA");
			    
			    Usuario usuario = new Usuario(id_cliente, email, login, senha);
			    //Adiciona o colaborador na lista
			    lista.add(usuario);
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
    
    // Remover
    
    public void remover(int id_cliente){
        PreparedStatement stmt = null;
      
        try {
          conexao = DBManager.obterConexao();
          String sql = "DELETE FROM T_CASHPRO_CLIENTES WHERE ID_CLIENTE = ?";
          stmt = conexao.prepareStatement(sql);
          stmt.setInt(1, id_cliente);
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
    
    // Buscar por id
    
    public Usuario buscarPorID(int id_cliente){
	    Usuario usuario = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    
	    try {
	      conexao = DBManager.obterConexao();
	      stmt = conexao.prepareStatement("SELECT * FROM T_CASHPRO_CLIENTES WHERE ID_CLIENTE = ?");
	      stmt.setInt(1, id_cliente);
	      rs = stmt.executeQuery();
	    
	      if (rs.next()){
			  String email = rs.getString("DS_EMAIL");
			  String login = rs.getString("DS_LOGIN");
			  String senha = rs.getString("DS_SENHA");
			  usuario = new Usuario(id_cliente, email, login, senha);
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
	    
	    return usuario;
	    
    }
    
    // Atualizar
    
    public void atualizar(Usuario usuario){
        PreparedStatement stmt = null;
      
        try {
          conexao = DBManager.obterConexao();
          String sql = "UPDATE T_CASHPRO_CLIENTES SET DS_EMAIL = ?, DS_LOGIN = ?, DS_SENHA = ? WHERE ID_CLIENTE = ?";
          stmt = conexao.prepareStatement(sql);
          stmt.setString(1, usuario.getEmail());
          stmt.setString(2, usuario.getLogin());
          stmt.setString(3, usuario.getSenha());
          stmt.setInt(4, usuario.getID());
      
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
    
    
}
