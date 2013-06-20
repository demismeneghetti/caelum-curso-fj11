package br.com.caelum.execicios.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
									new FileInputStream("arquivo.txt")));

		String linha = br.readLine(); // primeira linha

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
	}
}