package ifsp.av3.heloisa;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Feito por: Heloisa Lopes Pinto bv302833x

public class ClasseEleitoralmpl {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao=0;
		List<ClasseEleitoral> classeseleitorais = new ArrayList<ClasseEleitoral>();

		//Estrutura de repetição
		do {
			System.out.println("-------------------------");
			System.out.println("Verificar Classe Eleitoral");
			System.out.println("-------------------------");
			System.out.println("1- Informar Dados");
			System.out.println("2- Finalizar");
			System.out.println("-------------------------");
			System.out.print("Opção: ");
			opcao = scan.nextInt();
			System.out.println("-------------------------");

			if (opcao == 1){
				cadastrarClasseEleitoral(scan, classeseleitorais);
			}
			else if (opcao != 2){
				System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
			}

		} while(opcao < 2 || opcao >= 3);
		// Tela final que exibe o conteudo de cada atributo da classe Carro
		System.out.println(classeseleitorais);
		JOptionPane.showMessageDialog(null, classeseleitorais);

		scan.close();
	}

	private static void cadastrarClasseEleitoral(Scanner scan, List<ClasseEleitoral> classeseleitorais){

		String nome, endereco, sexo;
		int cep, anodenascimento, idade, ano=2024;

		ClasseEleitoral eleitoral = new ClasseEleitoral();

		//Coletando os Dados
		System.out.println("--------------------------------");
		System.out.println("|     Cadrasto de Eleitor        |");
		System.out.println("--------------------------------");
		System.out.print("Informe o Nome: ");
		nome= scan.next();


		System.out.print("Informar o Endereco: ");
		endereco = scan.next();

		System.out.print("Informar o Sexo: ");
		sexo = scan.next();

		System.out.print("Informe o CEP: ");
		try {
			cep = scan.nextInt();
			eleitoral.setCep(cep);
		}
		catch(InputMismatchException ex) {
			System.err.println("Atenção!! Informe apenas números no CEP, e execute o programa novamente !!\n");
		} catch(Exception e) {
			System.err.println("Atenção!! Ocorreu um erro inesperado"+ e.getMessage());
		}

		System.out.print("Informe o Ano de Nascimento: ");
		anodenascimento = scan.nextInt();

		/*calculo da idade
		 * by:Helois Lopes Pinto bv302833x
		 */
		idade=(ano - anodenascimento);
		System.out.println("Idade: "+ idade);

		//Verificando a situação eleitoral
		if (idade < 16){
			System.out.print(nome + " sua situação eleitoral é: Não Eleitor");
		}
		else if (idade >= 16 && idade <= 17){
			System.out.print(nome + " sua situação eleitoral é: Eleitor Facultativo\n");
		}
		else if(idade >= 18 && idade <= 65){
			System.out.print(nome + " sua situação eleitoral é: Eleitor Obrigatorio\n");
		}
		else if(idade >65) {
			System.out.print(nome + " sua situação eleitoral é: Eleitor Facultativo\n");
		}


		// Alimentando os atributos da classe Carro
		eleitoral.setNome(nome);
		eleitoral.setEndereco(endereco);
		eleitoral.setSexo(sexo);
		eleitoral.setAnodenascimento(anodenascimento);
		eleitoral.setIdade(idade);

		// inserir na lista
		classeseleitorais.add(eleitoral);
	}

}
