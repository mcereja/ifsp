package ifsp.av3.luizguilherme;

public class ClasseEleitoral {

	//Luiz Guilherme França Dotta BV3028461

	// Usamos conceito de encapsulamento
	private String nome;
	private String endereço;
	private int cep;
	private String sexo;
	private int anonasceu;
	private int idade;

	//Cria construtores
	public  ClasseEleitoral( ) {
		System.out.println();
	}



	public ClasseEleitoral(String nome,String endereço,int cep,String sexo,int anonasceu,int idade) {
		this.nome=nome;
		this.cep=cep;
		this.sexo=sexo;
		this.anonasceu=anonasceu;
		this.endereço=endereço;
		this.idade=idade;
	}
    
	// Getters 
	public String getNome() {
		return this.nome;
	}

	public String getEndereço() {
		return this.endereço;
	}

	public int getCep() {
		return this.cep;
	}

	public String getSexo() {
		return this.sexo;
	}

	public int getAnonasceu() {
		return this.anonasceu;
	}
	
	public int getIdade() {
		return this.idade;
	}

	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereço(String endereço) {
		this.endereço=endereço;
	}
	public void setCep(int cep) {
		this.cep=cep;
	}
	public void setSexo(String sexo) {
		this.sexo=sexo;
	}

	public void setAnonasceu(int anonasceu) {
		this.anonasceu=anonasceu;
	}
	public void setIdade(int idade) {
		this.idade=idade;
	}

	//Metodos funcionais
	public String exibirDadosCadastrais() {
		String cabecalho = "\n===== Cadastro Eleitor ======\n";
		String detalhe1 = "Nome: " + this.nome + "\n";
		String detalhe2 = "Endereço: " + this.endereço + "\n";
		String detalhe3 = "Cep: " + this.cep + "\n";
		String detalhe4 = "Sexo: " + this.sexo + "\n";
		String detalhe5 = "Ano que nasceu: " + this.anonasceu + "\n";
		String detalhe6 = "Idade: " + this.idade + "\n";
		String rodape = "=============================";
		return cabecalho + detalhe1 + detalhe2+ detalhe3 + detalhe4 + detalhe5 + detalhe6 + rodape;
	}


	//Metodo Nativo
			@Override
			public String toString() {
				return exibirDadosCadastrais();
			}

}
