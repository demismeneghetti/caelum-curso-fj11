package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {

		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println("Saldo atual da conta: " + c.getSaldo());
		System.out.println("Saldo atual da conta corrente: " + cc.getSaldo());
		System.out.println("Saldo atual da conta poupança: " + cp.getSaldo());

	}
}
