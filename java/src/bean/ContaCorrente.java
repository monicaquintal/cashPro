package bean;

/**
 * Classe que abstrai uma Conta Corrente
 * @author Monica Quintal
 * @version 1.0
 */

public class ContaCorrente extends Conta {
	
	private int id_conta_corrente;
	private boolean possuiLimite;
	private float limite;
	private float taxaManutencao;
	private int id_conta;

	public ContaCorrente(){
			
	}
		
	public ContaCorrente(int id_conta_corrente, boolean possuiLimite, float limite, float taxaManutencao, int id_conta){
			this.id_conta_corrente = id_conta_corrente;
			this.possuiLimite = possuiLimite;
			this.limite = limite;
			this.taxaManutencao = taxaManutencao;
			this.id_conta = id_conta;
		}
	
	/**
	 * Métodos Seletores e 
	 * Construtores da Classe 
	 * Conta Corrente
	 */
	
	public int getIDCC() {
		return id_conta_corrente;
	}

	public void setIDCC(int id_conta_corrente) {
		this.id_conta_corrente = id_conta_corrente;
	}

	
	public boolean getPossuiLimite() {
		return possuiLimite;
	}
	
	public void setPossuiLimite(boolean possuiLimite) {
		this.possuiLimite = possuiLimite;
	}
	
	public float getLimite() {
		return limite;
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public float getTaxaManutencao() {
		return taxaManutencao;
	}
	
	public void setTaxaManutencao(float taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public int getIDConta() {
		return id_conta;
	}
		
	public void setIDConta(int id_conta) {
		this.id_conta = id_conta;
	}
	
}
