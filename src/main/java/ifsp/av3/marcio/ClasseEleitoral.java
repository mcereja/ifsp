package ifsp.av3.marcio;

//Marcio Fernando de Abreu Filho    BV:302864X

public class ClasseEleitoral {
	//variaveis
	private String nome, end, sex;
	private int cep, ans, id;
	
	//construtores
	public ClasseEleitoral() {
	}
	public ClasseEleitoral(String nome, String end, String sex, int cep, int ans, int id) {
		this.nome = nome;
		this.end = end;
		this.sex = sex;
		this.cep = cep;
		this.ans = ans;
		this.id = id;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getAns() {
		return ans;
	}
	public void setAns(int ans) {
		this.ans = ans;
		//calculo da idade      
		//Marcio Fernando de Abreu Filho    BV:302864X
	}
	public int getId() {
		id = 2024-ans;
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	//impressão da tabela
	public String exibirDados() {
		String tabela = ("\n===== Classe Eleitoral ====="+"\n"+
		"Nome: "+ getNome()+"\n"+
		"Endereço: "+ getEnd()+"\n"+
		"CEP: "+ getCep()+"\n"+
		"Sexo: "+ getSex()+ "\n"+
		"Ano de nascimento: "+ getAns()+"\n"+
		"Idade: "+ getId());
		return tabela;
	}
	@Override
	public String toString(){
		return exibirDados();
	}

}
