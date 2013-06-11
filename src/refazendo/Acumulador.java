package refazendo;

public class Acumulador {

	@SuppressWarnings("unused")
	private double total;

	public void acumula(Funcionario f){
		this.total += f.getBonus();
	}
	
	public double getTotal(){
		return this.getTotal();
	}
}
