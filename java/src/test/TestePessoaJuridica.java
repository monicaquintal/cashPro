package test;

import java.util.List;

import DAO.UsuarioPessoaJuridicaDAO;
import bean.UsuarioPessoaJuridica;

public class TestePessoaJuridica {
	
	public static void main(String[] args) {
	      //Instancia o DAO
	      UsuarioPessoaJuridicaDAO dao = new UsuarioPessoaJuridicaDAO();
	  
	      //Instancia o Colaborador
	      UsuarioPessoaJuridica pf = new UsuarioPessoaJuridica();

          pf.setIDCliente(2);
          pf.setCnpj(123433780);
          pf.setRazaoSocial("Empresa B");  
          
	      //Cadastra no banco de dados
	      dao.cadastrar(pf);
	  
	      System.out.println("Cadastrado!");
	      
	      List<UsuarioPessoaJuridica> lista = dao.getAll();
	      for (UsuarioPessoaJuridica item : lista) {
	      
          System.out.println(item.getIDCliente() + " " + item.getCnpj() + " " + item.getRazaoSocial());
	     
	    }
	}
	
}
