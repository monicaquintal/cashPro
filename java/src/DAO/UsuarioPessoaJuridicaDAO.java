package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.UsuarioPessoaJuridica;
import jdbc.DBManager;

public class UsuarioPessoaJuridicaDAO {

private Connection conexao;
	
	// Cadastrar
	
    public void cadastrar(UsuarioPessoaJuridica usuariopj) {
        PreparedStatement stmt = null;
    
        try {
          conexao = DBManager.obterConexao();
          String sql = "INSERT INTO T_CASHPRO_PESSOA_JURIDICA(ID_CLIENTE, PJ_CNPJ, PJ_RAZAO_SOCIAL) VALUES (?, ?, ?)";
          stmt = conexao.prepareStatement(sql);
          stmt.setInt(1, usuariopj.getIDCliente());
          stmt.setInt(2, usuariopj.getCnpj());
          stmt.setString(3, usuariopj.getRazaoSocial());
    
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
    
    public List<UsuarioPessoaJuridica> getAll() {
        //Cria uma lista de colaboradores
        List<UsuarioPessoaJuridica> lista = new ArrayList<UsuarioPessoaJuridica>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.obterConexao();
          stmt = conexao.prepareStatement("SELECT * FROM T_CASHPRO_PESSOA_JURIDICA");
          rs = stmt.executeQuery();
      
	      //Percorre todos os registros encontrados
	      while (rs.next()) {
			    int id_cliente = rs.getInt("ID_CLIENTE");
			    int cnpj = rs.getInt("PJ_CNPJ");
			    String razaoSocial = rs.getString("PJ_RAZAO_SOCIAL");
			    
			    UsuarioPessoaJuridica usuariopj = new UsuarioPessoaJuridica (razaoSocial, cnpj, id_cliente);
			    
			    lista.add(usuariopj);
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
