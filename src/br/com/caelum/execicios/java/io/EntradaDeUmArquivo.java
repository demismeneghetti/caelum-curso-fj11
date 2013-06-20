package br.com.caelum.execicios.java.io;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;

		Scanner entrada = new Scanner(is);
		while (entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}

		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		while (entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			bw.write(linha);
			bw.newLine();
		}

		bw.close();
	}
}
