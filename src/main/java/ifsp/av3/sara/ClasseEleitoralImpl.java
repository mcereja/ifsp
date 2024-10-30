package ifsp.av3.sara;

// feitor por Sara Gabriela de Souza Teodoro, bv3028593

/*
 * estrutura da classe de implementação 
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClasseEleitoralImpl{
	// void main 
	public static void main(String[] args) {
	
	// scanner -> entrada de dados do usuário 
	Scanner scan = new Scanner(System.in);
	int opcao=0;
	List<ClasseEleitoral> classeseleitorais = new ArrayList<ClasseEleitoral>();

	// estrutura de repetição para o menu principal
	do {
		System.out.println("Verificar Classe Eleitoral");
		System.out.println("==================================================================");
		System.out.println("1. Informar dados");
		System.out.println("2. Finalizar");
		System.out.println("==================================================================");
		System.out.print("Opção: ");
		opcao = scan.nextInt();
		System.out.println("==================================================================");

		if (opcao == 1){
			cadastrarClasseEleitoral(scan, classeseleitorais);
		}
		else if (opcao != 2){
			System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
		}

	} while(opcao < 2 || opcao >= 3);
	
	// tela final que exibe o conteúdo de cada atributo da classe ClasseEleitoral
	System.out.println(classeseleitorais);
	JOptionPane.showMessageDialog(null, classeseleitorais);

	scan.close();

}

	// criar a colletions -> List<>
	private static void cadastrarClasseEleitoral(Scanner scan, List<ClasseEleitoral> classeseleitorais){

	String nome, endereço, sexo;
	int nascimento, cep, ano=2024, idade;

	ClasseEleitoral classe = new ClasseEleitoral();

	System.out.println("==================================================================");
	System.out.println("|     Cadrasto Eleitor       |");
	System.out.println("==================================================================");
	System.out.print("Informe seu nome: ");
	nome = scan.next();

	System.out.print("Informe seu endereço: ");
	endereço = scan.next();

	System.out.print("Informe seu sexo: ");
	sexo = scan.next();

		//  Sara Gabriela de Souza Teodoro, bv3028593
		System.out.print("Informe seu ano de nascimento(apenas ano): ");
		nascimento = scan.nextInt();
		
		idade = (ano - nascimento);
		
		// etapa de verificação
		if (idade <16) {
			System.out.println("Não Eleitor");
		}
		else if (idade>= 16 && idade<=17) {
			System.out.println("Eleitor Facultativo");
		}
		else if (idade>=18 && idade<=65) {
			System.out.println("Eleitor Obrigatório");
		}
		else if (idade>65 ) {
			System.out.println("Eleitor Facultativo");
		}

	System.out.print("Informe o seu CEP: ");
	try {
		cep = scan.nextInt();
		//classe.setCep(cep);
	}
	catch(InputMismatchException ex) {
		System.err.println("Atenção!! Informe apenas números no CEP, e execute o programa novamente !!\n");
	} catch(Exception e) {
		System.err.println("Atenção!! Ocorreu um erro inesperado"+ e.getMessage());
	}

	System.out.println("==================================================================");

	// Alimentando os atributos da classe ClasseEleitoral

	classe.setNome(nome);
	classe.setEndereço(endereço);
	classe.setSexo(sexo);

	// inserir na lista
	classeseleitorais.add(classe);
}
}
