package ifsp.lista1;

public class MediaFinalVarStatic {

	private static final String TRACO =
			"===========================================================";
	private static final String nomeAluno = "Professor Marcelo";
	private static final double nota1 = 8.5;
	private static final double nota2 = 5.5;
	
	public static void main(String[] args) {
		System.out.println(TRACO);
		System.out.println("| Nome: " + nomeAluno + "                                 |");
		System.out.println(TRACO);
		System.out.println("| Nota Avaliação 1: " + nota1 + "                                   |");
		System.out.println("| Nota Avaliação 2: " + nota2 + "                                   |");
		System.out.println(TRACO);
		double mediaFinal=(nota1+nota2)/2;
		System.out.println("| Média Final: " + mediaFinal + "                                        |");
		System.out.println(TRACO);
	}

}
