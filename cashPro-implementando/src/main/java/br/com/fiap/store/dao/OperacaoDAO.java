package br.com.fiap.store.dao;

import java.util.List;
import br.com.fiap.store.bean.Operacao;
import br.com.fiap.store.exception.DBException;

public interface OperacaoDAO {
	
	void cadastrar(Operacao operacao) throws DBException;
	void atualizar(Operacao operacao) throws DBException;
	void remover(int codigo) throws DBException;
	Operacao buscar(int id_operacao);
	List<Operacao> listar();
}