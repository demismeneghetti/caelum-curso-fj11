package br.com.empresa.banco.funcionario;

public class Empresa{

	String nomeEmpresa;
	String CNPJ;
	String endereco;
	public Funcionario[] empregados;

	public void adiciona(Funcionario f){
		for (int i=0; i< this.empregados.length;i++) {
		if(this.empregados[i] == null){
			this.empregados[i] = f;
			System.out.println(f.salario);		
			break;
			}
		}
	}
}
