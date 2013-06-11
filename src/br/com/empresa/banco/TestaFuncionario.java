package br.com.empresa.banco;

import br.com.empresa.banco.funcionario.Funcionario;

class TestaFuncionario{

	public static void main(String[] args){
		Funcionario f1 = new Funcionario();

		f1.setNome("Hugo");
		f1.setSalario(1000);
		f1.recebeAumento(500);
		f1.setEstaNaEmpresa(true);
		f1.setDepartamento("Financeiro");

		System.out.println("Salario atual: " + f1.getSalario());
		System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
		System.out.println("Departamento: " + f1.getDepartamento());
		System.out.println("Ativo: " + f1.getEstaNaEmpresa());	
	}
}
