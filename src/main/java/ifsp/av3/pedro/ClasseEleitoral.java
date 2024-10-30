package ifsp.av3.pedro;

//Pedro Tobias Mendes Netto
//BV 3028372

public class ClasseEleitoral {

	// Usamos conceito de encapsulamento
	private String Nome, Endereco, Sexo, SituaEleit;
	private int AnoDeNascimento;
	int Idade;
	private double Cep;

	public ClasseEleitoral() {

	}
	public ClasseEleitoral(String Nome, String Endereco, String Sexo, String SituaEleit, int AnoDeNascimento, double Cep) {
		this.Nome = Nome;
		this.Endereco = Endereco;
		this.Sexo = Sexo;
		this.SituaEleit = SituaEleit;
		this.AnoDeNascimento = AnoDeNascimento;
		this.Cep = Cep;
	}

	// Getters and Setters
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public int getAnoDeNascimento() {
		return AnoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		AnoDeNascimento = anoDeNascimento;
	}
	public double getCep() {
		return Cep;
	}
	public void setCep(double cep) {
		Cep = cep;
	}
	public String getSituaEleit() {
		return SituaEleit;
	}
	public void setSituaEleit(String situaEleit) {
		SituaEleit = situaEleit;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	// Métodos funcionais -> calculo da Idade
	public double calcularIdade() {
		return 2024-AnoDeNascimento;
	}

	//Métodos funcionais
	public String exibirDadosCadastro() {
		String cabecalho = "\n===== Eleitor Cadastrado ======\n";
		String detalheNome = "Nome: " + this.Nome+"\n";
		String detalheEndereco = "Endereço: " + this.Endereco +"\n";
		String detalheCep = "CEP: " + this.Cep+"\n";
		String detalheSexo = "Sexo: " + this.Sexo +"\n";
		String detalheAnoDeNascimento = "Ano de Nascimento: " + this.AnoDeNascimento +"\n";
		String detalheSituaEleit = Nome +" se encaixa na Situção Eleitoral: " + this.SituaEleit +"\n";
		String rodape = "========================================";
		return cabecalho + detalheNome + detalheEndereco + detalheCep + detalheSexo + detalheAnoDeNascimento + detalheSituaEleit + rodape;
	}

	@Override
	public String toString() {
		return exibirDadosCadastro();
	}

}
