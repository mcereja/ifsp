package ifsp.av3.giovani;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProvaImpl {

	// Giovani Damascena da Silva BV3028305
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		 int opcao=0;
		
		 do {
			 System.out.println("==========================\nVerificar Classe Eleitoral");
			 System.out.println("==========================");
			 System.out.println("1- Informar Dados");
			 System.out.println("2- Finalizar");
			 System.out.println("==========================");
			 System.out.print("Opção: ");
			 opcao = scan.nextInt();

			 if (opcao == 1){
				 cadastrarFuncionario(scan);
			 }
			 else if (opcao != 2){
				 System.out.println("\n=====================ATENÇÃO!!! OPÇÃO INVÁLIDA=====================\n");
			 }

		 } while(opcao < 2 || opcao >= 3);
		
		 // Tela final que exibe o conteudo de cada atributo da classe Carro
		 System.out.println("");
		
		 scan.close();
	}

	private static void cadastrarFuncionario(Scanner scan) {
		String nome;
		String endereco;
		String Sexo;
		double CEP = 0, anoNascimento = 0;
		 
		
		// Cria o objeto Carro e permite utilizar suas funcionalidades
		Prova ProvaObj = new Prova();
		
		System.out.println("================================================");
		System.out.println("====       Cadastro  Eleitoral       ====");
		System.out.println("================================================");
		System.out.print("Informe seu nome: ");
		nome = scan.next();
		
		System.out.print("Informe seu endereço: ");
		endereco = scan.next();
		
		System.out.print("Informe seu sexo (Masculino/Feminino): ");
		Sexo = scan.next();
		
		try {
			System.out.print("Informe seu CEP: ");
			CEP = scan.nextDouble();
			ProvaObj.setCEP(CEP);
		} catch (InputMismatchException ex) { 
			System.err.print(" Atenção! Informe apenas números, e execute o programa novamente!! \n");
		} catch (Exception e) {
			System.err.println("Atenção!! Ocorreu um erro inesperado: " + e.getMessage());
		}
		
		try {
			System.out.print("Informar o seu ano de nascimento: ");
			anoNascimento = scan.nextDouble();
			ProvaObj.setAnoNascimento(anoNascimento);
		} catch (InputMismatchException ex) { 
			System.err.print(" Atenção! Informe apenas números, e execute o programa novamente!! \n");
		} catch (Exception e) {
			System.err.println("Atenção!! Ocorreu um erro inesperado: " + e.getMessage());
		}
		
		
		System.out.println("================================================");
		
		
		ProvaObj.setNome(nome);
		ProvaObj.setEndereco(endereco);
		ProvaObj.setCEP(CEP);
		ProvaObj.setAnoNascimento(anoNascimento);
		ProvaObj.setSexo(Sexo);
				
	}

}