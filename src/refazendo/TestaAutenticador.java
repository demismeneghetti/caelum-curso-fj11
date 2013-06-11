package refazendo;


public class TestaAutenticador {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Funcionario ana = new Analista();
		Funcionario joao = new Gerente();
		Autenticador aut = new Autenticador();
		
		aut.autentica(ana);
		
	}

}
