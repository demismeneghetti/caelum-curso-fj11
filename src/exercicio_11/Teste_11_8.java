package exercicio_11;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

public class Teste_11_8 {

	public static void main(String[] args) {
		
		// EX1 - Usando Try/Catch - Depositando valores
		Conta cc = new ContaCorrente();
		cc.deposita(100);
		
		Conta cp = new ContaPoupanca();
		cp.deposita(100);
		
		// EX2 - Usando Try/Catch - Sacando das contas
		cc.saca(50);
		System.out.println("Consegui sacar da corrente!");
		
		cp.saca(50);
		System.out.println("Consegui sacar da poupança!");
		
		// EX3 - Aplicando Try/Catch - Forma 1 - Incorreta
		try {
			cc.saca(50);			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Consegui sacar da corrente!");
		
		try {
			cp.saca(50);
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Consegui sacar da poupança!");
		
		// EX4 - Aplicando Try/Catch - Forma 2 - Correta com arestas
		try {
			cc.saca(50);
			System.out.println("Consegui sacar da corrente!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		
		try {
			cp.saca(50);
			System.out.println("Consegui sacar da poupança!");
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

		// EX5 - Aplicando Try/Catch - Forma 3 - Mais correta
		try {
			cc.saca(50);
			System.out.println("Consegui sacar da corrente!");
			cp.saca(50);
			System.out.println("Consegui sacar da poupança!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}