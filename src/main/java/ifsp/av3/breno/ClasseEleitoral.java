package ifsp.av3.breno;
/*
 * Nome: Breno Peres Cortez
 * BV: BV3028437
 */
public class ClasseEleitoral {
	private String nome, endereco, sexo;
	private int idade, nasc, cep;
	
	public ClasseEleitoral() {
	}
	public ClasseEleitoral(String nome, String endereco, String sexo, int idade, int nasc, int cep) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.idade = idade;
		this.nasc = nasc;
		this.cep = cep;
	}
	
	public String situacaoEleitoral() { //Verifica situação eleitoral
		if(idade<16) {
			return "Não eleitor";
		}
		else if(idade>=16 && idade<=17) {
			return "Eleitor Facultativo";
		}
		else if(idade>65) {
			return "Eleitor Facultativo";
		}
		else{
			return "Eleitor Obrigatório";
		}
	}
	
	public String mensagemSituacao() {
		return "Sr. "+this.nome+" sua situação eleitoral é: "+situacaoEleitoral();
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int nasc) { //Calcula idade com base no nascimento
		this.idade = 2024-nasc;
		/*
		 * Nome: Breno Peres Cortez
		 * BV: BV3028437
		 */
	}
	
	public int getNasc() {
		return nasc;
	}
	public void setNasc(int nasc) { //Seta nascimento e calcula idade
		if(nasc>2024) {
			System.err.println("É impossível você ter nascido neste ano. Sua data foi arredondada para 2024.");
			this.nasc=2024;
		}
		else {
			this.nasc = nasc;
		}
		setIdade(nasc);
	}
	
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
	
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "Dados do eleitor"+
				"\n"+ClasseEleitoralImpl.TRACO+
				"\nNome: " + nome + 
				"\nEndereco: " + endereco + 
				"\nSexo: " + sexo + 
				"\nIdade: " + idade+ 
				"\nNasc: " + nasc + 
				"\nCep: " + cep +
				"\n"+mensagemSituacao()+
				"\n"+ClasseEleitoralImpl.TRACO;
	}
	
}
