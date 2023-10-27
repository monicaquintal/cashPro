package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Conta;
import jdbc.DBManager;

public class ContaDAO {

	private Connection conexao;
	
	// Cadastrar
	
    public void cadastrar(Conta conta) {
        PreparedStatement stmt = null;
    
        try {
          conexao = DBManager.obterConexao();
          String sql = "INSERT INTO T_CASHPRO_CONTAS(ID_CONTA, AG_CLIENTE, CC_CLIENTE, T_CLIENTES_ID, T_INSTITUICOES_ID) VALUES (SQ_CONTAS.NEXTVAL, ?, ?, ?, ?)";
          stmt = conexao.prepareStatement(sql);
   
          stmt.setInt(1, conta.getAgencia());
          stmt.setInt(2, conta.getCC());
          stmt.setInt(3, conta.getIDCliente());
          stmt.setInt(4, conta.getBanco());
    
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
    
    public List<Conta> getAll() {
        //Cria uma lista de colaboradores
        List<Conta> lista = new ArrayList<Conta>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
          conexao = DBManager.obterConexao();
          stmt = conexao.prepareStatement("SELECT * FROM T_CASHPRO_CONTAS");
          rs = stmt.executeQuery();
      
	      //Percorre todos os registros encontrados
	      while (rs.next()) {
			    int id_cliente = rs.getInt("ID_CONTA");
			    int agencia = rs.getInt("AG_CLIENTE");
			    int contacorrente = rs.getInt("CC_CLIENTE");
			    int id_clientes = rs.getInt("T_CLIENTES_ID");
			    int banco = rs.getInt("T_INSTITUICOES_ID");
			    
			    Conta conta = new Conta(id_cliente, agencia, contacorrente, id_clientes, banco);
			    //Adiciona o colaborador na lista
			    lista.add(conta);
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
