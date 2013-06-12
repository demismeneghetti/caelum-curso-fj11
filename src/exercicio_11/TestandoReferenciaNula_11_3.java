package exercicio_11;

import br.com.empresa.banco.conta.Conta;

public class TestandoReferenciaNula_11_3 {

	public static void main(String[] args) {
		Conta c = null;
		System.out.println("Saldo atual " + c.getSaldo());
	}
}
