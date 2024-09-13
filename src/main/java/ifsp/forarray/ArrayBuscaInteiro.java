package ifsp.forarray;

import java.util.Scanner;

/**
 * @author MCereja
 */

public class ArrayBuscaInteiro {

    public static void main(String[] args){
		int numeros[] = new int[8];
		int buscar;
		int ocorrencias=0;
		
      // Usuário entra com os dados de cada posição do array
		Scanner scan = new Scanner(System.in);
		for (int i=0; i < numeros.length; i++){
			System.out.println("Informe o número " + i + " : ");
			numeros[i] = scan.nextInt();
		}
		
		System.out.println("Informa o número a ser localizado: ");
		buscar = scan.nextInt();
		
		for ( int i=0; i < numeros.length; i++){
			if ( numeros[i] == buscar ){
				ocorrencias++;
            }
        }
				
		System.out.println("Registros encontrados: " + ocorrencias);
		scan.close();
		
	}
    
}