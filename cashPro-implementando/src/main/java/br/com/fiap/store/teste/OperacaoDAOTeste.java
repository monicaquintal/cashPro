package br.com.fiap.store.teste;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.store.bean.Operacao;
import br.com.fiap.store.dao.OperacaoDAO;
import br.com.fiap.store.exception.DBException;
import br.com.fiap.store.factory.DAOFactory;

public class OperacaoDAOTeste {

	public static void main(String[] args) {
		OperacaoDAO dao = DAOFactory.getOperacaoDAO();
		
		//Cadastrar um produto
		Operacao operacao = new Operacao(1,200,Calendar.getInstance(),"receita", "pix", 1, 1);
		
		try {
			dao.cadastrar(operacao);
			System.out.println("Operação cadastrada!");
		} catch (DBException e) {
			e.printStackTrace();
		}

		//Buscar um produto pelo código e atualizar
		operacao = dao.buscar(3);
		operacao.setCategoria("despesa");
		operacao.setValor(300);
		try {
			dao.atualizar(operacao);
			System.out.println("Operação atualizada.");
		} catch (DBException e) {
			e.printStackTrace();
		} 
		
		//Listar os produtos
		List<Operacao> lista = dao.listar();
		for (Operacao item : lista) {
			System.out.println(item.getIDOperacao() + " " + item.getValor() + " " + item.getData() + " " + item.getTipo() + " " + item.getCategoria());
		}
		
		// Remover um produto
		try {
			dao.remover(1);
			System.out.println("Produto removido.");
		} catch (DBException e) {
			e.printStackTrace();
		}	
	}
}