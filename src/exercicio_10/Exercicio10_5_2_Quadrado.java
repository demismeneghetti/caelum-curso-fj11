package exercicio_10;

public class Exercicio10_5_2_Quadrado implements Exercicio10_5_1_AreaCalculavel{
	
	private int lado;
	
	public Exercicio10_5_2_Quadrado(int lado){
		this.lado = lado;
	}

	@Override
	public double calculaArea(){
		return this.lado * this.lado;
	}
}
