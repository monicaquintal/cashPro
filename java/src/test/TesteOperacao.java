package test;

import java.util.Calendar;
import java.util.List;

import DAO.OperacaoDAO;
import bean.Operacao;

public class TesteOperacao {
	
	public static void main(String[] args) {
	      //Instancia o DAO
	      OperacaoDAO dao = new OperacaoDAO();
	  
	      //Instancia o Colaborador
	      Operacao operacao = new Operacao();
	      
          operacao.setValor(200);
          operacao.setData(Calendar.getInstance());
          operacao.setTipo("despesa");
          operacao.setCategoria("alimentação");
          operacao.setIDCconta(2);
          operacao.setIDCliente(2);

	      //Cadastra no banco de dados
	      dao.cadastrar(operacao);
	  
	      System.out.println("Cadastrado!");
	      
	      List<Operacao> lista = dao.getAll();
	      for (Operacao item : lista) {
	      
          System.out.println(item.getIDOperacao() + " " + item.getValor() + " " + item.getData() + " " + item.getTipo() + " " + item.getCategoria() + " " + item.getIDCconta() + " " + item.getIDCliente());
	      
	     
	    }
	}
}
