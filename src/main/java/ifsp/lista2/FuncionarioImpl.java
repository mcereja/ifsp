package ifsp.lista2;

import java.util.Scanner;

public class FuncionarioImpl {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String nome;
		String cargo;
		double salario;
		
		// Cria o objeto Carro e permite utilizar suas funcionalidades
		Funcionario funcio = new Funcionario();
		
		System.out.println("================================================");
		System.out.println("====       Cadastro  de  Funcionários       ====");
		System.out.println("================================================");
		System.out.print("Informar o Nome: ");
		nome = scan.next();
		
		System.out.print("Informar o Cargo: ");
		cargo = scan.next();
		
		System.out.print("Informar o Salário: ");
		salario = scan.nextDouble();
		
		System.out.println("================================================");
		
		// Alimentando o conteúdo dos atributos da classe Carro
		funcio.setNome(nome);
		funcio.setCargo(cargo);
		funcio.setSalario(salario);
		
		// Tela final que exibe o conteudo de cada atributo da classe Carro
		System.out.println(funcio);
		
		scan.close();
	}

}
