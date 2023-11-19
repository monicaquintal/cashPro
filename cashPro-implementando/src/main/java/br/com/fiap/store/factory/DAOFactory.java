package br.com.fiap.store.factory;

import br.com.fiap.store.dao.OperacaoDAO;
import br.com.fiap.store.dao.impl.OracleOperacaoDAO;

public class DAOFactory {
	public static OperacaoDAO getOperacaoDAO() {
		return new OracleOperacaoDAO();
	}
}