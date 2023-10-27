package bean;

/**
 * Registra Usuários (Pessoas Jurídicas)
 * @author Monica Quintal
 * @version 1.0
 */


public class UsuarioPessoaJuridica extends Usuario {
	
	  private String razaoSocial;
	  private int cnpj;
	  private int id_cliente;

	  public UsuarioPessoaJuridica() {
		  
	  }
	  
	  public UsuarioPessoaJuridica(String razaoSocial, int cnpj, int id_cliente){
		  this.razaoSocial = razaoSocial;
		  this.cnpj = cnpj;
		  this.id_cliente = id_cliente;
	  }
	  
	/**
	 * Métodos Seletores e 
	 * Construtores da Classe 
	 * Usuário Pessoa Jurídica
	 */
	  
	  public String getRazaoSocial() {
		  return razaoSocial;
	  }
	  
	  public void setRazaoSocial (String razaoSocial) {
		  this.razaoSocial = razaoSocial;
	  }
	  
	  public int getCnpj() {
		  return cnpj;
	  }
		  
	  public void setCnpj (int cnpj) {
		  this.cnpj = cnpj;
	  }
	  
	  public int getIDCliente() {
		  return id_cliente;
	  }
				  
	  public void setIDCliente (int id_cliente) {
		  this.id_cliente = id_cliente;
	  }
	  
	  /* Cadastra Pessoa Jurídica
	   * @param dados pessoais: cnpj, razao social, email, login e senha
	   * @void
	   */
	  
	  public void cadastrarPessoaJuridica (String razaoSocial, int cnpj, String email, String login, String senha){
		  	this.razaoSocial = razaoSocial;
			this.cnpj = cnpj;
			getEmail();
			getLogin();
			getSenha();
	  }
}