package exercicio_leitura_e_escrita;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class TestaMarota {

	public static void main (String[] args) throws FileNotFoundException{
//		Scanner sc = new Scanner(System.in);
//		while (sc.hasNextLine()){
//			String linha = sc.nextLine();
//		}
		PrintStream ps = new PrintStream ("maroto.txt");
		ps.println("Ol� Mundo!");
	}
}