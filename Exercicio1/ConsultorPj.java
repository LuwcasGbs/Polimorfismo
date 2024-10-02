package Polimorfismo.Exercicio1;

public class ConsultorPj extends Funcionario{
	
	public ConsultorPj (int id,String nome,String telefone,int matricula,String endereco) {
		super (id,nome,telefone,matricula,endereco);
	}
	
	@Override
	public double calcularSalario(double valorTot, double imposto) {
		return valorTot - imposto;
	}

}
