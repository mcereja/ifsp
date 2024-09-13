package ifsp.lista1;

import java.util.Scanner;

public class MediaFinalScanComIf {

	private static final String TRACO =
			"===========================================================";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, mediaFinal;
		String nomeAluno;
		
		System.out.println(TRACO);
		System.out.print("| Nome: ");
		nomeAluno=scan.next();
		System.out.println(TRACO);
		
		System.out.print("| Nota Avaliação 1: ");
		nota1=scan.nextDouble();
		
		System.out.print("| Nota Avaliação 2: ");
		nota2=scan.nextDouble();
		
		System.out.println(TRACO);
		mediaFinal=(nota1+nota2)/2;
		System.out.println("| Média Final: " + mediaFinal + "                                        |");
		System.out.println(TRACO);
		
		if (mediaFinal > 6) {
			System.out.println("Vocé foi aprovado");
		} else {
			System.out.println("Vocé foi reprovado");
		}
		
		scan.close();
	}

}
