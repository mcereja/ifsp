package ifsp.av3.sara;

// feito por Sara Gabriela de Souza Teodoro, bv3028593
/*
 * estrutura de uma classe java bean 
 */

public class ClasseEleitoral {

	// criar os atributos necessários, usei o conceito de encapsulamento 
	private String nome, endereço, sexo;
	private int nascimento, CEP;

	public ClasseEleitoral() {
	}

	// criar o construtor            
	public ClasseEleitoral(String nome, String endereço, String sexo, int nascimento, int CEP) {
		this.nome = nome;
		this.endereço = endereço;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.CEP = CEP;
	}

	// getters and setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getSexo(String sexo) {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getNascimento() {
		return nascimento;
	}
	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	public int getCEP() {
		return CEP;
	}
	public void setCEP(int CEP) {
		this.CEP = CEP;
	}

	// métodos funcionais
	public String exibirDadosCadastro() {
		String cabecalho = "=====            Eleitor Cadastrado                      =====\n";
		String detalheNome = "Nome: " + this.nome + "\n";
		String detalheEndereço = "Endereço: " + this.endereço + "\n";
		String detalheSexo = "Sexo: " + this.sexo + "\n";
		String detalheNascimento = "Data de Nascimento: " + this.nascimento + "\n";
		String detalheCEP = "CEP: " + this.CEP + "\n";
		String rodape = "==================================================================";
		return cabecalho + detalheNome + detalheEndereço + detalheSexo + detalheNascimento + detalheCEP + rodape;
	}
	
	// métodos nativos JAVA
	@Override
	public String toString() {
		return exibirDadosCadastro();
	}

}