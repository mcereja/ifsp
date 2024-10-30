// Eduardo Franco de Campos
// BV:3031292
package ifsp.av3.eduardo;

public class SitEleitoral {

  

	private String nome, endereco, sexo;
	private int cep, anonascimento;

	public SitEleitoral() {
}
	public SitEleitoral(String nome, String endereco, String sexo, int cep, int anonascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.cep = cep;
		this.anonascimento = anonascimento;
}

	// Implemento dos metodos "getters and setters"

	// metodos funcionais -> calculo da situacão eleitoral
	
	
	    public String getNome() {
			return nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public String getSexo() {
			return sexo;
		}
		public int getCEP() {
			return cep;
		}
		public int getAnoNascimento() {
			return anonascimento;
		}
		public double calcularIdade() {
			return 2024 - anonascimento;
		}

		
		 public void setNome(String nome) {
			 this.nome=nome;
		}
		 public void setEndereco(String endereco) {
			 this.endereco=endereco;
		}
		 public void setSexo(String sexo) {
			 this.sexo=sexo;
		}
		 public void setCEP(int cep) {
			 this.cep=cep;
		}
		 public void setAnoNascimento(int anonascimento) {
			 this.anonascimento=anonascimento;
		}
		 public String exibirDadosCadastro() {
				String cabecalho = "------- cadastro eleitoral -------\n";
				String detalheNome = "	Nome: " + this.nome + "\n";
				String detalheEndereco = "Endereço: " + this.endereco + "\n";
				String detalheSexo = "Sexo: " + this.sexo + "\n";
				String detalheCEP = "CEP: " + this.cep+ "\n";
				String detalheAnoNascimento = "Ano de nascimento" + "\n";
				String rodape = "--------------------------------------";
				return cabecalho + detalheNome + detalheEndereco + detalheSexo + detalheCEP + detalheAnoNascimento + rodape;
				}
}


