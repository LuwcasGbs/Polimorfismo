package Polimorfismo.Exercicio2;

public class Principal {

	public static void main(String[] args) {
		ProfissionalSaude p = new ProfissionalSaude("Lusca","Todas",200);
		
		System.out.println("-------------PROFISSIONAL SAÚDE-------------");
		System.out.println(p.getNome());
		System.out.println(p.getEspecialidade());
		System.out.println(p.getValorConsulta());
		p.agendarConsulta();
		
		Medico m = new Medico ("Marcio","Podólogo",400,"2098");
		
		System.out.println("-------------------MÉDICO-------------------");
		System.out.println(m.getNome());
		System.out.println(m.getEspecialidade());
		System.out.println(m.getValorConsulta());
		System.out.println(m.getCrm());
		m.agendarConsulta();
		
		Dentista d = new Dentista ("Éder","De dentes",180,"44444");
		
		System.out.println("-------------------MÉDICO-------------------");
		System.out.println(d.getNome());
		System.out.println(d.getEspecialidade());
		System.out.println(d.getValorConsulta());
		System.out.println(d.getCro());
		m.agendarConsulta();
		
		Fisioterapeuta f = new Fisioterapeuta ("Marcio","Podólogo",400,"77777");
		
		System.out.println("-------------------MÉDICO-------------------");
		System.out.println(f.getNome());
		System.out.println(f.getEspecialidade());
		System.out.println(f.getValorConsulta());
		System.out.println(f.getCrefito());
		f.agendarConsulta();
	}

}
