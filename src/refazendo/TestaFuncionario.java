package refazendo;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario ana = new Recepcionista();
		ana.setSalario(1000.0);
		
		Funcionario joao = new Gerente();
		joao.setSalario(2000.0);
		
		Funcionario rick = new Analista();
		rick.setSalario(1500.0);
		
		Acumulador ac = new Acumulador();

		ac.acumula(ana);
		ac.acumula(joao);
		ac.acumula(rick);
		
		System.out.println(ac.getTotal());
	}
}
