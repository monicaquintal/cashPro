package bean;

/**
 * Classe que abstrai uma Conta Poupança
 * @author Monica Quintal
 * @version 1.0
 */

public class ContaPoupanca extends Conta {

	private int id_conta_poupanca;
	private float taxaJurosAnual;
	private int id_conta;

	public ContaPoupanca(){
			
	}
		
	public ContaPoupanca(int id_conta_poupanca, float taxaJurosAnual,int id_conta){
		this.id_conta_poupanca = id_conta_poupanca;
		this.taxaJurosAnual = taxaJurosAnual;
		this.id_conta = id_conta;
	}

	/**
	 * Métodos Seletores e 
	 * Construtores da Classe 
	 * Conta Poupança
	 */
	
	public int getIDCP() {
		return id_conta_poupanca;
	}

	public void setIDCP(int id_conta_poupanca) {
		this.id_conta_poupanca = id_conta_poupanca;
	}
	
	public float getTaxaJurosAnual() {
		return taxaJurosAnual;
	}
	
	public void setTaxaJurosAnual(float taxaJurosAnual) {
		this.taxaJurosAnual = taxaJurosAnual;
	}

	public int getIDConta() {
		return id_conta;
	}
		
	public void setIDConta(int id_conta) {
		this.id_conta = id_conta;
	}
	
}
