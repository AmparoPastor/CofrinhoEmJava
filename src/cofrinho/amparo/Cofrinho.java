package cofrinho.amparo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {
    private ArrayList<Coin> listaCoins;

    public Cofrinho() {
        listaCoins = new ArrayList<>();
    }

    public void adicionar(Scanner scanner) {
        System.out.println("Escolha a moeda para adicionar:");
        System.out.println("1. Real");
        System.out.println("2. Dolar");
        System.out.println("3. Peso Mexicano");
        int tipo = scanner.nextInt();

        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();
        Coin coin = null;

        switch (tipo) {
            case 1:
                coin = new Real(valor);
                break;
            case 2:
                coin = new Dolar(valor);
                break;
            case 3:
                coin = new PesoMexicano(valor);
                break;
            default:
                System.out.println("Tipo inválido!");
                return;
        }

        listaCoins.add(coin);
        System.out.println("Moeda adicionada com sucesso!");
    }

    public void remover(Scanner scanner) {
        System.out.println("Digite a posição da moeda a ser removida:");
        listagemMoedas();
        int index = scanner.nextInt();

        if (index >= 0 && index < listaCoins.size()) {
            listaCoins.remove(index);
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void listagemMoedas() {
        if (listaCoins.isEmpty()) {
            System.out.println("Nenhuma moeda no cofrinho.");
        } else {
            for (int i = 0; i < listaCoins.size(); i++) {
                System.out.println(i + ". " + listaCoins.get(i).info());
            }
        }
    }

    public double totalConvertido() {
        double total = 0;
        for (Coin coin : listaCoins) {
            total += coin.converter();
        }
        return total;
    }
}
