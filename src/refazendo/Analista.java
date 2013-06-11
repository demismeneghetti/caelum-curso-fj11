package refazendo;

public class Analista extends Funcionario {

	@Override
	public double getBonus() {
		return salario * 0.6;
	}

	@Override
	public boolean autentica(int tentativa) {
		// TODO Auto-generated method stub
		return false;
	}

}
