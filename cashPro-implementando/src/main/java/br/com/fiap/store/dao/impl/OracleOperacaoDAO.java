package br.com.fiap.store.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.store.bean.Operacao;
import br.com.fiap.store.dao.OperacaoDAO;
import br.com.fiap.store.exception.DBException;
import br.com.fiap.store.singleton.ConnectionManager;

public class OracleOperacaoDAO implements OperacaoDAO{

	private Connection conexao;
	
	@Override
	public void cadastrar(Operacao operacao) throws DBException {
		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO T_CASHPRO_TRANSACOES(ID_TRANSACAO, VL_TRANSACAO, DT_TRANSACAO, TP_TRANSACAO, CT_TRANSACAO, T_CONTAS_ID, T_ID_CLIENTE) VALUES (SQ_OPERACOES.NEXTVAL, ?, ?, ?, ?, ?, ?)";
	          stmt = conexao.prepareStatement(sql);
	   
	          stmt.setDouble(1, operacao.getValor());
	          java.sql.Date data = new java.sql.Date(operacao.getData().getTimeInMillis());
	          stmt.setDate(2, data);
	          stmt.setString(3, operacao.getTipo());
	          stmt.setString(4, operacao.getCategoria());
	          stmt.setInt(5, operacao.getIDCliente());
	          stmt.setInt(6, operacao.getIDConta());
	    
	          stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastradar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void atualizar(Operacao operacao) throws DBException {
		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "UPDATE T_CASHPRO_TRANSACOES SET VL_TRANSACAO = ?, DT_TRANSACAO = ?, TP_TRANSACAO = ?, CT_TRANSACAO = ? WHERE ID_TRANSACAO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setDouble(1, operacao.getValor());
			java.sql.Date data = new java.sql.Date(operacao.getData().getTimeInMillis());
			stmt.setDate(2, data);
			stmt.setString(3, operacao.getTipo());
			stmt.setString(4, operacao.getCategoria());
			stmt.setInt(5, operacao.getIDOperacao());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao atualizar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void remover(int id_operacao) throws DBException {
			PreparedStatement stmt = null;

			try {
				conexao = ConnectionManager.getInstance().getConnection();
				String sql = "DELETE FROM T_CASHPRO_TRANSACOES WHERE ID_TRANSACAO = ?";
				stmt = conexao.prepareStatement(sql);
				stmt.setInt(1, id_operacao);
				stmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DBException("Erro ao remover.");
			} finally {
				try {
					stmt.close();
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	@Override
	public Operacao buscar (int id_operacao) {
		Operacao operacao = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_CASHPRO_TRANSACOES WHERE ID_TRANSACAO = ?");
			stmt.setInt(1, id_operacao);
			rs = stmt.executeQuery();

			if (rs.next()){
				int codigo = rs.getInt("ID_TRANSACAO");
				Double valor = rs.getDouble("VL_TRANSACAO");
				java.sql.Date data = rs.getDate("DT_TRANSACAO");
				Calendar data_operacao = Calendar.getInstance();
				data_operacao.setTimeInMillis(data.getTime());
				String tipo = rs.getString("TP_TRANSACAO");
				String categoria = rs.getString("CT_TRANSACAO");
				int id_conta = rs.getInt("T_CONTAS_ID");
				int id_cliente = rs.getInt("T_ID_CLIENTE");		
				
				operacao = new Operacao(codigo, valor, data_operacao, tipo, categoria, id_conta, id_cliente);

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return operacao;
	}

	@Override
	public List<Operacao> listar() {
		List<Operacao> lista = new ArrayList<Operacao>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_CASHPRO_TRANSACOES ORDER BY DT_TRANSACAO DESC");
			rs = stmt.executeQuery();

			//Percorre todos os registros encontrados
			while (rs.next()) {
				int codigo = rs.getInt("ID_TRANSACAO"); 
				Double valor = rs.getDouble("VL_TRANSACAO");
				java.sql.Date data = rs.getDate("DT_TRANSACAO");
				Calendar data_operacao = Calendar.getInstance();
				data_operacao.setTimeInMillis(data.getTime());
				String tipo = rs.getString("TP_TRANSACAO");
				String categoria = rs.getString("CT_TRANSACAO");
				/* int id_conta = rs.getInt("T_CONTAS_ID");
				int id_cliente = rs.getInt("T_ID_CLIENTE");*/
				
				Operacao operacao = new Operacao(codigo, valor, data_operacao, tipo, categoria, 1, 1);
				lista.add(operacao);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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