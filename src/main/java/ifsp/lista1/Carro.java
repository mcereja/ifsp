package ifsp.lista1;

import java.util.Scanner;

public class Carro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String marca;
		String modelo;
		int ano;
		String cor;
		
		System.out.println("==========================================");
		System.out.println("====       Cadastro  de  Carros       ====");
		System.out.println("==========================================");
		
		System.out.print("Informar a Marca: ");
		marca = scan.next();
		
		System.out.print("Informar o Modelo: ");
		modelo = scan.next();
		
		System.out.print("Informar o Ano: ");
		ano = scan.nextInt();
		
		System.out.print("Informar a Cor: ");
		cor = scan.next();
		
		System.out.println("==========================================");
		
		
		System.out.println("===== Carro Cadastrado ======");
		System.out.println("== Marca : " + marca);
		System.out.println("== Modelo: " + modelo);
		System.out.println("== Ano   : " + ano);
		System.out.println("== Cor   : " + cor);
		System.out.println("=============================");
		
		scan.close();
	}

}
