package cofrinho.amparo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            System.out.println("\n=== Cofrinho de Moedas ===");
            System.out.println("1. Adicionar Moeda");
            System.out.println("2. Remover Moeda");
            System.out.println("3. Listar Moedas");
            System.out.println("4. Calcular total convertido em Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cofrinho.adicionar(scanner);
                    break;
                case 2:
                    cofrinho.remover(scanner);
                    break;
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                    System.out.println("Total convertido em Real: R$ " + cofrinho.totalConvertido());
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
