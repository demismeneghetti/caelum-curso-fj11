package br.com.empresa.banco.conta;
/**
 * 
 * @author demismeneghetti@gmail.com
 *
 */
public class Conta {

	public boolean equals(Object obj) {
		Conta c = (Conta) obj;
		if (this.saldo == c.getSaldo()){
			return true;
	}
		return false;
	}
	
	protected double saldo;
	public char[] imprime;
	/**
	 * 
	 * @param valor
	 */
	public void deposita(double valor){
		if (valor < 0 ){
			throw new IllegalArgumentException();
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}

	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}

	public String toString(){
		return "Saldo Ž: "+ this.saldo;
	}

	public void setNumero(int i) {
		
	}

	public void setAgencia(int i) {
		
	}
	
}