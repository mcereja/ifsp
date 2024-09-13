package ifsp.lista2;

public class Carro {

	// Usamos conceito de encapsulamento
	private String marca;
	private String modelo;
	private int ano;
	private String cor;

	// Construtores
	public Carro() {
	}
	public Carro(String marca, String modelo, int ano, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}

	// Getters and Setters
	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getAno() {
		return this.ano;
	}

	public String getCor() {
		return this.cor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public void setAno(int ano) {
		this.ano=ano;
	}
	public void setCor(String cor) {
		this.cor=cor;
	}
	
	public String exibirDadosCadastrais() {
		String cabecalho = "\n===== Carro Cadastrado ======\n";
		String detalhe1 = "Marca: " + this.marca + "\n";
		String detalhe2 = "Modelo: " + this.modelo + "\n";
		String detalhe3 = "Ano: " + this.ano + "\n";
		String detalhe4 = "Cor: " + this.cor + "\n";
		String rodape = "=============================";
		return cabecalho + detalhe1 + detalhe2+ detalhe3 + detalhe4 + rodape;
	}
	
	@Override
	public String toString() {
		return exibirDadosCadastrais();
	}
}