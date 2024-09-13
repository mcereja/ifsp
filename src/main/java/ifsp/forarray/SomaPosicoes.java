package ifsp.forarray;

/**
 * @author MCereja
 */
public class SomaPosicoes {
    public static void main(String args[]){
        int arrayDez[] = new int[10];
        int valor = 0;
        
        for (int i=0; i < arrayDez.length; i++){
            valor += 10;
            arrayDez[i] = valor;
        }
        
        // Soma de todas as posições do array
        int somatoria = 0;
        for (int i=0; i < arrayDez.length; i++){
            somatoria += arrayDez[i];
        }
        
        System.out.println("Soma é: " + somatoria );
        
        // Se quisermos exibir o conteúdo de cada posição do array
        for (int i=0; i < arrayDez.length; i++){
            System.out.println("Posição " + i + ": " + arrayDez[i]);
        }
    }
}