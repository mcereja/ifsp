package ifsp.av3.oliver;

public class DeveVotar {

	//encapsulamento
	private String nome;
	private String endereco;
	private String cep;
	private String sexo;
	private int anodn,anoat;
	 //Construtores//Oliver Rezende Celini bv:3028402
	public DeveVotar() { 	}
	public DeveVotar(String nome,String endereco,String cep,String sexo,int anodn,int anoat) {
		super();
		this.nome = nome ;
		this.endereco = endereco ;
		this.cep = cep ;
		this.sexo = sexo;
		this.anodn = anodn; 
		this.anoat = anoat;
		
		
		//Getters e Setters
	}
	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public String getSexo() {
		return this.sexo;
	}
	public String getCep() {
		return this.cep;
	}
	public int getAnodn() {
		return this.anodn;
	}
	public int getAnoat() {
		return this.anoat;
	}
	public String setNome(String nome) {
		return this.nome;
	}
	public String setEndereco(String endereco) {
		return this.endereco;
	}
	public String setSexo(String sexo) {
		return this.sexo;
	}
	public String setCep(String cep) {
		return this.cep;
	}
	public int setAnodn(int anodn) {
		return this.anodn;
	}
	public int setAnota(int anoat) {
		return this.anoat;
	}
	//metodo para exibir dados do possivel eleitor
	public String exibirDadosEleitor() {
		String cabecalho ="\n=======DADOS DO CADASTRO=======\n";
		String nome ="\nNome:"+this.nome+"\n";
		String endereco ="\nEndereço"+this.endereco+"\n";
		String sexo ="\nSexo:"+this.sexo+"\n";
		String cep ="\nNome:"+this.cep+"\n";
		String anodn ="\nNascimento:"+this.anodn+"\n";
		String rodape = "=============================";
		return cabecalho + nome +endereco+ sexo+ cep +anodn+ rodape;
	}
	
	@Override
	public String toString() {
		return exibirDadosEleitor();
	}}
