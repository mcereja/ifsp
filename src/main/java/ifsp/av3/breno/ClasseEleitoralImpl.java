package ifsp.av3.breno;

import java.util.Scanner;

/*
 * Nome: Breno Peres Cortez
 * BV: BV3028437
 */
public class ClasseEleitoralImpl {
	public static String TRACO="=========================";
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int op=0;
		do {
			ClasseEleitoral eleitor = new ClasseEleitoral();
			
			
			System.out.println("Verifica Classe Eleitoral"); //Imprime a tabela de opções
			System.out.println(TRACO);
			System.out.println("1. Informar Dados");
			System.out.println("2. Finalizar");
			System.out.println(TRACO);
			System.out.print("Opção: ");
			
			try {
				op = scan.nextInt();
			}
			catch(Exception e) {
				System.err.println("Insira uma opção válida!");
				System.exit(0);
			}
			
			if(op==1) { //Verifica a opção, caso op==2 cancela o loop, caso op!=1 e op!=2 retorna um erro
				Cadastro(scan, eleitor);
				System.out.println(eleitor);
			}
			else if(op==2) {
				break;
			}
			else if (op!=1 && op!=2) {
				System.err.println("Opção inválida, tente novamente!");
			}
		}while(op!=2);
	}
	
	public static void Cadastro(Scanner scan, ClasseEleitoral eleitor) { //Cadastra os valores do eleitor
		String nome, endereco, sexo;
		int nasc, cep;
		System.out.println(TRACO);
		
		//Input de Strings
		System.out.print("Insira seu nome: "); 
		nome = scan.next();
		
		System.out.print("Insira endereço: ");
		endereco = scan.next();
		
		System.out.print("Insira seu sexo: ");
		sexo = scan.next();
		
		//Input e set de ints
		System.out.print("Insira seu ano de nascimento: ");
		try {
			eleitor.setNasc(scan.nextInt());
		}
		catch(Exception e) {
			System.err.println("Valor inválido! Tente novamente!");
			System.exit(0);
		}
		
		System.out.print("Insira seu CEP: ");
		try {
			eleitor.setCep(scan.nextInt());
		}
		catch(Exception e) {
			System.err.println("Valor inválido! Tente novamente!");
			System.exit(0);
		}
		
		//Setando Strings
		eleitor.setNome(nome);
		eleitor.setEndereco(endereco);
		eleitor.setSexo(sexo);
	}
}
