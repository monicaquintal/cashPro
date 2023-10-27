package bean;

/**
 * Registra Usuários
 * @author Monica Quintal
 * @version 1.0
 */

public class Usuario {
	
	  private int id_cliente;
	  private String email;
	  private String login;
	  private String senha;

	  public Usuario(int id_cliente, String email, String login, String senha) {
		  super();
		  this.id_cliente = id_cliente;
		  this.email = email;
		  this.login = login;
		  this.senha = senha;
	  }
	  
	  public Usuario() {
		  super();
	  }
	  		  
	/**
	 * Métodos Seletores e 
	 * Construtores da Classe Usuário
	 */
	  
	  public int getID() {
		  return id_cliente;
	  }
	  
	  public void setID (int id_cliente) {
		  this.id_cliente = id_cliente;
	  }
	  
	  public String getEmail() {
		  return email;
	  }
	  
	  public void setEmail (String email) {
		  this.email = email;
	  }
	  
	  public String getLogin() {
		  return login;
	  }
	  
	  public void setLogin (String login) {
		  this.login = login;
	  }
	  
	  public String getSenha() {
		  return senha;
	  }
	  
	  public void setSenha (String senha) {
		  this.senha = senha;
	  } 
	  
}