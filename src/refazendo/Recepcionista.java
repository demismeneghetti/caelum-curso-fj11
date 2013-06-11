package refazendo;


public class Recepcionista extends Funcionario {

	@Override
	public double getBonus() {
		return salario * 0.1;
	}

	@Override
	public boolean autentica(int tentativa) {
		// TODO Auto-generated method stub
		return false;
	}

}
