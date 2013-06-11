package refazendo;

public abstract class Funcionario {

	protected double salario;
	public abstract double getBonus();
	public abstract boolean autentica(int tentativa);
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double d) {
		// TODO Auto-generated method stub
		
	}

	public int getSenha() {
		// TODO Auto-generated method stub
		return 0;
	}
}
