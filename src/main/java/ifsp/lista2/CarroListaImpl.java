package ifsp.lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CarroListaImpl {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcaoMenu=0;

		// Cria o objeto Carro e permite utilizar suas funcionalidades e a lista
		//Carro carro = new Carro();
		List<Carro> carros = new ArrayList<>();
		
		do {
			 System.out.println("Menu de Opções");
			 System.out.println("=====================");
			 System.out.println("1- Cadastrar Carros");
			 System.out.println("2- Finalizar");
			 System.out.println("=====================");
			 System.out.print("Opção: ");
			 opcaoMenu = scan.nextInt();
			 if (opcaoMenu == 1){
				 cadastrarCarro(scan, carros);
			 } else if (opcaoMenu != 2){
				 System.out.print("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
			 }
	            
		} while(opcaoMenu < 2 || opcaoMenu >= 3);
		
		// Tela final que exibe o conteudo de cada atributo da classe Carro
		for (Carro carroItem : carros) {
			System.out.println(carroItem);
		}
		
		JOptionPane.showMessageDialog(null, carros);

		scan.close();
	}

	private static void cadastrarCarro(Scanner scan, List<Carro> carros) {
		String marca;
		String modelo;
		int ano;
		String cor;
		Carro carro = new Carro();
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

		// Alimentando o conteúdo dos atributos da classe Carro
		
		carro.setMarca(marca);
		carro.setModelo(modelo);
		carro.setAno(ano);
		carro.setCor(cor);

		carros.add(carro);
	}

}
