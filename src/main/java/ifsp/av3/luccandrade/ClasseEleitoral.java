package ifsp.av3.luccandrade;


//Lucca Andrade Oliveira BV3030253

public class ClasseEleitoral {
	
	
	//atributos
    private String nome;
    private String endereco;
    private int cep=0;
    private String sexo;
    private double nascimento=0;
  

    		
    //construtores
        public ClasseEleitoral(String nome, String endereco, int cep, String sexo, double nascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

        
     // getters and setters
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setSobrenome(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getNascimento() {
        return nascimento;
    }

    public void setNascimento(double nascimento) {
        this.nascimento = nascimento;
    }
}