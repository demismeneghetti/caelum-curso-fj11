package br.com.empresa.banco.funcionario;

public class Funcionario{

	private String departamento;
	public double salario;
	private boolean estaNaEmpresa;

	public Funcionario(){
	}

	public Funcionario(String nome){
	}

	public void recebeAumento(double aumento){
		this.salario = this.salario + aumento;
	}

	public double calculaGanhoAnual(){
		return this.salario * 12;
	}

	public void setNome(String nome){	
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;	
	}
	
	public String getDepartamento(){
		return this.departamento;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public double getSalario(){
		return this.salario;	
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa){
		this.estaNaEmpresa = estaNaEmpresa;
	}

	public boolean getEstaNaEmpresa(){
		return this.estaNaEmpresa;
	}
}
