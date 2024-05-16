package Models;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AeroportoEDAero aeroporto = new AeroportoEDAero();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar avião");
            System.out.println("2. Listar aviões cadastrados");
            System.out.println("3. Listar aviões cadastrados por letra");
            System.out.println("4. Autorizar decolagem");
            System.out.println("5. Decolar avião");
            System.out.println("6. Autorizar aterrissagem");
            System.out.println("7. Aterrissar avião");
            System.out.println("8. Listar próximas decolagens");
            System.out.println("9. Listar próximas aterrissagens");
            System.out.println("10. Relatório de operações");
            System.out.println("11. Buscar avião");
            System.out.println("12. Total de operações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do avião: ");
                    String idAviao = scanner.nextLine();
                    aeroporto.cadastraAviao(idAviao);
                    break;
                case 2:
                    aeroporto.avioesCadastrados();
                    break;
case 3:
                    System.out.print("Digite a letra inicial: ");
                    char letra = scanner.nextLine().charAt(0);
                    aeroporto.avioesCadastradosPorLetra(letra);
                    break;
                case 4:
                    System.out.print("Digite o ID do avião: ");
                    idAviao = scanner.nextLine();
                    aeroporto.autorizaDecolar(idAviao);
                    break;
                case 5:
                    aeroporto.decolar();
                    break;
                case 6:
                    System.out.print("Digite o ID do avião: ");
                    idAviao = scanner.nextLine();
                    aeroporto.autorizaAterrissar(idAviao);
                    break;
                case 7:
                    aeroporto.aterrissar();
                    break;
                case 8:
                    aeroporto.proximasDecolagens();
                    break;
                case 9:
                    aeroporto.proximasAterrissagens();
                    break;
                case 10:
                    aeroporto.relatorioAeroporto();
                    break;
                case 11:
                    System.out.print("Digite o ID do avião: ");
                    idAviao = scanner.nextLine();
                    aeroporto.buscaAviao(idAviao);
                    break;
                case 12:
                    aeroporto.totalOperacoes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}