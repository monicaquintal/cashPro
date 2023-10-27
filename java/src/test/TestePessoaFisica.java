package test;

import java.util.List;

import DAO.UsuarioPessoaFisicaDAO;
import bean.UsuarioPessoaFisica;

public class TestePessoaFisica {
	
	public static void main(String[] args) {
	      //Instancia o DAO
	      UsuarioPessoaFisicaDAO dao = new UsuarioPessoaFisicaDAO();
	  
	      //Instancia o Colaborador
	      UsuarioPessoaFisica pf = new UsuarioPessoaFisica();

          pf.setIDCliente(4);
          pf.setNome("Teste");
          pf.setSobrenome("03");
          pf.setCpf(23456103);          
          
	      //Cadastra no banco de dados
	      dao.cadastrar(pf);
	  
	      System.out.println("Cadastrado!");
	      
	      List<UsuarioPessoaFisica> lista = dao.getAll();
	      for (UsuarioPessoaFisica item : lista) {
	      
          System.out.println(item.getIDCliente() + " " + item.getNome() + " " + item.getSobrenome() + " " + item.getCpf());
	      
	     
	    }
	}
	
}
