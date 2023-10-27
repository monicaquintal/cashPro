package test;

import DAO.UsuarioDAO;

public class TesteRemover {

    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();
        //Remove o colaborador com código 1
        dao.remover(200);
        System.out.println("Usuário removido com sucesso!");
      }
	   
}
