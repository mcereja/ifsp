package ifsp.collections;

import java.util.HashMap;
import java.util.Map;

public class ExemploCollectionsMap {

	public static void main(String[] args) {
		// Primeiro dado e'a chave(key), e o segundo e'o valor(value)
		Map<String, Integer> items = new HashMap<>();
		items.put("Ana", 10);
		items.put("Bruna", 20);
		items.put("Carol", 30);
		items.put("Dani", 40);
		items.put("Elza", 50);
		items.put("Fran", 60);

		System.out.println("Número de itens na lista: " + items.size());
		System.out.println("Resultado da Lista: " + items);

		// Forma tradicional nao se aplica o Map não é uma estrutura indexada
		// Forma simplificada de percorrer os itens do Map, valor lado direito
		System.out.println("ITERAÇÃO POR VALUES:");
		for (Integer idade : items.values()) {
			System.out.println("Idade: " + idade);
		}

		//  items.keySet() retorna um Set com todas as chaves do Map, tornando possivel
		//  obter o valor associado
		System.out.println("\nITERAÇÃO POR KEYSET:");
		for (String nome : items.keySet()) {
			System.out.println("Nome: " + nome + ", Idade: " + items.get(nome));
		}

		// O Entry do Map permite obter a chave e valor separadamente
		System.out.println("\nITERAÇÃO POR ENTRY:");
		for (Map.Entry<String, Integer> mapa : items.entrySet()) {
			System.out.println("Chave: " + mapa.getKey() + ", Valor: " + mapa.getValue());
		}

		// A partir da Versão JAVA 8 LTS foram introduzidas funcionalidades mais elegantes
		//   de iteração usando recurso lambda e method reference
		System.out.println("\nITERAÇÃO FOREACH:");
		items.forEach((k,v)->System.out.println("Key: " + k + "  Value: " + v));
		
	}
}
