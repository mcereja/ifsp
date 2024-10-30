package ifsp.av3corrigida;

/**
* SeuNome - Implementado em 10/2024
*/
public class ClasseEleitoral {
    // Encapsulamento e atributos solicitados
    private String nome;
    private String endereco;
    private String cep;
    private String sexo;
    private int anoNascimento;

    // Construtores
    public ClasseEleitoral(){
    }
    public ClasseEleitoral(String nome, String endereco, String cep, String sexo, int anoNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    // Getters and setters
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

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    // Metodos funcionais
    public String exibirDadosCadastrais() {
		String cabecalho = "\n===== Classe Eleitoral ======\n";
		String detalhe1 = "Nome: " + this.nome + "\n";
		String detalhe2 = "Endereço: " + this.endereco + "\n";
		String detalhe3 = "CEP: " + this.cep + "\n";
		String detalhe4 = "Sexo: " + this.sexo + "\n";
                String detalhe5 = "Ano de Nascimento: " + this.anoNascimento + "\n";	String rodape = "==================================";
		return cabecalho + detalhe1 + detalhe2+ detalhe3 + 
                        detalhe4 + detalhe5 + rodape;
	}
	
    public int calcularIdade(int anoNascimento){
        int idade = 2024 - anoNascimento;
        return idade;
    }
    
    // seuNome
    public String verificarClasseEleitoral(int idade){
        if ( idade < 16 ){
            return "Não Eleitor";
        } else if ( idade >= 16 && idade <=17 ){
            return "Eleitor Facultativo";
        } else if ( idade >= 18 && idade <= 65) {
            return "Eleitor Obrigatório";
        } else {
            return "Eleitor Facultativo";
        }
    }
    
    // Metodo da questão 7
    public String mensagemFinal(int idade){
        return "Sr " + this.nome + " sua situação eleitoral é " + 
                verificarClasseEleitoral(idade);
    }
    
    @Override
    public String toString() {
	return exibirDadosCadastrais();
    }
}
