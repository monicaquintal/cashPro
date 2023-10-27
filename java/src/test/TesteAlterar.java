package test;

import DAO.UsuarioDAO;
import bean.Usuario;

public class TesteAlterar {

	public static void main(String[] args) {
		  
	      UsuarioDAO dao = new UsuarioDAO();
	      //Recupera o colaborador com código 1
	      Usuario usuario = dao.buscarPorID(1);
	      //Imprime os valores do colaborador
	      System.out.println(usuario.getID() + " " + usuario.getEmail() + " " + usuario.getLogin() + " " + usuario.getSenha());
	      //Altera os valores de alguns atributos do colaborador
	      usuario.setEmail("teste_atualizacao@teste.com");
	      usuario.setLogin("teste");
	      usuario.setSenha("4321234");
	      //Atualiza no banco de dados
	      dao.atualizar(usuario);
	    }
	
}
