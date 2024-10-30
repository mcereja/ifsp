package ifsp.av3.nicolas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EleitoralImpl {

	//Nicolas Santos Hager de Souza BV3029395



	public static void main(String[] args) {
		String nome = null,endereço = null,cep = null, sexo = null;
		int anoNas=0;
		int escolha=0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Verifica Classe Eleitoral");
			System.out.println("=========================");
			System.out.println("1. Informar Dados");
			System.out.println("2. Finalizar");
			System.out.println("=========================");
			System.out.print("Opção:");


			escolha = scan.nextInt();

			if (escolha == 1)  {

				cadastroEleitoral(scan, nome, endereço, cep, sexo, anoNas);
			}
			else if (escolha != 2) {
				System.err.println("Opção invalida tente novante");

			}
		} while(escolha < 2 || escolha >= 3);

		scan.close();

	}

	private static void cadastroEleitoral(Scanner scan, String nome, String endereço, String cep, String sexo,
			int anoNas) {
		Eleitoral eleitoral = new Eleitoral(nome, endereço, cep, sexo, anoNas); 

		System.out.println("Informar Dados");
		System.out.println("Nome:");
		nome = scan.next();
		System.out.println("Endereço:");
		endereço = scan.next();
		System.out.println("Cep:");
		cep = scan.next();
		System.out.println("Sexo");
		sexo = scan.next();
		System.out.println("Ano de nascimento:");
		try {		
			anoNas = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Informe o Ano corretamente: ");
			scan.nextLine();
		}

		eleitoral.setNome(nome);
		eleitoral.setEndereço(endereço);
		eleitoral.setCep(cep);
		eleitoral.setSexo(sexo);
		eleitoral.setAnoNas(anoNas);
	}

}
