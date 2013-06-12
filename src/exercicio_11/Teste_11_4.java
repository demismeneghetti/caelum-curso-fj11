package exercicio_11;

import java.io.FileNotFoundException;

public class Teste_11_4 {

	public static void main(String[] args) {
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
