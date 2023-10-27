package test;

import java.util.List;

import DAO.ContaDAO;
import bean.Conta;

public class TesteConta {
	
	public static void main(String[] args) {
	      //Instancia o DAO
	      ContaDAO dao = new ContaDAO();
	  
	      //Instancia o Colaborador
	      Conta conta = new Conta();
	      
          conta.setAgencia(233);
          conta.setCC(1);
          conta.setIDCliente(4);
          conta.setBanco(4);

	      //Cadastra no banco de dados
	      dao.cadastrar(conta);
	  
	      System.out.println("Cadastrado!");
	      
	      System.out.println("ID Conta | Agencia | CC | Banco | Cliente");
	      List<Conta> lista = dao.getAll();
	      for (Conta item : lista) {
	      
          System.out.println(item.getIDConta() + " " + item.getAgencia() + " " + item.getCC() + " " + item.getBanco() + " " + item.getIDCliente());
   
	     
	    }
	
	}
}
