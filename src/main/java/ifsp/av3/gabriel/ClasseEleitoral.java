//Gabriel Ribeiro de Carvalho - BV3028348
package ifsp.av3.gabriel;

public class ClasseEleitoral {

	
	// declaração das variáveis
	private String nome;
	private String endereco;
	private int cep;
	private int sexo;
	private int ano;
	
	//construtor
	
	public ClasseEleitoral() {
	}
		public ClasseEleitoral (String nome,String endereco, int cep , int sexo, int ano) {
			super();
				
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.sexo = sexo;
		this.ano = ano;
			
			
	}
	
	//getters e setters
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
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
	
	
	
	
}
