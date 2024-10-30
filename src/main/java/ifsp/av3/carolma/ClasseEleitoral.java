package ifsp.av3.carolma;

import java.util.InputMismatchException;

// Mayara Mirella Araújo Garcia BV3028399
// Caroline Yasmin Silva Amaral BV3030318

public class ClasseEleitoral {
	
	// Usamos conceitos de encapsulamento
	private String nome, endereco, sexo;
	private int anoDeNascimento;
	private int CEP;
	
	//Construtores 
	public ClasseEleitoral (){
	}
	
	public ClasseEleitoral(String nome, String endereco, String sexo, int anoDeNascimento, int CEP) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.anoDeNascimento = anoDeNascimento;
		this.CEP = CEP;
		
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public String getEndereco() {
		return endereco;
    }
    public void setEndereco(String endereco) {
    	this.endereco = endereco;
    }
    public String getSexo() {
    	return sexo;
    }
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getanoDeNascimento() {
		return anoDeNascimento;
	}
	public int setanoDeNascimento(int anoDeNascimento) {
		return this.anoDeNascimento = anoDeNascimento;
	}
	public int getCEP() {
		return CEP;
	}
	public void setCEP(int CEP) {
		this.CEP = CEP;
	}
	
	public String exibirDadosCadastro() {
		String cabecalho = "\n===== Funcionário Cadastrado ======\n";
		String detalheMarca = "Nome: " + this.nome + "\n";
		String detalheCargo = "Cargo: " + this.endereco + "\n";
		String detalheSalario = "Salário: " + this.CEP + "\n";
		String rodape = "========================================";
		return cabecalho + detalheMarca + detalheCargo + detalheSalario + rodape;
	}
	
	@Override
	public String toString() {
		return exibirDadosCadastro();
	}
	
	

		}
	

