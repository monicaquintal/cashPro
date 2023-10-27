package test;

import java.util.List;

import DAO.UsuarioDAO;
import bean.Usuario;

public class TesteListar {

    public static void main(String[] args) {
    	  
        UsuarioDAO dao = new UsuarioDAO();
        
        List<Usuario> lista = dao.getAll();
        for (Usuario item : lista) {
          System.out.println(item.getID() + " " + item.getEmail() + " " + item.getLogin() + " " + item.getSenha());
        }
      }
	
}
