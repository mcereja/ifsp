package ifsp.lista2;

import java.util.Scanner;

public class IndiceMassaCorpImpl {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		String nome;
		String sobrenome;
		String idade;
		double peso, altura;
		
		do {
			System.out.println("Menu de Opções");
			System.out.println("=====================");
			System.out.println("1- Dados IMC");
			System.out.println("2- Sair");
			System.out.println("=====================");
			System.out.print("Opção: ");
			opcao = scan.nextInt();

			if (opcao == 1) {
				System.out.println("==========================================");
				System.out.println("Informar o nome: ");
				nome = scan.next();

				System.out.println("Informar o peso: ");
				peso = scan.nextDouble();

				System.out.println("Informar a sobrenome: ");
				sobrenome = scan.next();

				System.out.println("Informar a idade: ");
				idade = scan.next();

				System.out.println("Informar a altura: ");
				altura = scan.nextDouble();
				
				IndiceMassaCorp imc = new IndiceMassaCorp(nome, sobrenome, opcao, peso, altura);
				System.out.println("Resultado IMC: " + imc.calcularIMC() );
			} else if (opcao != 2) {
				System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
			}

		} while (opcao < 2 || opcao >= 3);
		
	}

}
