package ifsp.lista3.model;

/*
 * Classe Funcionário 2.0 
 */

public class Funcionario {

	// Usamos conceito de encapsulamento
	private String nome;
	private String cargo;
	private double salario;

	// Construtores
	public Funcionario() {
	}
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Métodos funcionais
	public String exibirDadosCadastro() {
		String cabecalho = "\n===== Funcionário Cadastrado ======\n";
		String detalheMarca = "Nome: " + this.nome + "\n";
		String detalheCargo = "Cargo: " + this.cargo + "\n";
		String detalheSalario = "Salário: " + this.salario + "\n";
		String rodape = "========================================";
		return cabecalho + detalheMarca + detalheCargo + detalheSalario + rodape;
	}
	
	@Override
	public String toString() {
		return exibirDadosCadastro();
	}
	
}