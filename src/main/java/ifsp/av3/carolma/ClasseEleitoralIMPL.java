package ifsp.av3.carolma;

import java.util.Scanner;

//Mayara Mirella Araújo Garcia BV3028399
//Caroline Yasmin Silva Amaral BV3030318

public class ClasseEleitoralIMPL {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		//menu principal

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Informar dados");
			System.out.println("2 - Sair");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpa o buffer

			if (opcao == 1) {
				informarDados(scanner);
			} else if (opcao != 2) {
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 2);

		System.out.println("Saindo do programa...");
		scanner.close();
	}

	private static void informarDados(Scanner scanner) {
		System.out.print("Informe seu nome: ");
		String nome = scanner.nextLine();

		System.out.print("Informe seu endereço: ");
		String endereco = scanner.nextLine();

		System.out.print("Informe seu CEP: ");
		String cep = scanner.nextLine();

		System.out.print("Informe seu sexo: ");
		String sexo = scanner.nextLine();

		System.out.print("Informe seu ano de nascimento: ");
		int anoNascimento = scanner.nextInt();
		scanner.nextLine(); // Limpa o buffer

		int idade = calcularIdade(anoNascimento);
		String situacaoEleitoral = determinarSituacaoEleitoral(idade);

		System.out.println("Dados informados com sucesso!");
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("CEP: " + cep);
		System.out.println("Sexo: " + sexo);
		System.out.println("Ano de Nascimento: " + anoNascimento);
		System.out.println("Idade: " + idade);
		System.out.println("Situação Eleitoral: " + situacaoEleitoral);
	}

	private static int calcularIdade(int anoNascimento) {
		int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		return anoAtual - anoNascimento;
	}

	private static String determinarSituacaoEleitoral(int idade) {
		if (idade < 16) {
			return "Não eleitor";
		} else if (idade >= 16 && idade < 18) {
			return "Eleitor facultativo";
		} else if (idade >= 18 && idade <= 65) {
			return "Eleitor obrigatório";
		} else {
			return "Eleitor facultativo";
		}
	}
}
