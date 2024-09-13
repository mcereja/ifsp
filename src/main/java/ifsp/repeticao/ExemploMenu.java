package ifsp.repeticao;

import java.util.Scanner;

/**
 * @author MCereja
 */
public class ExemploMenu {

    public static void main(String args[]){
        int opcao=0;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("Exemplo Opções");
            System.out.println("=====================");
            System.out.println("1- Executa tarefa X");
            System.out.println("2- Verifica situação CNH");
            System.out.println("3- Sair");
            System.out.println("=====================");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            
            if (opcao == 1){
                System.out.println("EXECUTEI A TAREFA UM \n");
            }
            else if (opcao == 2){
                System.out.println("Sua situação é: " + verificarSituacao(17));
            }
            else if (opcao != 3){
                System.out.println("ATENÇÃO!!! OPÇÃO INVÁLIDA \n");
            }
            
        } while(opcao < 3 || opcao >= 4);
        
        scan.close();
        
    }
    
    // Método para retornar a situação da CNH
    public static String verificarSituacao(float idade){
        
        String classifica;
        if (idade < 18){
            classifica = "Não pode dirigir";
        }else if (idade >= 18 && idade <= 90.50){
            classifica = "Você está apto a dirigir";
        }
        else {
            classifica = "FALTA CLASSIFICAR";
        }
        return classifica;
        
    }
    
}
