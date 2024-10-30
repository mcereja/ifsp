package ifsp.av3.beatrizgianelli;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClasseEleitoralImpl {

	 public static void main(String[]args) {
		 Scanner scan = new Scanner(System.in);
			int opcao=0;
			List<ClasseEleitoral> classe = new ArrayList<ClasseEleitoral>();
			do {
				System.out.println("Verifica Classe Eleitoral");
				System.out.println("=====================");
				System.out.println("1- Informar dados");
				System.out.println("2- Finalizar");
				System.out.println("=====================");
				System.out.print("Opção: ");
				opcao = scan.nextInt();

				if (opcao == 1){
					 ClasseEleitoral(scan, classe);
				}else if (opcao != 2){
					System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
				}

			} while(opcao < 2 || opcao >= 3);
	 

	// Tela final que exibe o conteudo de cada atributo da classe Eleitoral Beatriz Souza BV 3029921
		System.out.println(classe);
   JOptionPane.showMessageDialog(null, classe);
		scan.close();
	}
	private static void ClasseEleitoral(Scanner scan, List<ClasseEleitoral> classe) {
		String nome;
		String endereço;
		double CEP;
		String sexo;
		int ano;
		ClasseEleitoral cl = new ClasseEleitoral();
		// Cria o objeto ClasseEleitoral e permite utilizar suas funcionalidades Beatriz Souza BV3029921
		ClasseEleitoral ClasseEleitoral= new ClasseEleitoral();
		
		System.out.println("==========================================");
		System.out.println("====       Cadastro de Classe Eleitoral       ====");
		System.out.println("==========================================");
		System.out.print("Informe o nome: ");
		nome = scan.next();
		
		System.out.print("Informe o endereço: ");
		endereço = scan.next();
		
		System.out.print("Informe o CEP: ");
		CEP = scan.nextDouble();
		
		System.out.print("Informe o sexo : ");
		sexo= scan.next();
		
	try {
			System.out.print("Informe seu ano de nascimento: ");
			ano = scan.nextInt();
			ClasseEleitoral.setano(ano);
		} catch (InputMismatchException ex) {
			System.err.print("Atenção!Informe apenas a data de seu nascimento, e execute o programa novamente !! \n");
		} catch (Exception e) {
			System.err.print("Ocorreu um erro, tente novamente:" + e.getMessage());
			
		} finally {
		}
	
		
		System.out.println("==========================================");
		
		// Alimentando o conteúdo dos atributos da classe Eleitoral Beatriz Souza BV3029921
		ClasseEleitoral.setnome(nome);
		ClasseEleitoral.setendereço(endereço);
		ClasseEleitoral.setsexo(sexo);
		
		
	
	System.out.println("Resultado da idade: " + cl.calcularidade() );
	
}
	
			 
	}