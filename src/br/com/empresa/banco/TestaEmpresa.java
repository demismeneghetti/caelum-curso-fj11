package br.com.empresa.banco;

import br.com.empresa.banco.funcionario.Empresa;
import br.com.empresa.banco.funcionario.Funcionario;

class TestaEmpresa{

	public static void main(String[] args){

	Empresa empresa = new Empresa();
	empresa.empregados = new Funcionario[10];

	Funcionario f1= new Funcionario();
	f1.salario = 1000;
	empresa.adiciona(f1);

	Funcionario f2= new Funcionario();
	f2.salario = 1500;
	empresa.adiciona(f2);

	Funcionario f3= new Funcionario();
	f3.salario = 2000;
	empresa.adiciona(f3);
	}
}
