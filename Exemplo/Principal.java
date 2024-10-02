package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo ("Shake", "M", "Lobo das neve");
		
		Leao leao = new Leao ("Aslam", "M", "Leão Asiático");
		
		Tigre tigre = new Tigre ("Sandra", "F", "Tigre Branco");
		
		Cachorro cao = new Cachorro ("Totó", "M", "Puddle");
		
		Gato gato = new Gato ("Luna", "F", "Siames");
		
		
		System.out.println("-------------LOBO-------------");
		System.out.println(lobo.getNome());
		System.out.println(lobo.getSexo());
		System.out.println(lobo.getRaca());
		lobo.emitirSom();
		
		System.out.println("-------------LEÃO-------------");
		System.out.println(leao.getNome());
		System.out.println(leao.getSexo());
		System.out.println(leao.getRaca());
		leao.emitirSom();
		
		System.out.println("-------------TIGRE-------------");
		System.out.println(tigre.getNome());
		System.out.println(tigre.getSexo());
		System.out.println(tigre.getRaca());
		tigre.emitirSom();
		
		System.out.println("-------------CACHORRO-------------");
		System.out.println(cao.getNome());
		System.out.println(cao.getSexo());
		System.out.println(cao.getRaca());
		cao.emitirSom();
		
		System.out.println("-------------CACHORRO-------------");
		System.out.println(gato.getNome());
		System.out.println(gato.getSexo());
		System.out.println(gato.getRaca());
		gato.emitirSom();
	}

}
