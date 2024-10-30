package ifsp.av3.pedro;

//Pedro Tobias Mendes Netto
//BV 3028372

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClasseEleitoralImpl {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao=0;

		List<ClasseEleitoral> eleitor = new ArrayList<ClasseEleitoral>();

		do {
			System.out.println("Verificar Classe Eleitoral");
			System.out.println("=====================");
			System.out.println("1- Informar Dados");
			System.out.println("2- Finalizar");
			System.out.println("=====================");
			System.out.print("Opção: ");
			opcao = scan.nextInt();

			if (opcao == 1){
				cadastrarUsuario(scan,eleitor);
			}  else if (opcao != 2){
				System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
			}

		} while(opcao < 2 || opcao >= 3);

		// Tela final que exibe o conteudo de cada atributo da classe Carro
		JOptionPane.showMessageDialog(null, eleitor);	

		scan.close();
	}
	private static void cadastrarUsuario(Scanner scan, List<ClasseEleitoral> eleitor) {
		String Nome = null, Endereco = null, Sexo = null, SituaEleit = null;
		int AnoDeNascimento = 0;
		double Cep = 0;

		// Cria o objeto Classe Eleitoral e permite utilizar suas funcionalidades
		ClasseEleitoral eleitores = new ClasseEleitoral();

		System.out.println("==========================================");
		System.out.println("====          Seu Cadastro            ====");
		System.out.println("==========================================");
		System.out.print("Informar o seu nome: ");
		Nome = scan.next();

		System.out.print("Informar o endereço: ");
		Endereco = scan.next();


		System.out.print("Informar o CEP: ");
		Cep = scan.nextDouble();

		System.out.print("Informar seu Sexo: ");
		Sexo = scan.next();

		try {
			System.out.print("Informar o Ano de Nascimento: ");
			AnoDeNascimento = scan.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Informe o ano corretamente");
		}
		catch (Exception e){
			System.out.println("Ocorreu um erro, tente novamente");
		}

		if(eleitores.calcularIdade()<16){
			SituaEleit ="Não Eleitor";
		}
		if(eleitores.calcularIdade()>=16 && eleitores.calcularIdade()<=17) {
			SituaEleit ="Eleitor Facultativo";
		}
		if(eleitores.calcularIdade()>=18 && eleitores.calcularIdade()<=65) {
			SituaEleit ="Eleitor Obrigatório";
		}
		if(eleitores.calcularIdade()>65) {
			SituaEleit ="Eleitor Facultativo";
		}

		System.out.println("==========================================");



		// Alimentando o conteúdo dos atributos da classe Carro
		eleitores.setNome(Nome);
		eleitores.setEndereco(Endereco);
		eleitores.setCep(Cep);
		eleitores.setSexo(Sexo);
		eleitores.setAnoDeNascimento(AnoDeNascimento);
		eleitores.setSituaEleit(SituaEleit);

		//Inserir na lista
		eleitor.add(eleitores);
	} 
}
