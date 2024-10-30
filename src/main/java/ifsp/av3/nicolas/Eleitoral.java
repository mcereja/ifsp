package ifsp.av3.nicolas;

public class Eleitoral {

	private String nome,endereço,cep, sexo;
	private int anoNas=0;
	
	public Eleitoral (String nome, String endereço, String cep,String sexo,int anoNas) {
		
		this.nome= nome;
		this.endereço = endereço;
		this.cep= cep;
		this.sexo= sexo;
		this.anoNas= anoNas;
		
	}
	
	//Getters and Setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
	
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço= endereço;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep= cep;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo= sexo;
	}
	
	public int getAnoNas() {
		return anoNas;
	}
	public void setAnoNas(int anoNas) {
		this.anoNas= anoNas;
	}
	
	public int calculo() {
		
		int calculo = 2024 - this.anoNas;
		return anoNas;
		
	}
		
	
	
	
	
	
}
