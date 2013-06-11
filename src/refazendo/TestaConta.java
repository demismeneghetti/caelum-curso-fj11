package refazendo;

public class TestaConta {

	public static void main(String[] args) {
		Conta contaCP = new ContaCP();
		contaCP.atualiza(100.0);
		
		Conta contaCC = new ContaCC();
		contaCC.atualiza(200.0);
		
		System.out.println(contaCP.getSaldo());
		System.out.println(contaCC.getSaldo());
	}
}