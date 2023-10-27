package test;

import java.util.List;

import DAO.ContaPoupancaDAO;
import bean.ContaPoupanca;

public class TesteContaPoupanca {
	
	public static void main(String[] args) {
	      //Instancia o DAO
	      ContaPoupancaDAO dao = new ContaPoupancaDAO();
	  
	      //Instancia o Colaborador
	      ContaPoupanca cp = new ContaPoupanca();

          cp.setTaxaJurosAnual(0.9f);
          cp.setIDConta(2);

	      //Cadastra no banco de dados
	      dao.cadastrar(cp);
	  
	      System.out.println("Cadastrado!");
	      
	      List<ContaPoupanca> lista = dao.getAll();
	      for (ContaPoupanca item : lista) {
	      
          System.out.println(item.getIDCP() + " " + item.getTaxaJurosAnual() + " " + item.getIDConta());
	      
	     
	    }
	}
	
}
