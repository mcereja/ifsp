package ifsp.av3.oliver;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class DeveVotarImpl {public static void main (String [] args){
	Scanner scan = new Scanner(System.in) ;
	int esco=0;
	// Cria o objeto eleitor e permite utilizar suas funcionalidades//Oliver Rezende Celini bv:3028402
	List<DeveVotar> eleitor = new ArrayList<DeveVotar>();
	do {
		System.out.println("=====================================================");
		System.out.println("====       Verificador de Classe Eleitoral       ====");
		System.out.println("=====================================================");
		System.out.println("escolha uma opção para prosseguir");
		System.out.println("1) imformar Dados");
		System.out.println("2) sair");
		System.out.println(" digite a opção para prosseguir:");
		esco = scan.nextInt();
	if (esco == 1){
		CadastrarEleitor(scan,eleitor);
	} else if (esco != 2){
		System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
	}

}while(esco < 2 || esco >= 3);
	System.out.println(eleitor);
	JOptionPane.showMessageDialog(null,eleitor);
	scan.close();}
public static void CadastrarEleitor(Scanner scan, List<DeveVotar> dadoseleitor){
		  String nome, sexo , endereco ,cep; 
		  int anodn=0, anoat=2024;
		
		
	DeveVotar eleitorobj = new DeveVotar();
			System.out.println("=====================================================");
			System.out.println("====       Verificador de Classe Eleitoral       ====");
			System.out.println("=====================================================");
			System.out.print("Informar a Marca: ");
			nome = scan.next();
			System.out.print("Informar o sexo: ");
			sexo= scan.next();
			System.out.print("Informar o endereço: ");
			endereco= scan.next();
			System.out.print("Informar o cep: ");
			cep= scan.next();
			System.out.print("Informar o Ano: ");
			anodn= scan.nextInt();
		
		
			

}}
