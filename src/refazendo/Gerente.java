package refazendo;


public class Gerente extends Funcionario {

	@Override
	public double getBonus() {
		return salario * 0.3;
	}

	@Override
	public boolean autentica(int tentativa) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
