package ifsp.collections;

import java.util.ArrayList;
import java.util.List;

public class ExemploCollectionsList {

	public static void main(String[] args) {
		List<String> listaNomes = new ArrayList<String>();
		listaNomes.add("Lízias");
		listaNomes.add("Ana Clara");
		listaNomes.add("Yana Clean");
		listaNomes.add("Marília Cruz");
		listaNomes.add("Lízias");
		listaNomes.add("Francisco");

		System.out.println("Número de itens na lista: " + listaNomes.size());
		System.out.println("Resultado da Lista: " + listaNomes);

		// Forma tradicional de percorrer os itens da lista
		for (int i=0; i < listaNomes.size(); i++) {
			System.out.println("Ordem: " + i + " Nome: " + listaNomes.get(i) );
		}
		
		// Forma simplificada de percorrer os itens da lista
		for (String nome : listaNomes) {
				System.out.println("Nome: " + nome + " - " + listaNomes.indexOf(nome) );
		}
		
	// A partir da Versão JAVA 8 LTS foram introduzidas funcionalidades mais elegantes
	//   de iteração usando recurso lambda e method reference 
		
	}
}
