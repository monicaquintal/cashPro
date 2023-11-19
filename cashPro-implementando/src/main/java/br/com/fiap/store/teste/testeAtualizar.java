package br.com.fiap.store.teste;

import br.com.fiap.store.bean.Operacao;
import br.com.fiap.store.dao.OperacaoDAO;
import br.com.fiap.store.exception.DBException;
import br.com.fiap.store.factory.DAOFactory;

public class testeAtualizar {
	public static void main(String[] args) {
		OperacaoDAO dao = DAOFactory.getOperacaoDAO();
	
	//Buscar um produto pelo código e atualizar
			Operacao operacao = dao.buscar(35);
			operacao.setCategoria("Despesa");
			operacao.setValor(200);
			try {
				dao.atualizar(operacao);
				System.out.println("Operação atualizada.");
			} catch (DBException e) {
				e.printStackTrace();
			} 
	}
}
