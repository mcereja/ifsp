package ifsp.av3.luccandrade;

import java.util.Scanner;

public class ClasseEleitorialImpl {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String nome;
		String endereco;
		int cep=0;
		String sexo;
		double nascimento=0;
		
	
		
	
		
		System.out.println("==========================================");
		System.out.println("====    Verifica Classe Eleitoral     ====");
		System.out.println("==========================================");
		System.out.print("Informe seu Nome: ");
		nome = scan.next();
		
		System.out.print("Informe seu Endereço: ");
		endereco = scan.next();
		
		try {
			System.out.print("Informe seu Cep: ");
			cep = scan.nextInt();
			}
			catch(Exception e) {
				System.out.println("Ano inválido!");
				System.exit(0);
			}
		
		System.out.print("Informe seu sexo: ");
		sexo = scan.next();
		
		System.out.print("Informe sua idade: ");
		//idade = scan.next();
		
		 
		
		System.out.println("==========================================");
		
		// Alimentando o conteúdo dos atributos
//		carro.setNome(endereco);
//		carro.setEndereco(endereco);
//		carro.setCep(cep);
//		carro.setSexo(sexo);
//		carro.setIdade(idade);
		
		
		// Tela final que exibe o conteudo de cada atributo
		
		
		scan.close();
		}
}
