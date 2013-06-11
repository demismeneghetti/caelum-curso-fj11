package exercicio_10;

public class Exercicio10_5_3_Retangulo implements Exercicio10_5_1_AreaCalculavel {

	private int largura;
	private int altura;
	
	public Exercicio10_5_3_Retangulo(int largura, int altura){
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea(){
		return this.largura * this.altura;
	}
}
