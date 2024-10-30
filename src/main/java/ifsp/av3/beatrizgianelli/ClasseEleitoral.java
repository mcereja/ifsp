package ifsp.av3.beatrizgianelli;

import java.time.Period;

public class ClasseEleitoral {

	// Usamos conceito de encapsulamento Beatriz Souza BV3029921
		private String nome;
		private String endereço;
		private double CEP;
		private String sexo;
		private int ano;
	
		
		//construtor Beatriz Souza BV3029921
		public ClasseEleitoral() {
		}

		public ClasseEleitoral(String nome, String endereço, double CEP,String sexo,int ano) {
			super();
			this.nome = nome;
			this.endereço = endereço;
			this.CEP = CEP;
			this.sexo = sexo;
			this.ano = ano;
			
			
		}

		// getters and setters Beatriz Souza BV3029921
		
		public String getnome() {
			return nome;
		}

		public void setnome(String nome) {
			nome = nome;
		}
		public String getendereço() {
			return endereço;
		}

		public void setendereço(String endereço) {
			endereço = endereço;
		}

		public double getCEP() {
			return CEP;
		}

		public void setCEP(double CEP) {
			this.CEP = CEP;
		}
		public String getsexo() {
			return sexo;
		}

		public void setsexo(String sexo) {
			sexo = sexo;
		}
		public double getano() {
			return ano;
		}

		public void setano(double intano) {
			this.ano = ano;
		}
		// metodos funcionais -> calculo da idade
		public double calcularidade() {
			return 2024 - ano;
		}
		
		//Métodos funcionais Beatriz Souza BV3029921
		public String exibirDadosCadastro() {
			String cabecalho = "\n===== Verifica Classe Eleitoral ======\n";
			String detalhenome = "nome: " + this.nome + "\n";
			String detalheendereço = "endereço: " + this.endereço + "\n";
			String detalheCEP= "CEP: " + this.CEP + "\n";
			String detalhesexo = "sexo: " + this.sexo + "\n";
			String detalheano = "ano: " + this.ano + "\n";
			String rodape = "========================================";
			return cabecalho + detalhenome + detalheendereço+ detalheCEP + detalhesexo + detalheano + rodape;
			
		}
		
	
		@Override
		public String toString() {
			return exibirDadosCadastro();
		}

		public void add(ClasseEleitoral ClasseEleitoral ) {
			
			
		}

		
		
		
}
