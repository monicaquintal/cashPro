package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import bean.Operacao;
import jdbc.DBManager;

public class OperacaoDAO {

	private Connection conexao;
	
	// Cadastrar
	
    public void cadastrar(Operacao operacao) {
        PreparedStatement stmt = null;
    
        try {
          conexao = DBManager.obterConexao();
          String sql = "INSERT INTO T_CASHPRO_TRANSACOES(ID_TRANSACAO, VL_TRANSACAO, DT_TRANSACAO, TP_TRANSACAO, CT_TRANSACAO, T_CONTAS_ID, T_ID_CLIENTE) VALUES (SQ_OPERACOES.NEXTVAL, ?, ?, ?, ?, ?, ?)";
          stmt = conexao.prepareStatement(sql);
   
          stmt.setDouble(1, operacao.getValor());
          java.sql.Date data = new java.sql.Date(operacao.getData().getTimeInMillis());
          stmt.setDate(2, data);
          stmt.setString(3, operacao.getTipo());
          stmt.setString(4, operacao.getCategoria());
          stmt.setInt(5, operacao.getIDCconta());
          stmt.setInt(6, operacao.getIDCliente());
    
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
    
    public List<Operacao> getAll() {
        //Cria uma lista de colaboradores
        List<Operacao> lista = new ArrayList<Operacao>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.obterConexao();
          stmt = conexao.prepareStatement("SELECT * FROM T_CASHPRO_TRANSACOES");
          rs = stmt.executeQuery();
      
	      //Percorre todos os registros encontrados
	      while (rs.next()) {
	    	  	int id_operacao = rs.getInt("ID_TRANSACAO");
	        	double valor = rs.getDouble("VL_TRANSACAO");
	        	java.sql.Date data = rs.getDate("DT_TRANSACAO");
	            Calendar data_operacao = Calendar.getInstance();
	            data_operacao.setTimeInMillis(data.getTime());
	            String tipo = rs.getString("TP_TRANSACAO");
				String categoria = rs.getString("CT_TRANSACAO");
				int id_conta = rs.getInt("T_CONTAS_ID");
				int id_cliente = rs.getInt("T_ID_CLIENTE");
			    
			    Operacao operacao = new Operacao(id_operacao, valor, data_operacao, tipo, categoria, id_conta, id_cliente);
			    //Adiciona o colaborador na lista
			    lista.add(operacao);
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
	

