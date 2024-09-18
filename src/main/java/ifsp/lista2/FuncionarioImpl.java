package ifsp.lista2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FuncionarioImpl {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao=0;
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		do {
			System.out.println("Menu de Opções");
			System.out.println("=====================");
			System.out.println("1- Cadastrar Funcionário");
			System.out.println("2- Sair");
			System.out.println("=====================");
			System.out.print("Opção: ");
			opcao = scan.nextInt();

			if (opcao == 1){
				cadastrarFuncionario(scan, funcionarios);
			} else if (opcao != 2){
				System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
			}

		} while(opcao < 2 || opcao >= 3);

		// Tela final que exibe o conteudo de cada atributo da classe Carro
		System.out.println(funcionarios);
		JOptionPane.showMessageDialog(null, funcionarios);
				
		scan.close();
	}

	private static void cadastrarFuncionario(Scanner scan, List<Funcionario> funcionarios) {
		String nome;
		String cargo;
		double salario;
		
		// Cria o objeto Funcionario e permite utilizar suas funcionalidades
		Funcionario funcionarioObj = new Funcionario();
		
		System.out.println("================================================");
		System.out.println("====       Cadastro  de  Funcionários       ====");
		System.out.println("================================================");
		System.out.print("Informar o Nome: ");
		nome = scan.next();
		
		System.out.print("Informar o Cargo: ");
		cargo = scan.next();
		
		try {
			System.out.print("Informar o Salário: ");
			salario = scan.nextDouble();
			funcionarioObj.setSalario(salario);
		} catch (InputMismatchException ex) {
			System.err.print("Atenção! Informe apenas números no salário, e execute o programa novamente !! \n");
		} catch (Exception e) {
			System.err.print("Atenção!! Ocorreu um erro inesperado: " + e.getMessage() );
		}
		
		System.out.println("================================================");
		
		// Alimentando o conteúdo dos atributos da classe Carro
		funcionarioObj.setNome(nome);
		funcionarioObj.setCargo(cargo);
		
		// inserir na lista
		funcionarios.add(funcionarioObj);
		
	}

}
