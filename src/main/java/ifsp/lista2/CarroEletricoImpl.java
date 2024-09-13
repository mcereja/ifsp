package ifsp.lista2;

import java.util.Scanner;

public class CarroEletricoImpl {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String marca;
		String modelo;
		int ano;
		String cor;
		
		// Cria o objeto Carro e permite utilizar suas funcionalidades
		CarroEletrico carro = new CarroEletrico();
		
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
		
		System.out.print("Tipo da Bateria: ");
		carro.setTipoBateria(scan.next());
		
		System.out.println("==========================================");
		
		// Alimentando o conteúdo dos atributos da classe Carro
		carro.setMarca(marca);
		carro.setModelo(modelo);
		carro.setAno(ano);
		carro.setCor(cor);
		
		// Tela final que exibe o conteudo de cada atributo da classe Carro
		System.out.println("===== Carro Cadastrado ======");
		System.out.println("Marca: " + carro.getMarca() );
		System.out.println("Modelo: " + carro.getModelo() );
		System.out.println("Ano: " + carro.getAno() );
		System.out.println("Cor: " + carro.getCor() );
		System.out.println("=============================");
		
		scan.close();
	}

}
