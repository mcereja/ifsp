package ifsp.av3.gabriel;
import java.util.InputMismatchException;
//Gabriel Ribeiro de Carvalho - BV3028348
import java.util.Scanner;

public class ClasseEleitoralImpl {




	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ClasseEleitoral objeto = new ClasseEleitoral(); 

		int opcao=0;
		int idade = 0;



		do {
			boolean validOption = false;
			System.out.println("==========================================");
			System.out.println("====     Verifica Classe Eleitoral    ====");
			System.out.println("==========================================");
			System.out.println("-------------------------");
			System.out.println("1- Informar Dados");
			System.out.println("2- Sair");
			System.out.println("-------------------------");
			System.out.print("Como deseja prosseguir?: ");
			opcao = scan.nextInt();

			while (!validOption) {
		
				try {
					System.out.print("Confirma? (1 ou 2) ");
					opcao = scan.nextInt();
					if (opcao < 1 || opcao > 2) {
						throw new IllegalArgumentException("Opção inválida! Escolha 1 ou 2.");
					}
					validOption = true;
				} catch (InputMismatchException e) {
					System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
					scan.next(); 
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}


				if(opcao==1) {

					System.out.println("==================================================");
					System.out.println("====       Verifica classe Eleitoral     ====");
					System.out.println("==================================================");

					System.out.println("digite o nome:  ");
					objeto.setNome(scan.next());



					System.out.println("digite o o endereco:  ");
					objeto.setEndereco(scan.next());



					System.out.println("digite o o cep:  ");
					objeto.setCep(scan.nextInt());


					System.out.println("digite o sexo ( 1 = masc. 2=fem:  ");
					objeto.setSexo(scan.nextInt());

					System.out.println("digite o ano de nascimento  ");
					objeto.setAno(scan.nextInt());

				}
				if(opcao ==2) {
					System.out.println("Finalizando.");
					break;
				}

					System.out.println("Senhor(a)" + objeto.getNome() + " Sua cituação eleitoral é:");
					System.out.println("");

						
				


			}
		while (opcao != 2);

        scan.close();
		}
	}












