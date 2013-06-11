package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;

public class TestaObjetos {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero (24);
		conta.setAgencia(666);

		Conta obj = new Conta();
		obj.setNumero (24);
		obj.setAgencia(666);
		
		System.out.println(conta.equals(obj));
	}

}
