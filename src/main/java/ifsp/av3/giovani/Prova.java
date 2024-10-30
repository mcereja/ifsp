package ifsp.av3.giovani;

/*
 * Classe Prova
 */

public class Prova {
	
	// Giovani Damascena da Silva BV3028305
	
	// Usamos conceito de encapsulamento
	private String nome;
	private String endereco;
	private double CEP, anoNascimento;
	String Sexo;
	


	// Construtores
	public Prova() {
	}
	public Prova(String nome, String endereco, double CEP, String Sexo, double anoNascimento) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.CEP = CEP;
		this.Sexo = Sexo;
		this.anoNascimento = anoNascimento;
	}

	// Getters and Setters

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the cEP
	 */
	public double getCEP() {
		return CEP;
	}
	/**
	 * @param cEP the cEP to set
	 */
	public void setCEP(double cEP) {
		CEP = cEP;
	}
	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return Sexo;
	}
	/**
	 * @param sexo2 the sexo to set
	 */
	public void setSexo(String sexo2) {
		Sexo = sexo2;
	}

	/**
	 * @return the anoNascimento
	 */
	public double getAnoNascimento() {
		return anoNascimento;
	}
	/**
	 * @param anoNascimento the anoNascimento to set
	 */
	public void setAnoNascimento(double anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	//Métodos funcionais
	public String exibirDadosCadastro() {
		String cabecalho = "\n===== Funcionário Cadastrado ======\n";
		String detalheNome = "Nome: " + this.nome + "\n";
		String detalheEndereco = "Endereço: " + this.endereco + "\n";
		String detalheCEP = "CEP: " + this.CEP + "\n";
		String detalheSexo = "Sexo: " + this.Sexo + "\n";
		String detalheanoNascimento = "Ano de nascimento: " + this.anoNascimento + "\n";
		String rodape = "========================================";
		return cabecalho + detalheNome + detalheEndereco + detalheCEP + detalheSexo + detalheanoNascimento +rodape;
	
		
	// por enquanto pelo visto só consegui cumprir com 3 condições, a 1,2 e 4  da prova =( dei meu melhor heh
		
	}

	@Override
	public String toString() {
		return exibirDadosCadastro();
		
	}
}