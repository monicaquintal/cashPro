package test;

import java.util.List;

import DAO.ContaCorrenteDAO;
import bean.ContaCorrente;

public class TesteContaCorrente {
	
	public static void main(String[] args) {
	      //Instancia o DAO
	      ContaCorrenteDAO dao = new ContaCorrenteDAO();
	  
	      //Instancia o Colaborador
	      ContaCorrente cc = new ContaCorrente();

          cc.setPossuiLimite(true);
          cc.setLimite(0);
          cc.setTaxaManutencao(0);
          cc.setIDConta(4);

	      //Cadastra no banco de dados
	      dao.cadastrar(cc);
	  
	      System.out.println("Cadastrado!");
	     
	      List<ContaCorrente> lista = dao.getAll();
	      for (ContaCorrente item : lista) {
	      
          System.out.println(item.getIDCC() + " " + item.getPossuiLimite() + " " + item.getLimite() + " " + item.getTaxaManutencao() + " " + item.getIDConta());
	     
	    }
	}
	
}
