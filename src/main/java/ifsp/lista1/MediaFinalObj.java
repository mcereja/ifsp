package ifsp.lista1;

import java.util.Scanner;

public class MediaFinalObj {

	private static final String TRACO =
			"===========================================================";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println(TRACO);
		System.out.print("| Nome: ");
		aluno.setNome(scan.next());
		System.out.println(TRACO);
		
		System.out.print("| Nota Avaliação 1: ");
		//nota1=scan.nextDouble();
		
		System.out.print("| Nota Avaliação 2: ");
		//nota2=scan.nextDouble();
		
		System.out.println(TRACO);
		//mediaFinal=(nota1+nota2)/2;
		//System.out.println("| Média Final: " + mediaFinal + "                                        |");
		System.out.println(TRACO);
		scan.close();
	}

}
