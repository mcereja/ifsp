// Saymon Peixoto da Silva BV: 3028607
package ifsp.av3.saymon;

public class Pessoa {
    private String nome;
    private String endereco;
    private String cep;
    private String sexo;
    private int anoNascimento;

    // Construtores
    public Pessoa() {}

    public Pessoa(String nome, String endereco, String cep, String sexo, int anoNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    // Getters e Setters
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
}