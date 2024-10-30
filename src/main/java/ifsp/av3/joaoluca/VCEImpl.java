package ifsp.av3.joaoluca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VCEImpl extends VCE {
	//BV3028666 Luca S. Guedes
	//BV3028321 João Afonso D. Perussi
    private static final String TRACO =
            "==================================================================";
    private static final String TRACO2 =
            "------------------------------------------------------------------";

    public VCEImpl(String nome, String sexo, int anoNascimento, int cep) {
        super(nome, sexo, anoNascimento, cep, cep, sexo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VCE pessoa = null;
        int opcao = 0;

        do {
            System.out.println(TRACO);
            System.out.println("Verifica Classe Eleitoral");
            System.out.println("   VCE   ");
            System.out.println(TRACO);
            System.out.println("1-) Informar Dados");
            System.out.println("2-) Finalizar");
            System.out.println(TRACO);

            while (true) {
                System.out.print("Opção: ");
                try {
                    opcao = scanner.nextInt();
                    if (opcao < 1 || opcao > 2) {
                        throw new IllegalArgumentException("Opção inválida! Escolha 1 ou 2.");
                    }
                    break; // sair do loop se a opção for válida
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
                    scanner.next(); // limpar a entrada
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            switch (opcao) {
                case 1:
                    pessoa = informarDados(scanner);
                    if (pessoa != null) {
                        double vce = calcularVCE(pessoa.getAno(), 2024);
                        String situacao = determinarSituacao((int) vce);
                        System.out.printf("Sr(a) %s, sua situação eleitoral é: %s%n", pessoa.getNome(), situacao);
                    }
                    break;
                case 2:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 2);

        scanner.close();
    }

    private static double calcularVCE(int ano, int anoAtual) {
        return (anoAtual - ano);
    }

    private static VCE informarDados(Scanner scanner) {
        String nome;
        int anoNascimento;
        int cep;

        System.out.print("Nome: ");
        nome = scanner.next();

        while (true) {
        	//BV3028666 Luca S. Guedes
        	//BV3028321 João Afonso D. Perussi
            System.out.print("Ano de Nascimento: ");
            try {
                anoNascimento = scanner.nextInt();
                if (anoNascimento < 0) {
                    throw new IllegalArgumentException("Ano de nascimento não pode ser negativo.");
                }
                break; // sair do loop se o ano for válido
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro para o ano.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String sexo;
        while (true) {
            System.out.println("Sexo:");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            System.out.print("Escolha a opção (1 ou 2): ");
            try {
                int tipoOpcao = scanner.nextInt();
                if (tipoOpcao == 1) {
                    sexo = "Masculino";
                    break; // sair do loop se a opção for válida
                } else if (tipoOpcao == 2) {
                    sexo = "Feminino";
                    break; // sair do loop se a opção for válida
                } else {
                    System.out.println("Erro: Opção inválida. Por favor, digite 1 ou 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira 1 ou 2.");
                scanner.next();
            }
        }

        System.out.print("Endereço: ");
        String endereco = scanner.next(); // você pode querer ler a linha inteira

        while (true) {
            System.out.print("CEP: ");
            try {
                cep = scanner.nextInt();
                if (cep <= 0) {
                    throw new IllegalArgumentException("Número CEP incorreto.");
                }
                break; // sair do loop se o CEP for válido
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira o CEP corretamente.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return new VCEImpl(nome, sexo, anoNascimento, cep);
    }

    private static String determinarSituacao(int vce) {
        if (vce < 16) {
            return "Não eleitor";
        } else if (vce >= 16 && vce <= 17) {
            return "Eleitor Facultativo";
        } else if (vce >= 18 && vce <= 65) {
            return "Eleitor Obrigatório";
        } else {
            return "Eleitor Facultativo";
        }
    }
}
