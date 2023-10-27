package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.ContaPoupanca;
import jdbc.DBManager;

public class ContaPoupancaDAO {

	private Connection conexao;
	
	// Cadastrar
	
    public void cadastrar(ContaPoupanca cp) {
        PreparedStatement stmt = null;
    
        try {
          conexao = DBManager.obterConexao();
          String sql = "INSERT INTO T_CASHPRO_CONTA_POUPANCA(ID_CONTA_POUPANCA, CP_TAXA_JUROS, ID_CONTA) VALUES (SQ_CP.NEXTVAL, ?, ?)";
          stmt = conexao.prepareStatement(sql);
   
          stmt.setFloat(1, cp.getTaxaJurosAnual());
          stmt.setInt(2, cp.getIDConta());
    
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
    
    public List<ContaPoupanca> getAll() {
        
        List<ContaPoupanca> lista = new ArrayList<ContaPoupanca>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.obterConexao();
          stmt = conexao.prepareStatement("SELECT * FROM T_CASHPRO_CONTA_POUPANCA");
          rs = stmt.executeQuery();
      
	      //Percorre todos os registros encontrados
	      while (rs.next()) {

	    	  int id_conta_poupanca = rs.getInt("ID_CONTA_POUPANCA");
	    	  float taxaJurosAnual = rs.getFloat("CP_TAXA_JUROS");
	    	  int id_conta = rs.getInt("ID_CONTA");
	    	  
			    
			    ContaPoupanca cp = new ContaPoupanca(id_conta_poupanca, taxaJurosAnual, id_conta);
			   
			    lista.add(cp);
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
