package ifsp.av3.osmar;

public class Eleito {
	
	//Osmar Daniel Chiavegati Tonon
	
	//usando conceito de encapsulamento
	private String nome,endereco,cep,sexo;
	private int ano,idade;
	
	//CONSTRUTOR
	public Eleito() {
		
	}
	public Eleito(String nome,String endereco,String cep,String sexo, int anoNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.sexo = sexo;
		this.ano = ano;
		this.idade = idade;
	}
	
	//GETTERS AND SETTERS
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return this.cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String Sexo) {
		this.sexo = sexo;
	}
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
