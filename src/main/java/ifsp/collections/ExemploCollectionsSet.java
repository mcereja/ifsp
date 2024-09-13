package ifsp.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploCollectionsSet {

	public static void main(String[] args) {
		Set<String> setNomes = new HashSet<>();
		setNomes.add("Lizias");
		setNomes.add("Ana Clara");
		setNomes.add("Yana Clean");
		setNomes.add("Marília Cruz");
		setNomes.add("Lizias");
		setNomes.add("Francisco");
		setNomes.add("Claudia");

		System.out.println("Número de itens na lista: " + setNomes.size());
		System.out.println("Resultado da Lista: " + setNomes);

		//  Iteração com índice não é aplicável diretamente a Set como usamos em List
		//   por isso, nao usamos o for tradicional nessa iteracao 
		for (Iterator<String> it = setNomes.iterator(); it.hasNext(); ) {
		    String nome = it.next();
		    System.out.println("Iterator: " + nome);
		}
		
		// Forma simplificada de percorrer os itens do Set
		for (String nome : setNomes) {
				System.out.println("Nome: " + nome );
		}
		
	// A partir da Versão JAVA 8 LTS foram introduzidas funcionalidades mais elegantes
	//   de iteração usando recurso lambda e method reference 
		
	}
}
