package test;

import DAO.UsuarioDAO;
import bean.Usuario;

public class TesteCadastro {

	public static void main(String[] args) {
	      //Instancia o DAO
	      UsuarioDAO dao = new UsuarioDAO();
	  
	      //Instancia o Colaborador
	      Usuario usuario = new Usuario();
	      usuario.setEmail("teste7@teste.com");
	      usuario.setLogin("teste7");
	      usuario.setSenha("1234597");

	      //Cadastra no banco de dados
	      dao.cadastrar(usuario);
	  
	      System.out.println("Cadastrado!");
	    }
	
}
