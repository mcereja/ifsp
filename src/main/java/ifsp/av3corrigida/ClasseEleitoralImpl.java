package ifsp.av3corrigida;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClasseEleitoralImpl {

    public static void main(String[] args){
        int opcao=0;
        Scanner scan = new Scanner(System.in);
        List<ClasseEleitoral> classesEleitorais = 
                new ArrayList<ClasseEleitoral>();
        
        do {
            System.out.println("Verifica Classe Eleitoral");
            System.out.println("=========================");
            System.out.println("1- Informar Dados");
            System.out.println("2- Sair");
            System.out.println("=========================");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            
            if (opcao == 1){
                informarDados(scan, classesEleitorais);
            }
            else if (opcao != 2){
                System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
            }
            
        } while(opcao < 2 || opcao >= 3);
        
        JOptionPane.showMessageDialog(null, classesEleitorais);
        scan.close();
    }
    
    private static void informarDados(Scanner scan, List<ClasseEleitoral> classesEleitorais) {
	String nome;
        String endereco;
        String cep;
        String sexo;
        int anoNascimento;
		
	// Cria o objeto e permite utilizar suas funcionalidades
	ClasseEleitoral classeObj = new ClasseEleitoral();
		
	System.out.println("==============================================");
	System.out.println("====       Informa Dados Eleitorais       ====");
	System.out.println("==============================================");
	System.out.print("Informar o Nome: ");
	nome = scan.next();
		
	System.out.print("Informar o Endereço: ");
	endereco = scan.next();
		
        System.out.print("Informar o CEP: ");
	cep = scan.next();
        
        System.out.print("Informar o Sexo: ");
	sexo = scan.next();
        
	try {
		System.out.print("Informar o Ano de Nascimento: ");
		anoNascimento = scan.nextInt();
		classeObj.setAnoNascimento(anoNascimento);
	} catch (InputMismatchException ex) {
		System.err.print("Atenção! Informe apenas números no ano, e execute o programa novamente !! \n");
	} catch (Exception e) {
		System.err.print("Atenção!! Ocorreu um erro inesperado: " + e.getMessage() );
	}
		
	System.out.println("================================================");
		
	// Alimentando o conteúdo dos atributos da classe Carro
	classeObj.setNome(nome);
	classeObj.setEndereco(endereco);
        classeObj.setSexo(sexo);
        classeObj.setCep(cep);
		
	// inserir na lista
	classesEleitorais.add(classeObj);
        int idade = classeObj.calcularIdade(classeObj.getAnoNascimento());
        System.out.println(classeObj.verificarClasseEleitoral(idade));
        
	}
}
