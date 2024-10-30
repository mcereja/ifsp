package ifsp.av3.heloisa;

//Feito por: Heloisa Lopes Pinto bv302833x

public class ClasseEleitoral {
	//criação dos atributos necessários
	private String nome, endereco, sexo;
	private int cep, anodenascimento, idade;

	public ClasseEleitoral() {

	}

	//cria os construtores
	public ClasseEleitoral(String nome, String endereco, String sexo, int cep, int anodenascimento, int idade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.cep = cep;
		this.anodenascimento = anodenascimento;
		this.idade = idade;
	}

	// getters and setters
	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getSexo() {
		return sexo;
	}

	public int getCep() {
		return cep ;
	}

	public int getAnodenascimento() {
		return anodenascimento;
	}
	public int getIdade() {
		return idade ;
	}

	public void setNome(String nome) {
		this.nome = nome ;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco ;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo ;
	}

	public void setCep(int cep) {
		this.cep = cep ;
	}

	public void setAnodenascimento(int anodenascimento) {
		this.anodenascimento = anodenascimento ;
	}

	public void setIdade(int idade) {
		this.idade = idade ;
	}

	// métodos funcionais
	public String exibirDadosCadastro () {
		String cabecalho = "------- Eleitor -------\n";
		String detalheNome = "Nome: "+ this.nome + "\n" ;
		String detalheEndereco = "Endereço: " + this.endereco + "\n" ;
		String detalheSexo = "Sexo: " + this.sexo + "\n" ;
		String detalheCep = "CEP: " + this.cep + "\n" ;
		String detalheAnodenascimento = "Ano de Nascimento: " + this.anodenascimento + "\n" ;
		String detalheIdade = "Idade: " + this.idade + "\n";
		String rodape = "--------------------------------------";
		return cabecalho + detalheNome + detalheEndereco + detalheSexo + detalheCep + detalheAnodenascimento + detalheIdade + rodape;
	}

	public String toString() {
		return exibirDadosCadastro();
	}
}
