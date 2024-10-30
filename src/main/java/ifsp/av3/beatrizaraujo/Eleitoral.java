package ifsp.av3.beatrizaraujo;

//Beatriz Araujo bv:3030261
//impl
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.annotation.AnnotationTypeMismatchException;

public class  Eleitoral{

	private static final String String = null;
	private static final int Ano = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome, endereco, sexo;
		int ano,cep;
		int opcao;

		List<Eleitoral> Eleitoral = new ArrayList<Eleitoral>();

		do {
			System.out.println("==========================================");
			System.out.println(" 1- ENTRADA DE DADOS ");
			System.out.println(" 2- SAIR  ");
			System.out.println("==========================================");
			System.out.println("opcao:");
			opcao = scan.nextInt();

			if (opcao == 1) {
				System.out.println("ENTRADA DE DADOS ");

				System.out.print("Informar o Nome: ");
				nome = scan.next();

				System.out.print("Informar o endereco: ");
				endereco = scan.next();

				System.out.print("Informar a sexo: ");
				sexo = scan.next();

				System.out.print("Informar a ano de nascimento: ");
				ano = scan.nextInt();

				System.out.print("Informar a cep: ");
				cep = scan.nextInt();
                  
				ano = (int) (ano / Math.pow(2024, ano));
				System.out.println("Soma" + Math.pow(ano, 2024));
				System.out.println("| Ano:" + 2024);
				

				System.out.println("nome" + nome);
				System.out.println("==========================================");
				System.out.println("ano" + ano);
				System.out.println("==========================================");
				System.out.println("cep" + cep);
				System.out.println("==========================================");
				System.out.println("endereco" + endereco);
				System.out.println("==========================================");
				System.out.println("sexo" + sexo);
			}
			else if (opcao != 2) {
				System.out.println("Atencao!!! Opcao invalida");
			}
		} while (opcao < 3 || opcao >= 4);

		System.out.println("EleitoralImpl");
		JOptionPane.showMessageDialog(null, Eleitoral);
		   scan.close();
	}

	// Método para retornar a situação da Eleioral
	
		public static String verificarSituacao(float ano){
			
			String classifica;	
			if(Ano> 16) {
					classifica = "Nao Eleitor:";
			}else if (ano >= 16 && ano<=17){
				classifica = "Eleitor Facultativo:";
		}else if (ano >=18 && ano<=65){

			classifica = "Eleitor Obrigatorio";
	      }else if (ano <=65  ){
		classifica = "Eleitor Obrigtorio";
	   }
	    else{
		classifica = "FALTA CLASSIFICAR";
	   }
	      return classifica;
	   }
   
}