package bean;

	/**
	 * Classe que abstrai uma Conta Bancária
	 * @author Monica Quintal
	 * @version 1.0
	 */

	public class Conta {	
		
		/**
		 * ID da conta
		 */
		private int id_conta;

		/**
		 * Número da Agência
		 */
		private int agencia;
		
		/**
		 * Número da conta
		 */
		private int contacorrente;
		
		/**
		 * Número do banco
		 */
		private int banco;
		
		/**
		 * Saldo do cliente
		 */
		private int id_cliente;
		
		
		public Conta(){
			
		}
		
		public Conta(int id_conta, int agencia, int contacorrente, int banco, int id_cliente){
			this.id_conta = id_conta;
			this.agencia = agencia;
			this.contacorrente = contacorrente;
			this.banco = banco;
			this.id_cliente = id_cliente;
		}
		
		/**
		 * Métodos Seletores e 
		 * Construtores da Classe Conta
		 */
		
		public int getIDConta() {
			return id_conta;
		}
		
		public void setIDConta(int id_conta) {
			this.id_conta = id_conta;
		}
		
		public int getAgencia() {
			return agencia;
		}
		
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		
		public int getCC() {
			return contacorrente;
		}
		
		public void setCC(int contacorrente) {
			this.contacorrente = contacorrente;
		}
		
		public void setBanco(int banco) {
			this.banco = banco; 
		}
		
		public int getBanco() {
			return this.banco;
		}
		
		public void setIDCliente(int id_cliente) {
			this.id_cliente = id_cliente; 
		}
		
		public int getIDCliente() {
			return this.id_cliente;
		}
		
}