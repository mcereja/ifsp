package ifsp.av3.luizguilherme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClasseEleitoralImpl {

	//Luiz Guilherme França Dotta BV3028461

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao;
		
		//Uso coletions
		List<ClasseEleitoral> eleitores = new ArrayList<>();
		

		
		//Estrutura de repetição p/menu
		do {
			System.out.println("Menu Opções");
			System.out.println("=====================");
			System.out.println("1- Cadastrar Eleitor");
			System.out.println("2- Sair");
			System.out.println("=====================");
			System.out.print("Opção: ");
			opcao = scan.nextInt();
		
			
			if (opcao == 1){
				cadastrarEleitores(scan,eleitores);
			}  else if (opcao != 2){
				System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
			}

		} while(opcao < 2 || opcao >= 3);
		
		// Tela final que exibe o conteudo de cada atributo da classe Eleitoral
					JOptionPane.showMessageDialog(null, eleitores);	
					
					scan.close();
				
}

	@SuppressWarnings("unused")
	private static void cadastrarEleitores(Scanner scan, List<ClasseEleitoral> eleitores) {
		String nome;
		String endereço;
		int cep;
		String sexo;
		int anonasceu;
		int idade;
		
		// Cria o objeto eleitor e permite utilizar suas funcionalidades
		@SuppressWarnings("unused")
		ClasseEleitoral eleitor = new ClasseEleitoral();
			
		
		System.out.println("==========================================");
		System.out.println("====       Cadastro  do Eleitor      ====");
		System.out.println("==========================================");
		
		System.out.print("Informar a Nome: ");
		nome = scan.next();
		
		System.out.print("Informar o Endereço: ");
		endereço = scan.next();
		
		System.out.print("Informar o Cep: ");
		cep = scan.nextInt();
		
		System.out.print("Informar a Sexo: ");
		sexo = scan.next();
		
		System.out.print("Informar o Ano de nascimento: ");
		anonasceu = scan.nextInt();
         
		idade=(2024 - anonasceu);
		System.out.println("Idade: "+ idade);  //Luiz Guilherme França Dotta Bv3028461
		//Verificando a situação eleitoral
		if (idade < 16){
		System.out.print(" Situação : Não Eleitor\n");
		}
		else if (idade >= 16 && idade <= 17){
		System.out.print(" Situação : Eleitor Facultativo\n");
		}
		else if(idade >= 18 && idade <= 65){
		System.out.print(" Situação : Eleitor Obrigatorio\n");
		}
		else if(idade >65) {
		System.out.print(" Situação : Eleitor Facultativo\n");
		}
	        
	    
	            
	            
	         // Cria o objeto Carro e permite utilizar suas funcionalidades
				@SuppressWarnings("unused")
				ClasseEleitoral classeEleitoral1 = new ClasseEleitoral(nome,endereço,cep,sexo,anonasceu,idade);
				
				// Tela final que exibe o conteudo de cada atributo da classe Carro
				System.out.println("===== Eleitor Cadastrado ======");
				System.out.println("Nome: " + eleitor.getNome() );
				System.out.println("Endereço: " + eleitor.getEndereço() );
				System.out.println("cep: " + eleitor.getCep() );
				System.out.println("sexo: " + eleitor.getSexo() );
				
				
				//Inserir na lista
				eleitores.add(eleitor);	
			
	
	}
	    }

	
