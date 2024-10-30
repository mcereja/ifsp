// Saymon Peixoto da Silva BV: 3028607
package ifsp.av3.saymon;

import java.util.Scanner;

public class VerificaClasseEleitoral {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        int opcao;

        do {
            System.out.println("Verifica Classe Eleitoral");
            System.out.println("===========================");
            System.out.println("1. Informar Dados");
            System.out.println("2. Finalizar");
            System.out.println("===========================");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    pessoa.setNome(scanner.nextLine());
                    System.out.print("Endereço: ");
                    pessoa.setEndereco(scanner.nextLine());
                    System.out.print("CEP: ");
                    pessoa.setCep(scanner.nextLine());
                    System.out.print("Sexo: ");
                    pessoa.setSexo(scanner.nextLine());
                    System.out.print("Ano de Nascimento: ");
                    pessoa.setAnoNascimento(scanner.nextInt());
                    scanner.nextLine(); // Consumir a nova linha

                    int idade = calcularIdade(pessoa.getAnoNascimento());
                    String situacaoEleitoral = verificarSituacaoEleitoral(idade);
                    String mensagem = formatarMensagem(pessoa.getNome(), situacaoEleitoral);
                    System.out.println(mensagem);
                    break;
                case 2:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 2);

        scanner.close();
    }

    // Método para calcular a idade
    public static int calcularIdade(int anoNascimento) {
        // seuNome BV
        int anoAtual = 2024;
        return anoAtual - anoNascimento;
    }

    // Método para verificar a situação eleitoral
    public static String verificarSituacaoEleitoral(int idade) {
        // seuNome BV
        if (idade < 16) {
            return "Não Eleitor";
        } else if (idade >= 16 && idade <= 17) {
            return "Eleitor Facultativo";
        } else if (idade >= 18 && idade <= 65) {
            return "Eleitor Obrigatório";
        } else {
            return "Eleitor Facultativo";
        }
    }

    // Método para formatar a mensagem
    public static String formatarMensagem(String nome, String situacaoEleitoral) {
        // Saymon Peixoto da Silva BV: 3028607
        return "Sr. " + nome + " sua situação eleitoral é: " + situacaoEleitoral + ".";
    }
}