package ifsp.av3.joaoluca;

public class VCE {
	//BV3028666 Luca S. Guedes
	//BV3028321 João Afonso D. Perussi
	
	    public static String nome;
	    public String endereco;
	    public String sexo;
	    public int ano;
	    public int anoanual = 2024; 
	    public int cep;


	  
	    private static final String TRACO =
	    		"==================================================================";
	    		private static final String TRACO2 =
	    		"------------------------------------------------------------------";
	        public VCE(String nome, String endereco, int ano,int idade, int cep, String sexo) {
	        this.nome = nome;
	        this.endereco = endereco;
	        this.sexo = sexo;

	    }

	        public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	   

	    public int getAno() {
	        return ano;
	    }

	    public void setAno(int ano) {
	        this.ano = ano;
	    }
	    
	    public int getAnoAnual() {
	        return anoanual;
	    }

	    public void setAnoAnual(int anoanual) {
	        this.anoanual = anoanual;
	    }
	    
	    

	  
	}