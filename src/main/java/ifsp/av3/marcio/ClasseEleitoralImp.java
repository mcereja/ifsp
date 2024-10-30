package ifsp.av3.marcio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Marcio Fernando de Abreu Filho    BV:302864X

public class ClasseEleitoralImp {
	
	public static void cadastrarClasseEleitoral(Scanner scan, List<ClasseEleitoral> classeE) {
		ClasseEleitoral classe = new ClasseEleitoral();
		
		//entyrada de dados (setamentos)
				System.out.println("==============================================");
				System.out.println("====       Dados: Classe Eleitoral       ====");
				System.out.println("==============================================");
				
				System.out.print("Nome: ");
				classe.setNome(scan.next());
				
				System.out.print("Endereço: ");
				classe.setEnd(scan.next());
				
				System.out.print("CEP: ");
				//verificação de INT
				try {
				classe.setCep(scan.nextInt());
				} catch (Exception e) {
					System.err.println("ENTRADA INVÁLIDA!");
					System.exit(0);
				}
				System.out.print("Sexo: ");
				classe.setSex(scan.next());
				
				//verificação de INT
				System.out.print("Ano de nascimento: ");
				try {
				classe.setAns(scan.nextInt());
				} catch (Exception e) {
					System.err.println("ENTRADA INVÁLIDA!");
					System.exit(0);
				}
				
		classeE.add(classe);
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		//lista 
		List<ClasseEleitoral> classeE = new ArrayList<ClasseEleitoral>();
		
		int op=0;
		
		do {
			//Menu de opções
			System.out.println("Verifia Classe eleitoral");
			System.out.println("========================");
			System.out.println("1- Informar Dados");
			System.out.println("2- Sair");
			System.out.println("========================");
			System.out.print("Opção: ");
			op = scan.nextInt();

			//Verificação da validade da opção
			if (op == 1) {
				cadastrarClasseEleitoral(scan, classeE);
			} else if (op != 2) {
				System.err.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
			}
		} while (op < 2 || op >= 3);
		//Print dos carros
		System.out.println(classeE);
		scan.close();
	}
	}
	

