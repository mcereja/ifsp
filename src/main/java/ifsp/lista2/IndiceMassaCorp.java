package ifsp.lista2;

public class IndiceMassaCorp {

	private String nome;
	private String sobrenome;
	private int idade;
	private double peso;
	private double altura;
	
	public IndiceMassaCorp() {
	}
	public IndiceMassaCorp(String nome, String sobrenome, int idade, double peso, double altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	// Implemente aqui os metodos getters and setters
	
	// metodos funcionais -> calculo do IMC
	public double calcularIMC() {
		return peso / Math.pow(altura, 2);
	}
	
}
