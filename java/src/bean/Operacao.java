package bean;

import java.util.Calendar;

/**
	 * Registra Operações realizadas na Conta
	 * @author Monica Quintal
	 * @version 1.0
	 */

	public class Operacao extends Conta {	
		
		private int id_operacao;
		private double valor;
		private Calendar data_operacao;
		private String tipo;
		private String categoria;
		private int id_conta;
		private int id_cliente;
		;
		
		public Operacao() {
			
		}
		
		public Operacao(int id_operacao, double valor, Calendar data_operacao, String tipo, String categoria, int id_conta, int id_cliente){
			super();
			this.id_operacao = id_operacao;
			this.valor = valor;
			this.data_operacao = data_operacao;
			this.tipo = tipo;
			this.categoria = categoria;
			this.id_conta = id_conta;
			this.id_cliente = id_cliente;
		}
		
		/**
		 * Métodos Seletores e 
		 * Construtores da Classe Operação
		 */
		
		public int getIDOperacao() {
			return id_operacao;
		}
		
		public void setIDOperacao(int id_operacao) {
			this.id_operacao = id_operacao;
		}
		
		public double getValor() {
			return valor;
		}
		
		public void setValor(double valor) {
			this.valor = valor;
		}
		
		public Calendar getData() {
			return data_operacao;
		}
		
		public void setData(Calendar data_operacao) {
			this.data_operacao = data_operacao;
		}
		
		public String getTipo() {
			return tipo;
		}
		
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		public String getCategoria() {
			return categoria;
		}
		
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public int getIDCconta() {
			return id_conta;
		}

		public void setIDCconta(int id_conta) {
			this.id_conta = id_conta;
		}

		public int getIDCliente() {
			return id_cliente;
		}

		public void setIDCliente(int id_cliente) {
			this.id_cliente = id_cliente;
		}
		
		/**
		 * Verifica o Saldo da Conta
		 * @return Valor do Saldo da Conta
		 */
		
		//public double getSaldoDisponivel() {
		//	return getSaldo() + this.valor;
		//}
		

		
}