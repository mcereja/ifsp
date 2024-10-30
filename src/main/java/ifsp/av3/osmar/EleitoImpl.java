package ifsp.av3.osmar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EleitoImpl {

	//Osmar Daniel Chiavegati Tonon
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome,endereco,sexo;
		int ano=0, opcao=0,idade=0,op=0,cep;
		boolean continua = true;
		List<Eleito> eleito = new ArrayList<Eleito>();
		
		do {
			System.out.println(" Verifica Classe Eleitoral");
			System.out.println("============================");
			System.out.println("1. Informar Dados ");
			System.out.println("2. Finalizar");
			System.out.println("============================");
			System.out.print("Opção: _ ");
			System.out.println("============================");
			opcao = scan.nextInt();

			if (opcao == 1){
				
				System.out.println("Informe seu nome: ");
				nome = scan.next();
				System.out.println("Informe seu endereço: ");
				endereco = scan.next();
				System.out.println("Informe seu sexo: ");
				sexo = scan.next();
				System.out.println("Informe seu CEP: ");
				cep = scan.nextInt();
				System.out.println("Informe o ano de agora: ");
				idade = scan.nextInt();
				System.out.println("Informe o ano de seu nascimento: ");
				ano = scan.nextInt();
				op = idade - ano;
				System.out.println("Sua idade é: "+op);
				
				if(op < 16) {
					System.out.println("Não Eleitor");
				}
				if(op >= 16 && op <=17) {
					System.out.println(" Eleitor Facultativo");
				}
				if(op >= 18 && op<=65) {
					System.out.println(" Eleitor Obrigatório");
				}
				if(op > 65) {
					System.out.println(" Eleitor Facultativo ");
				}
				
			} else if (opcao != 2){
				System.out.println("OPÇÃO INVÁLIDA \n");
				
			}

		} while(opcao < 2 || opcao >= 3);
		
		
		
		scan.close();
	}
	
	
		
		
	
}

