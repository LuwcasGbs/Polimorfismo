package Polimorfismo;

public class Animal {
	
	private String nome;
	private String sexo;
	private String raca;
	
	public Animal (String nome, String sexo, String raca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}
	public void dormir() {
		System.out.println("Dormindo");
	}
	public void caminhar() {
		System.out.println("Caminhando");
	}
	public void correr() {
		System.out.println("Correndo");
	}
	public void emitirSom() {
		System.out.println("Emitindo Som");
	}
	public String getNome() {
		return nome;
	}
	public void getNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void getSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRaca() {
		return raca;
	}
	public void getRaca(String raca) {
		this.raca = raca;
	}
}
