package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();

		try {
			cp.deposita(-100);
		} catch (IllegalArgumentException e) {
			System.out
					.println("Você tentou depositar um valor inválido, seu animal!!!");
		}
	}
}