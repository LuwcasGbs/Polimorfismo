package Polimorfismo.Exercicio1;

public class Jornada extends Funcionario{
	
	public Jornada (int id,String nome,String telefone,int matricula,String endereco) {
		super (id,nome,telefone,matricula,endereco);
	}
	
	@Override
	public double calcularSalario(double salHora, double hora) {
		return salHora * hora;
	}

}
