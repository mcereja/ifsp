// Eduardo Franco de Campos
// BV:3031292
package ifsp.av3.eduardo;

import java.util.Scanner;

public class SitEleitoralImpl {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		String nome, sexo,  endereco;
		int cep, anonascimento;

		
			
		do {
			System.out.println("Verifique sua Situação Eleitoral:");
			System.out.println("=====================");
			System.out.println("1- Informar dados para verificação");
			System.out.println("2- Finalizar");
			System.out.println("=====================");
			System.out.print("Opção: ");
			opcao = scan.nextInt();

			if (opcao == 1) {
				System.out.println("==========================================");
				System.out.println("Informar nome completo: ");
				nome = scan.next();
				
				System.out.println("Informar sexo: ");
				sexo = scan.next();
				
				System.out.println("Informar enderço: ");
				endereco = scan.next();
				
				System.out.println("Informar CEP: ");
				cep = scan.nextInt();
				
				System.out.println("Informar ano de nascimento: ");
				try {
				anonascimento = scan.nextInt();
				} catch (Exception e) {
					System.out.print("Informe o ano corretamente!");
				} finally {
				}
				
				
				SitEleitoral siteleitoral = new SitEleitoral();
				//System.out.println("Sua situação eleitoral é: " + siteleitoral.calcularSitEleitoral() );
			} else if (opcao != 2) {
				System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
			}

		} while (opcao < 2 || opcao >= 3);
		
		scan.close();
	}

	 public static String verificarSituacao(float idade){
	String classifica;{
    if (idade < 16){
        classifica = "Não eleitor";
    }
    else if ( idade >= 16 && idade <= 17){
        classifica = "Eleitor facultativo";
    }
    else if (idade >= 18 && idade <= 65){
        classifica = "Eleitor obrigatório";
    }
    else if (idade >= 65){
        classifica = "Eleitor facultativo";
    }
    else {
        classifica = "FALTA CLASSIFICAR";
    }
    return classifica;
	}
	
	
	 }



	}


