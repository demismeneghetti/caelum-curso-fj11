package refazendo;

public abstract class Conta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void atualiza(double d) {
		this.saldo += d;
	}

}
