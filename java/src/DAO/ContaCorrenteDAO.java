package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.ContaCorrente;
import jdbc.DBManager;

public class ContaCorrenteDAO {

	private Connection conexao;
	
	// Cadastrar
	
    public void cadastrar(ContaCorrente cc) {
        PreparedStatement stmt = null;
    
        try {
          conexao = DBManager.obterConexao();
          String sql = "INSERT INTO T_CASHPRO_CONTA_CORRENTE(ID_CONTA_CORRENTE, DS_POSSUI_LIMITE, VL_LIMITE, VL_TAXA_MANUTENCAO, ID_CONTA) VALUES (SQ_CC.NEXTVAL, ?, ?, ?, ?)";
          stmt = conexao.prepareStatement(sql);
   
          stmt.setBoolean(1, cc.getPossuiLimite());
          stmt.setFloat(2, cc.getLimite());
          stmt.setFloat(3, cc.getTaxaManutencao());
          stmt.setInt(4, cc.getIDConta());
    
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
    
    public List<ContaCorrente> getAll() {
        //Cria uma lista de colaboradores
        List<ContaCorrente> lista = new ArrayList<ContaCorrente>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.obterConexao();
          stmt = conexao.prepareStatement("SELECT * FROM T_CASHPRO_CONTA_CORRENTE");
          rs = stmt.executeQuery();
      
	      //Percorre todos os registros encontrados
	      while (rs.next()) {
	    	  int id_conta_corrente = rs.getInt("ID_CONTA_CORRENTE");
	    	  boolean possuiLimite = rs.getBoolean("DS_POSSUI_LIMITE");
	    	  float limite = rs.getFloat("VL_LIMITE");
	    	  float taxaManutencao = rs.getFloat("VL_TAXA_MANUTENCAO");
	    	  int id_conta = rs.getInt("ID_CONTA");
			    
	    	  ContaCorrente cc = new ContaCorrente (id_conta_corrente, possuiLimite, limite, taxaManutencao, id_conta);
			   
			  lista.add(cc);
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
