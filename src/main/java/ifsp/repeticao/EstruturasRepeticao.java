package ifsp.repeticao;

import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main(String[] args) {

        /*
        ** Exemplo laco for -> Contador 
        */
        System.out.println("Exemplo laço for\n");
        for (int i=0; i < 5; i++){
            System.out.println("Contagem: " + i);
        }
        
        System.out.println("\n");

        /*
        ** Exemplo comando while
        */
        System.out.println("Exemplo comando while\n");
        int sequencia=0;
        while (sequencia < 7){
            System.out.println("Sequencia = " + sequencia);
            sequencia++;
        }
        
       /*
        ** Exemplo comando do while
        */
        System.out.println("Exemplo comando do while\n");
        int codigo = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite o codigo: ");
            codigo = scan.nextInt();
        } while (codigo < 1000);

        scan.close();

    }

}
