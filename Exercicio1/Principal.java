package Polimorfismo.Exercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario (1, "Joaquin", "(15)1111-1111",123,"Rua Onde Judas Perdeu as Botas");
		
		System.out.println("------------FUNCIONARIO------------");
		System.out.println(f.getId());
		System.out.println(f.getNome());
		System.out.println(f.getTelefone());
		System.out.println(f.getMatricula());
		System.out.println(f.getEndereco());
		System.out.println(f.calcularSalario(10000, 1000));
		
		Horista h = new Horista (2, "Pedro", "(15)1111-1111",456,"Rua Onde Judas Perdeu as Botas");
		
		System.out.println("--------------HORISTA--------------");
		System.out.println(h.getId());
		System.out.println(h.getNome());
		System.out.println(h.getTelefone());
		System.out.println(h.getMatricula());
		System.out.println(h.getEndereco());
		System.out.println(h.calcularSalario(100, 200));
		
		Jornada j = new Jornada (3, "José", "(15)1111-1111",789,"Rua Onde Judas Perdeu as Botas");
		
		System.out.println("--------------JORNADA--------------");
		System.out.println(j.getId());
		System.out.println(j.getNome());
		System.out.println(j.getTelefone());
		System.out.println(j.getMatricula());
		System.out.println(j.getEndereco());
		System.out.println(j.calcularSalario(150, 220));
		
		ConsultorPj c = new ConsultorPj (4, "Mara", "(15)1111-1111",876,"Rua Onde Judas Perdeu as Botas");
		
		System.out.println("------------CONSULTOR PJ------------");
		System.out.println(c.getId());
		System.out.println(c.getNome());
		System.out.println(c.getTelefone());
		System.out.println(c.getMatricula());
		System.out.println(c.getEndereco());
		System.out.println(c.calcularSalario(40000, 5000));
	}

}
